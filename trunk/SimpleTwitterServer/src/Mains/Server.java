package Mains;
import javax.swing.SwingUtilities;

import Servants.AuthenticationI;
import Servants.noteManagerI;
import Servants.utenteManagerI;
import TwitterSimpleClient.EntityCondivise.ENotaCondivisa;
import TwitterSimpleClient.EntityCondivise.EUtenteCondiviso;

public class Server { 
    public static void 
    main(String[] args) 
    { 
    	// facio partire l'interfaccia
    	Runnable gui=new Runnable() {
			
			@Override
			public void run() {
				serverGui.main(null);
			}
		};
        int status = 0; 
        Ice.Communicator ic = null;  
        try { 
            ic = Ice.Util.initialize(args); 
            ic.addObjectFactory(new EntityFactory(), ENotaCondivisa.ice_staticId());
            ic.addObjectFactory(new EntityFactory() , EUtenteCondiviso.ice_staticId());
            Ice.ObjectAdapter adapter=ic.createObjectAdapterWithEndpoints("SimplePrinterAdapter", "default -p 10400"); 
            Ice.Object auth= new AuthenticationI();
            Ice.Object noteManager= new noteManagerI();
            Ice.Object utenteManager=new utenteManagerI();
            adapter.add( auth, ic.stringToIdentity("Authenticator"));
            adapter.add( noteManager,ic.stringToIdentity("noteManager"));
            adapter.add(utenteManager, ic.stringToIdentity("utenteManager"));
            adapter.activate();
            Thread g= new Thread(gui);
            //g.start();
            ic.waitForShutdown(); 
        } catch (Ice.LocalException e) {  
            e.printStackTrace(); 
            status = 1; 
        } catch (Exception e) { 
            System.err.println(e.getMessage()); 
            status = 1; 
        } 
        if (ic != null) { 
            // Clean up 
            // 
            try { 
                ic.destroy(); 
            } catch (Exception e) { 
                System.err.println(e.getMessage()); 
                status = 1; 
            } 
        } 
        System.exit(status); 
    } 
}