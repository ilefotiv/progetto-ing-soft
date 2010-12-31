package server.hibernate___foundation;

import java.util.ArrayList; 
import java.util.List;

import org.hibernate.criterion.Restrictions;
import org.orm.PersistentException;

import com.mchange.v1.util.ArrayUtils;

import TwitterSimpleClient.EntityCondivise.*;

import EntityCondivise.*;

public class EUtenteConcreteMapper extends EntityMappersFactory {

	private static EUtenteConcreteMapper instance;

	public EUtenteConcreteMapper() {
		
	}
	/**
	 * 
	 * @param entity
	 */
	public EntityCondivisa HibernateToIceFactory(EntityServer entity) {
		EUtente eUtente=(EUtente)entity;
		
		ENotaCondivisaImp nota;
		ArrayList<String> autoreDi= new ArrayList<String>();
		ArrayList<String> inseguito= new ArrayList<String>();
		ArrayList<String> inseguitore= new ArrayList<String>();
		ArrayList<ENota> autoreDiTemp=new ArrayList<ENota>(eUtente.getAutoreDi());
		ArrayList<EUtente> inseguitoTemp=new ArrayList<EUtente>(eUtente.getInseguito());
		ArrayList<EUtente> inseguitoreTemp=new ArrayList<EUtente>(eUtente.getInseguitore());
		
		for(int i=0;i<autoreDiTemp.size();i++)
		{
			autoreDi.add(String.valueOf(autoreDiTemp.get(i).getId()));
		}
		//System.out.println("Numero persone che mi seguono (inseguito) "+eUtente.getInseguito().size());
		for(int i=0; i<inseguitoTemp.size();i++)
		{
			inseguito.add(inseguitoTemp.get(i).getId());
		}
		//System.out.println("Numero persone che seguo (inseguitore) "+eUtente.getInseguitore().size());
		for(int i=0; i<inseguitoreTemp.size();i++)
		{
			inseguitore.add(inseguitoreTemp.get(i).getId());
		}
		
		EUtenteCondivisoImp utenteCondivisoImp=new EUtenteCondivisoImp(eUtente.getUsername(),
																	   eUtente.getId(),
																	   eUtente.getConnected(),
																	   inseguitore,
																	   inseguito,
																	   autoreDi);
		return utenteCondivisoImp;
	}

	/**
	 * 
	 * @param entity
	 */
	public EntityServer IceToHibernateFactory(EntityCondivisa entity) {
		EUtenteCondiviso utenteCond=(EUtenteCondiviso)entity;
		EUtente user=null;
		// riprendo l'utente dal server cosi come è e poi ne sovrascrivo i dati
		EUtenteCriteria eUtenteCriteria=null;
		try {
			eUtenteCriteria = new EUtenteCriteria();
			user=(EUtente)eUtenteCriteria.add(Restrictions.idEq(utenteCond.getId())).uniqueResult();
			user.setUsername(utenteCond.getUsername());
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user;
		
	}
	
	public static EUtenteConcreteMapper getInstance()
	{
		if(EUtenteConcreteMapper.instance==null)
		{
			EUtenteConcreteMapper.instance=new EUtenteConcreteMapper();
		}
		return EUtenteConcreteMapper.instance;
	}

}