package com.zeroc.hello;

import android.app.Application;
// questa classe rappresenta l'applicazione, è il livello piu basso 
// di gestione di un applicazione android e non fa va confusa con 
// il concetto di activity
public class HelloApp extends Application
{
	 private Ice.Communicator _communicator; // oggetto Ice 
	 private boolean _initialized; //variabile che indica lo stato dell'oggetto Ice
	 private Ice.LocalException _ex; 
	 private CommunicatorCallback _cb;// callback Ice
    
	 // interfaccia dell'oggetto di callback
	 interface CommunicatorCallback
    {
        void onWait();
        void onCreate(Ice.Communicator communicator);
        void onError(Ice.LocalException ex);
    }

    /** Called when the application is starting, before any other application objects have been created. */
    @Override
    public void onCreate()
    {
        super.onCreate();
        // l'inizializzazione della connessione ssl viene eseguita
        // in modalità asincrona potrebbe richiedere più tempo
        new Thread(new Runnable()
        {
            public void run()
            {
                initializeCommunicator();
            }
        }).start();
    }
    
    /** Called when the application is stopping. */
    @Override
    public void onTerminate()
    {
        super.onTerminate();
        if(_communicator != null)
        {
            try
            {
            	// mi assicuro che alla chiusura dell'applicazione
            	// l'oggetto Ice sia chiuso
                _communicator.destroy();
            }
            catch(Ice.LocalException ex)
            {
            	ex.printStackTrace();
            }
        }
    }
    
    public void setCommunicatorCallback(CommunicatorCallback cb)
    {
        if(_initialized)
        {
            if(_ex != null)
            {
                cb.onError(_ex);
            }
            else
            {
                cb.onCreate(_communicator);
            }
        }
        else
        {
            _cb = cb;
            _cb.onWait();
        }
    }
    
    // inizializzazione di tutto il run time di ICE
    // al posto di questo inseriamo l'inizializzazione basilare
    // in modo da mantenere la semplicità 
    private void initializeCommunicator()
    {
        try
        {
            Ice.Communicator communicator;
            /*Ice.InitializationData initData = new Ice.InitializationData();
            initData.properties = Ice.Util.createProperties();
            initData.properties.setProperty("Ice.Trace.Network", "3");
            initData.properties.setProperty("IceSSL.Trace.Security", "3");
            initData.properties.setProperty("IceSSL.KeystoreType", "BKS");
            initData.properties.setProperty("IceSSL.TruststoreType", "BKS");
            initData.properties.setProperty("IceSSL.Password", "password");
            initData.properties.setProperty("Ice.InitPlugins", "0");
            initData.properties.setProperty("Ice.Plugin.IceSSL", "IceSSL.PluginFactory");*/
            communicator = Ice.Util.initialize();

            //IceSSL.Plugin plugin = (IceSSL.Plugin)communicator.getPluginManager().getPlugin("IceSSL");
            // Be sure to pass the same input stream to the SSL plug-in for
            // both the keystore and the truststore. This makes startup a
            // little faster since the plugin will not initialize
            // two keystores.
           /* java.io.InputStream certs = getResources().openRawResource(R.raw.certs); 
            plugin.setKeystoreStream(certs);
            plugin.setTruststoreStream(certs);

            communicator.getPluginManager().initializePlugins();*/
            
            synchronized(this)
            {
                _communicator = communicator;
                if(_cb != null)
                {
                    _cb.onCreate(_communicator);
                }
                _initialized = true;
            }
        }
        catch(Ice.LocalException ex)
        {
            synchronized(this)
            {
                if(_cb != null)
                {
                    _cb.onError(ex);
                }
                _ex = ex;
                _initialized = true;
            }
        }
    }
}
