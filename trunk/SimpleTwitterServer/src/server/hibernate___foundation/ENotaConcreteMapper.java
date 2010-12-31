package server.hibernate___foundation;

import org.orm.PersistentException;

import TwitterSimpleClient.EntityCondivise.*;
import EntityCondivise.*;

public class ENotaConcreteMapper extends EntityMappersFactory {

	private static ENotaConcreteMapper instance=null;

	public ENotaConcreteMapper()
	{
		
	}
	
	public static ENotaConcreteMapper getInstance()
	{
		if(ENotaConcreteMapper.instance==null)
		{
			ENotaConcreteMapper.instance=new ENotaConcreteMapper();
		}
		return ENotaConcreteMapper.instance;
	}
	/** s
	 * 
	 * @param entity
	 */
	public EntityCondivisa  HibernateToIceFactory(EntityServer entity) {
		ENota nota=(ENota)entity;
		EUtente utente=nota.getScrittaDa();
		EUtenteCondivisoImp utenteCondiviso=(EUtenteCondivisoImp) EUtenteConcreteMapper.getInstance().HibernateToIceFactory(utente);
		
		ENotaCondivisaImp notaCondivisaImp = new ENotaCondivisaImp(nota.getId(),
																   nota.getContent(),
																   nota.getData(),
																   utenteCondiviso);
		return notaCondivisaImp;
	}

	/**
	 * 
	 * @param entity
	 */
	public EntityServer IceToHibernateFactory(EntityCondivisa entity) {
		ENota nota = new ENota();
		EUtente autore= new EUtente();
		ENotaCondivisaImp notaIce= (ENotaCondivisaImp) entity;
		EUtenteCondivisoImp autoreIce=(EUtenteCondivisoImp) notaIce.getScrittaDa();
		try {
			EUtenteCriteria eCriteria= new EUtenteCriteria();
			eCriteria.id.eq(autoreIce.getId());
			autore=eCriteria.uniqueEUtente();
			nota.setContent(notaIce.getContent());
			nota.setData(notaIce.getData());
			nota.setScrittaDa(autore);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return nota;
	}

}