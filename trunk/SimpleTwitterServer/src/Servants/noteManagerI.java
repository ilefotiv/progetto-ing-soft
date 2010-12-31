package Servants;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.hibernate.criterion.Restrictions;
import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import antlr.debug.NewLineEvent;

import server.hibernate___foundation.Android2javaPersistentManager;
import server.hibernate___foundation.ENota;
import server.hibernate___foundation.ENotaConcreteMapper;
import server.hibernate___foundation.ENotaCriteria;
import server.hibernate___foundation.EUtente;
import server.hibernate___foundation.EUtenteCriteria;
import server.hibernate___foundation.EntityMappersFactory;

import EntityCondivise.ENotaCondivisaImp;
import Ice.Current;
import TwitterSimpleClient.EntityCondivise.ENotaCondivisa;
import TwitterSimpleClient.EntityCondivise.EUtenteCondiviso;
import TwitterSimpleClient.EntityCondivise.listaNoteHelper;

public class noteManagerI extends TwitterSimpleClient.InterfacceCondivise._noteManagerDisp {

	@Override
	public void addNota(ENotaCondivisa nota, Current current) {
		
		System.out.println("invocato addNota");
		ENota serverNota=(ENota)EntityMappersFactory.getInstance().IceToHibernateFactory(nota);
		try {
			serverNota.save();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Nota Aggiunta");
	}

	@SuppressWarnings("unchecked")
	@Override
	public ArrayList<ENotaCondivisa> getListaNote(EUtenteCondiviso utente,
			Current current) {
		System.out.println("invocato getListaNote:");
		PersistentTransaction t=null;
		ArrayList<ENotaCondivisa> note=new ArrayList<ENotaCondivisa>();
		try {
			t = Android2javaPersistentManager.instance().getSession().beginTransaction();
			Android2javaPersistentManager.instance().getSession().clear();
			EUtenteCriteria uCritirea = new EUtenteCriteria();
			uCritirea.add(Restrictions.idEq(utente.getId()));
			EUtente user=uCritirea.uniqueEUtente();
			EUtente tempUser=null;
			ENota tempNota=null;
			ArrayList<ENota> arrayENote = new ArrayList<ENota>(user.getAutoreDi());
			Comparator comp= new Comparator() {

				@Override
				public int compare(Object o1, Object o2) {
					if(o1!=null && o2!=null)
					{
						ENotaCondivisaImp n1 =(ENotaCondivisaImp) o1;
						ENotaCondivisaImp n2 =(ENotaCondivisaImp) o2;
						if(n1.getData()>n2.getData())
							return -1;
						if(n1.getData()==n2.getData())
							return 0;
						return 1;
					}
					return -1;
				}	
			};
			
			System.out.println("\t converto le note dell'utente "+user.getId());
			for(int n=0; n<arrayENote.size();n++)
			{
				//System.out.println(arrayENote.get(n).getContent());	
				note.add((ENotaCondivisa)EntityMappersFactory.getInstance()
							.HibernateToIceFactory(arrayENote.get(n)));
					
			}
			
			System.out.println("\t recupero le note degli utenti che seguo");
			ArrayList<EUtente> usersTemp= new ArrayList<EUtente>(user.getInseguitore());
			ArrayList<ENota> noteTemp=null;
			for(int u=0; u<usersTemp.size(); u++)
			{	tempUser=usersTemp.get(u);
				System.out.println("\t\t converto le note dell'utente "+tempUser.getId());
				noteTemp=new ArrayList<ENota>(tempUser.getAutoreDi());
				for(int n=0; n<noteTemp.size(); n++)
				{	
					tempNota=noteTemp.get(n);
					//System.out.println("\t converto le nota  "+tempNota.getId());
					note.add((ENotaCondivisa)EntityMappersFactory.getInstance()
							.HibernateToIceFactory(tempNota));
				}
			}
			Collections.sort(note,comp);
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
		System.out.println("Terminato getListaNote");
		return note;
	}

	@Override
	public ENotaCondivisa getNotaById(String id, Current current) {
		
		return null;
	}

}
