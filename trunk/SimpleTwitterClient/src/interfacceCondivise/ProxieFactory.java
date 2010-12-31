package interfacceCondivise;

import android.util.Log;
import presentation.SimpleTwitterClient;
import IceGrid.IceBoxDescriptor;
import TwitterSimpleClient.InterfacceCondivise.*;

public class ProxieFactory {
	private static String host=null;
	private static String port=null;
	private static String protocol=null;
	private static DeliveryMode comunication=DeliveryMode.TWOWAY;
	enum DeliveryMode
    {
        TWOWAY,
        TWOWAY_SECURE,
        ONEWAY,
        ONEWAY_BATCH,
        ONEWAY_SECURE,
        ONEWAY_SECURE_BATCH,
        DATAGRAM,
        DATAGRAM_BATCH;

        Ice.ObjectPrx apply(Ice.ObjectPrx prx)
        {
            switch (this)
            {
            case TWOWAY:
                prx = prx.ice_twoway();
                break;
            case TWOWAY_SECURE:
                prx = prx.ice_twoway().ice_secure(true);
                break;
            case ONEWAY:
                prx = prx.ice_oneway();
                break;
            case ONEWAY_BATCH:
                prx = prx.ice_batchOneway();
                break;
            case ONEWAY_SECURE:
                prx = prx.ice_oneway().ice_secure(true);
                break;
            case ONEWAY_SECURE_BATCH:
                prx = prx.ice_batchOneway().ice_secure(true);
                break;
            case DATAGRAM:
                prx = prx.ice_datagram();
                break;
            case DATAGRAM_BATCH:
                prx = prx.ice_batchDatagram();
                break;
            }
            return prx;
        }
       

        public boolean isBatch()
        {
            return this == ONEWAY_BATCH || this == DATAGRAM_BATCH || this == ONEWAY_SECURE_BATCH;
        }
    }
	
	public ProxieFactory()
	{
		
	}
	public static String getHost() {
		return host;
	}

	public static void setHost(String host) {
		ProxieFactory.host = host;
	}

	public static String getPort() {
		return port;
	}
	public static void setPort(String port) {
		ProxieFactory.port = port;
	}
	public static String getProtocol() {
		return protocol;
	}
	public static void setProtocol(String protocol) {
		ProxieFactory.protocol = protocol;
	}
	public static Ice.ObjectPrx factoryMethod(String id ,String host,String port,DeliveryMode comunication)
	{
		if(host==null)
			host=ProxieFactory.host;
		if(port==null)
			port=ProxieFactory.port;
		if(comunication==null)
			comunication=ProxieFactory.comunication;
		String proxieString=id+":"+ProxieFactory.protocol+" -h " + host + " -p "+port;
		Ice.ObjectPrx prx=null;
		Log.i("halt", proxieString);
		try
		{
			Ice.Communicator com=SimpleTwitterClient.getCommunicator();
			prx=com.stringToProxy(proxieString);
			prx=comunication.apply(prx);
			Log.i("halt", "subito prima del checkedcast");
			
		}
		catch(Ice.LocalException ex)
		{
			ex.printStackTrace();
		}
		
		if(id.equals("Authenticator"))
		{
			try
			{
				AuthtenticationPrx auth= AuthtenticationPrxHelper.checkedCast(prx);
				Log.i("halt", "checkedcast effettuato");
				if(auth == null) 
					throw new Error("Invalid proxy");
				return auth;
			}catch(Ice.LocalException ex)
			{
				ex.printStackTrace();
			}
		}
		if(id.equals("noteManager"))
		{
			try
			{
				noteManagerPrx nm= noteManagerPrxHelper.checkedCast(prx);
				Log.i("halt", "checkedcast effettuato");
				if(nm == null) 
					throw new Error("Invalid proxy");
				return nm;
			}catch(Ice.LocalException ex)
			{
				ex.printStackTrace();
			}
		}
		if(id.equals("utenteManager"))
		{
			try
			{
				utenteManagerPrx um= utenteManagerPrxHelper.checkedCast(prx);
				Log.i("halt", "checkedcast effettuato");
				if(um == null) 
					throw new Error("Invalid proxy");
				return um;
			}catch(Ice.LocalException ex)
			{
				ex.printStackTrace();
			}
		}
		return null;
	}
}
