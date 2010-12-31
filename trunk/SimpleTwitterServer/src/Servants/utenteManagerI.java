package Servants;

import java.util.ArrayList;

import org.hibernate.HibernateException;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import server.hibernate___foundation.Android2javaPersistentManager;
import server.hibernate___foundation.EUtente;
import server.hibernate___foundation.EUtenteCriteria;
import server.hibernate___foundation.EntityMappersFactory;

import Ice.Current;
import TwitterSimpleClient.EntityCondivise.EUtenteCondiviso;

public class utenteManagerI  extends TwitterSimpleClient.InterfacceCondivise._utenteManagerDisp{

	

	@Override
	public boolean updateUtente(EUtenteCondiviso utente, Current current) {
		System.out.println("Aggiorno il profilo con "+utente.getUsername());
		EUtente user=(EUtente)EntityMappersFactory.getInstance().IceToHibernateFactory(utente);
		try {
			System.out.println("Profilo aggiornato");
			return user.save();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	


	@Override
	public ArrayList<EUtenteCondiviso> getInseguito(EUtenteCondiviso utente,
			Current current) {
		// TODO Auto-generated method stub
		return null;
	}


	// ritorna la lista degli utenti che segue l'utente passato come parametro
	@Override
	public ArrayList<EUtenteCondiviso> getInseguitore(EUtenteCondiviso utente,
			Current current) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	// recupero tutti gli utenti che usano l'applicativo
	public ArrayList<EUtenteCondiviso> getUtenti(Current current) {
		PersistentTransaction t=null;
		ArrayList<EUtenteCondiviso> utentiIce=new ArrayList<EUtenteCondiviso>();
		try {
			t = Android2javaPersistentManager.instance().getSession().beginTransaction();
			Android2javaPersistentManager.instance().getSession().clear();
			EUtenteCriteria uCriteria= new EUtenteCriteria();
			ArrayList<EUtente> utenti= new ArrayList<EUtente>(uCriteria.addOrder(Order.asc("username")).list());
			for(int i=0;i <utenti.size(); i++)
			{
				utentiIce.add((EUtenteCondiviso)EntityMappersFactory.getInstance()
						.HibernateToIceFactory(utenti.get(i)));
			}
		}catch(PersistentException e)
		{
			e.printStackTrace();
		} 
		return utentiIce;
	}




	@Override
	public EUtenteCondiviso addInseguitore(EUtenteCondiviso utente,
			EUtenteCondiviso inseguitore, Current current) {
		EUtenteCondiviso result=null;
		System.out.println("arrivato la richiesta di seguire un nuovo utente");
		EUtente userHiber= (EUtente)EntityMappersFactory.getInstance().IceToHibernateFactory(utente);
		EUtente inseguitoreHiber= (EUtente)EntityMappersFactory.getInstance().IceToHibernateFactory(inseguitore);
		System.out.println(userHiber.getInseguitore().size());
		System.out.println("id dell'utente da salvare:"+inseguitoreHiber.getId());
		System.out.println("username dell'utente da salvare:"+inseguitoreHiber.getUsername());
		// da ricordare che il primo campo di questa tabella indica l'utente inseguito 
		// mentro il secondo campo l'utente inseguitore
		String SqlQuery="INSERT INTO eutente_eutente (EUtenteId,EUtenteId2) value('"+inseguitoreHiber.getId()+"','"+userHiber.getId()+"')";
		System.out.println(SqlQuery);
		try {
			int t=Android2javaPersistentManager.instance().getSession().createSQLQuery(SqlQuery).executeUpdate();
			System.out.println("righe interessate dall'update "+t);
			PersistentTransaction  tran= Android2javaPersistentManager.instance().getSession().beginTransaction();
			Android2javaPersistentManager.instance().getSession().clear();
			EUtenteCriteria eUtenteCriteria= new EUtenteCriteria();
			result=(EUtenteCondiviso) EntityMappersFactory.getInstance()
			.HibernateToIceFactory((EUtente)(eUtenteCriteria.add(Restrictions.idEq(userHiber.getId())).uniqueResult()));
			System.out.println("ustente aggiornato con"+result.getUsername() );
			tran.commit();
		} catch (HibernateException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (PersistentException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return result;
	}




	@Override
	public EUtenteCondiviso removeInseguitore(EUtenteCondiviso utente,
			EUtenteCondiviso inseguitore, Current current) {
		
		EUtenteCondiviso result=null;
		System.out.println("arrivato la richiesta di smettere di seguire un  utente");
		String SqlQuery="DELETE FROM eutente_eutente where EUtenteId='"+inseguitore.getId()+"' and EUtenteId2='"+utente.getId()+"'";
		System.out.println(SqlQuery);
		try {
			int t=Android2javaPersistentManager.instance().getSession().createSQLQuery(SqlQuery).executeUpdate();
			System.out.println("righe interessate dall'update "+t);
			PersistentTransaction  tran= Android2javaPersistentManager.instance().getSession().beginTransaction();
			Android2javaPersistentManager.instance().getSession().clear();
			EUtenteCriteria eUtenteCriteria= new EUtenteCriteria();
			result=(EUtenteCondiviso) EntityMappersFactory.getInstance()
			.HibernateToIceFactory((EUtente)(eUtenteCriteria.add(Restrictions.idEq(utente.getId())).uniqueResult()));
			System.out.println("ustente aggiornato con"+result.getUsername() );
			tran.commit();
		} catch (HibernateException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (PersistentException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return result;
		
	}

}
