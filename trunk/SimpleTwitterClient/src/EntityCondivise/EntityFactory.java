package EntityCondivise;

import Ice.Object;
import TwitterSimpleClient.EntityCondivise.ENotaCondivisa;
import TwitterSimpleClient.EntityCondivise.EUtenteCondiviso;

public class EntityFactory implements Ice.ObjectFactory {

	@Override
	public Object create(String type) {
		 if (type.equals(ENotaCondivisa.ice_staticId())) { 
	            return new ENotaCondivisaImp(); 
	        }
		 if (type.equals(EUtenteCondiviso.ice_staticId())) { 
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
