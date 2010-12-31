package Servants;
import javax.swing.JTextPane;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import Ice.Current;
import Mains.serverGui;
import TwitterSimpleClient.EntityCondivise.EUtenteCondiviso;
import server.hibernate___foundation.*;
public class AuthenticationI extends TwitterSimpleClient.InterfacceCondivise._AuthtenticationDisp {

	@Override
	public boolean keepAlive(String Imei, Current current) {
		System.out.println("disconnetto "+Imei);
		return false;
	}

	@Override
	public EUtenteCondiviso logIn(String Imei, Current current) {
		System.out.println("metodo:logIn di AuthenticatorI:");
		System.out.println("\t richiesta di autenticazione da "+Imei);
		PersistentTransaction t=null;
		EUtente user=null;
		try {
			t = Android2javaPersistentManager.instance().getSession().beginTransaction();
			EUtenteCriteria eUtenteCriteria = new EUtenteCriteria();
			eUtenteCriteria.id.eq(Imei);
			user=eUtenteCriteria.uniqueEUtente();
			if(user==null)
			{
				System.out.println("\t utente non presente bel db quindi provo a salvarlo");
				user= new EUtente();
				user.setId(Imei);
				user.save();
			}
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			try {
				t.rollback();
			} catch (PersistentException e1) {
				e1.printStackTrace();
			}
		}
		try {
			t.commit();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Terminato il logIn");
		return (EUtenteCondiviso) EntityMappersFactory.getInstance().HibernateToIceFactory(user);
	}
	

}
