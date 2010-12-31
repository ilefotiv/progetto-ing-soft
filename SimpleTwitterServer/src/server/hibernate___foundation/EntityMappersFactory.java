package server.hibernate___foundation;

import EntityCondivise.ENotaCondivisaImp;
import EntityCondivise.EUtenteCondivisoImp;
import TwitterSimpleClient.EntityCondivise.*;


public class EntityMappersFactory {

	private static EntityMappersFactory instance=null;
	
	protected EntityMappersFactory()
	{
	}
	public static EntityMappersFactory getInstance()
	{
		if(EntityMappersFactory.instance==null)
		{
			EntityMappersFactory.instance=new EntityMappersFactory();
		}
		return EntityMappersFactory.instance;
	}
	/**
	 * 
	 * @param entity
	 * @return 
	 */
	public  EntityCondivisa HibernateToIceFactory(EntityServer entity) {
		if(entity.getClass().toString().equals(ENota.class.toString()))
		{
			return ENotaConcreteMapper.getInstance().HibernateToIceFactory(entity);
		}
		if(entity.getClass().toString().equals(EUtente.class.toString()))
		{
			return EUtenteConcreteMapper.getInstance().HibernateToIceFactory(entity);
		}
		return null;
		
	}

	/**
	 * 
	 * @param entity
	 * @return 
	 */
	public  EntityServer IceToHibernateFactory(EntityCondivisa entity) {
		
		if(entity.getClass().toString().equals(ENotaCondivisaImp.class.toString()))
		{
			
			return ENotaConcreteMapper.getInstance().IceToHibernateFactory(entity);
		}
		if(entity.getClass().toString().equals(EUtenteCondivisoImp.class.toString()))
		{
			return EUtenteConcreteMapper.getInstance().IceToHibernateFactory(entity);
		}
		return null;
	}

}