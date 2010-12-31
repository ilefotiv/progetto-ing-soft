package presentation;

import interfacceCondivise.ProxieFactory;
import TwitterSimpleClient.EntityCondivise.*;
import TwitterSimpleClient.InterfacceCondivise.AuthtenticationPrx;
import EntityCondivise.*;
import android.app.Application;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Message;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.widget.Toast;
// questa classe rappresenta l'applicazione, è il livello piu basso 
// di gestione di un applicazione android e non fa va confusa con 
// il concetto di activity
public class SimpleTwitterClient extends Application
{
	 private static Ice.Communicator IceCommunicator; // oggetto Ice 
	 private boolean _initialized; //variabile che indica lo stato dell'oggetto Ice
	 private Ice.LocalException _ex; 
	 private static SimpleTwitterClient instance=null;
	 private static EUtenteCondivisoImp utente=null;
    
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
        this.initializeCommunicator();
        
        SimpleTwitterClient.instance=this;
        // qui lo vado a riprendere dal db l'host la porta e il protoccolo
        SharedPreferences pref=getSharedPreferences("impostazioni",  MODE_PRIVATE);
        if(!pref.contains("started"))
        {
        	this.Toast("non trovato started", 400);
        	pref.edit().putString("started", "true").commit();
        	pref.edit().putString("host", "192.168.0.103").commit();
        	pref.edit().putString("port", "10400").commit();
        	pref.edit().putString("protocol", "tcp").commit();
        }
        ProxieFactory.setHost(pref.getString("host","192.168.0.103"));
        ProxieFactory.setPort(pref.getString("port", "10400"));
        ProxieFactory.setProtocol(pref.getString("protocol", "tcp"));
    }
    
    /** Called when the application is stopping. */
    @Override
    public void onTerminate()
    {
        super.onTerminate();
        if(IceCommunicator != null)
        {
            try
            {
            	// mi assicuro che alla chiusura dell'applicazione
            	// l'oggetto Ice sia chiuso
                IceCommunicator.destroy();
            }
            catch(Ice.LocalException ex)
            {
            	ex.printStackTrace();
            }
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
            communicator = Ice.Util.initialize();
            communicator.addObjectFactory(new EntityFactory(), ENotaCondivisa.ice_staticId());
            communicator.addObjectFactory(new EntityFactory() , EUtenteCondiviso.ice_staticId());
            SimpleTwitterClient.IceCommunicator = communicator;
        }
        catch(Ice.LocalException ex)
        {
            Log.e("local exceptions", ex.ice_name());
        }
    }
    public static Ice.Communicator getCommunicator()
    {
    	return SimpleTwitterClient.IceCommunicator;
    }
    public static SimpleTwitterClient getInstance() {
		
		return SimpleTwitterClient.instance;
	}
    public static EUtenteCondivisoImp getUtente() {
		return utente;
	}

	public static void setUtente(EUtenteCondivisoImp utente) {
		SimpleTwitterClient.utente = utente;
	}
	public void Toast(String text, int duration)
	{
		Context context = getApplicationContext();
		Toast toast = Toast.makeText(context, text, duration);
		toast.show();
	}
	
}
