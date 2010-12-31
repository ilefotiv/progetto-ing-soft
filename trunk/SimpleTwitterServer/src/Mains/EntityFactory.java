package Mains;

import EntityCondivise.ENotaCondivisaImp;
import EntityCondivise.EUtenteCondivisoImp;
import Ice.Object;

public class EntityFactory implements Ice.ObjectFactory {

	@Override
	public Object create(String type) {
		 System.out.println("EntityFactory: Individuata una Entity da Istanziare");
		 if (type.equals(TwitterSimpleClient.EntityCondivise.ENotaCondivisa.ice_staticId())) {  
			 System.out.println("\t Entity Factory Istanzio un NotaCondiva");
			 return new ENotaCondivisaImp(); 
	        }
		 if (type.equals(TwitterSimpleClient.EntityCondivise.EUtenteCondiviso.ice_staticId())) {
			 System.out.println("\t Entity Factory Istanzio un UtenteCondiva");   
			 return new EUtenteCondivisoImp(); 
	        }
	        assert(false); 
	        return null; 
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

}
