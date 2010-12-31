/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: DuKe TeAm
 * License Type: Purchased
 */
package server.hibernate___foundation;

import org.orm.*;
import org.hibernate.Query;
import java.util.List;

public class EUtente extends EntityServer {
	public EUtente() {
	}
	
	public static EUtente loadEUtenteByORMID(String id) throws PersistentException {
		try {
			PersistentSession session = server.hibernate___foundation.Android2javaPersistentManager.instance().getSession();
			return loadEUtenteByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EUtente getEUtenteByORMID(String id) throws PersistentException {
		try {
			PersistentSession session = server.hibernate___foundation.Android2javaPersistentManager.instance().getSession();
			return getEUtenteByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EUtente loadEUtenteByORMID(String id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = server.hibernate___foundation.Android2javaPersistentManager.instance().getSession();
			return loadEUtenteByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EUtente getEUtenteByORMID(String id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = server.hibernate___foundation.Android2javaPersistentManager.instance().getSession();
			return getEUtenteByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EUtente loadEUtenteByORMID(PersistentSession session, String id) throws PersistentException {
		try {
			return (EUtente) session.load(server.hibernate___foundation.EUtente.class, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EUtente getEUtenteByORMID(PersistentSession session, String id) throws PersistentException {
		try {
			return (EUtente) session.get(server.hibernate___foundation.EUtente.class, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EUtente loadEUtenteByORMID(PersistentSession session, String id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (EUtente) session.load(server.hibernate___foundation.EUtente.class, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EUtente getEUtenteByORMID(PersistentSession session, String id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (EUtente) session.get(server.hibernate___foundation.EUtente.class, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EUtente[] listEUtenteByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = server.hibernate___foundation.Android2javaPersistentManager.instance().getSession();
			return listEUtenteByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EUtente[] listEUtenteByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = server.hibernate___foundation.Android2javaPersistentManager.instance().getSession();
			return listEUtenteByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EUtente[] listEUtenteByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From server.hibernate___foundation.EUtente as EUtente");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			List list = query.list();
			return (EUtente[]) list.toArray(new EUtente[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EUtente[] listEUtenteByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From server.hibernate___foundation.EUtente as EUtente");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			List list = query.list();
			return (EUtente[]) list.toArray(new EUtente[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EUtente loadEUtenteByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = server.hibernate___foundation.Android2javaPersistentManager.instance().getSession();
			return loadEUtenteByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EUtente loadEUtenteByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = server.hibernate___foundation.Android2javaPersistentManager.instance().getSession();
			return loadEUtenteByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EUtente loadEUtenteByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		EUtente[] eUtentes = listEUtenteByQuery(session, condition, orderBy);
		if (eUtentes != null && eUtentes.length > 0)
			return eUtentes[0];
		else
			return null;
	}
	
	public static EUtente loadEUtenteByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		EUtente[] eUtentes = listEUtenteByQuery(session, condition, orderBy, lockMode);
		if (eUtentes != null && eUtentes.length > 0)
			return eUtentes[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateEUtenteByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = server.hibernate___foundation.Android2javaPersistentManager.instance().getSession();
			return iterateEUtenteByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEUtenteByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = server.hibernate___foundation.Android2javaPersistentManager.instance().getSession();
			return iterateEUtenteByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEUtenteByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From server.hibernate___foundation.EUtente as EUtente");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEUtenteByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From server.hibernate___foundation.EUtente as EUtente");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EUtente loadEUtenteByCriteria(EUtenteCriteria eUtenteCriteria) {
		EUtente[] eUtentes = listEUtenteByCriteria(eUtenteCriteria);
		if(eUtentes == null || eUtentes.length == 0) {
			return null;
		}
		return eUtentes[0];
	}
	
	public static EUtente[] listEUtenteByCriteria(EUtenteCriteria eUtenteCriteria) {
		return eUtenteCriteria.listEUtente();
	}
	
	public boolean equals(Object aObj) {
		if (aObj == this)
			return true;
		if (!(aObj instanceof EUtente))
			return false;
		EUtente eutente = (EUtente)aObj;
		if ((getId() != null && !getId().equals(eutente.getId())) || (getId() == null && eutente.getId() != null))
			return false;
		return true;
	}
	
	public int hashCode() {
		int hashcode = 0;
		hashcode = hashcode + (getId() == null ? 0 : getId().hashCode());
		return hashcode;
	}
	
	public static EUtente createEUtente() {
		return new server.hibernate___foundation.EUtente();
	}
	
	public boolean save() throws PersistentException {
		try {
			server.hibernate___foundation.Android2javaPersistentManager.instance().saveObject(this);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean delete() throws PersistentException {
		try {
			server.hibernate___foundation.Android2javaPersistentManager.instance().deleteObject(this);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean refresh() throws PersistentException {
		try {
			server.hibernate___foundation.Android2javaPersistentManager.instance().getSession().refresh(this);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean evict() throws PersistentException {
		try {
			server.hibernate___foundation.Android2javaPersistentManager.instance().getSession().evict(this);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate()throws PersistentException {
		try {
			server.hibernate___foundation.EUtente[] lInseguitores = (server.hibernate___foundation.EUtente[])getInseguitore().toArray(new server.hibernate___foundation.EUtente[getInseguitore().size()]);
			for(int i = 0; i < lInseguitores.length; i++) {
				lInseguitores[i].getInseguito().remove(this);
			}
			server.hibernate___foundation.ENota[] lAutoreDis = (server.hibernate___foundation.ENota[])getAutoreDi().toArray(new server.hibernate___foundation.ENota[getAutoreDi().size()]);
			for(int i = 0; i < lAutoreDis.length; i++) {
				lAutoreDis[i].setScrittaDa(null);
			}
			server.hibernate___foundation.EUtente[] lInseguitos = (server.hibernate___foundation.EUtente[])getInseguito().toArray(new server.hibernate___foundation.EUtente[getInseguito().size()]);
			for(int i = 0; i < lInseguitos.length; i++) {
				lInseguitos[i].getInseguitore().remove(this);
			}
			return delete();
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate(org.orm.PersistentSession session)throws PersistentException {
		try {
			server.hibernate___foundation.EUtente[] lInseguitores = (server.hibernate___foundation.EUtente[])getInseguitore().toArray(new server.hibernate___foundation.EUtente[getInseguitore().size()]);
			for(int i = 0; i < lInseguitores.length; i++) {
				lInseguitores[i].getInseguito().remove(this);
			}
			server.hibernate___foundation.ENota[] lAutoreDis = (server.hibernate___foundation.ENota[])getAutoreDi().toArray(new server.hibernate___foundation.ENota[getAutoreDi().size()]);
			for(int i = 0; i < lAutoreDis.length; i++) {
				lAutoreDis[i].setScrittaDa(null);
			}
			server.hibernate___foundation.EUtente[] lInseguitos = (server.hibernate___foundation.EUtente[])getInseguito().toArray(new server.hibernate___foundation.EUtente[getInseguito().size()]);
			for(int i = 0; i < lInseguitos.length; i++) {
				lInseguitos[i].getInseguitore().remove(this);
			}
			try {
				session.delete(this);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public String id;
	
	public String username = "userName";
	
	private java.util.Set inseguitore = new java.util.HashSet();
	
	private java.util.Set autoreDi = new java.util.HashSet();
	
	private java.util.Set inseguito = new java.util.HashSet();
	
	public void setId(String value) {
		this.id = value;
	}
	
	public String getId() {
		return id;
	}
	
	public String getORMID() {
		return getId();
	}
	
	public void setUsername(String value) {
		this.username = value;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setInseguitore(java.util.Set value) {
		this.inseguitore = value;
	}
	
	public java.util.Set getInseguitore() {
		return inseguitore;
	}
	
	
	public void setAutoreDi(java.util.Set value) {
		this.autoreDi = value;
	}
	
	public java.util.Set getAutoreDi() {
		return autoreDi;
	}
	
	
	public void setInseguito(java.util.Set value) {
		this.inseguito = value;
	}
	
	public java.util.Set getInseguito() {
		return inseguito;
	}
	
	
	public boolean connected=false;
	
	public boolean getConnected() {
		//TODO: Implement Method
		return this.connected;
	}
	
	public void setConnected(boolean connected) {
		//TODO: Implement Method
		this.connected=connected;
	}
	
	public String toString() {
		return String.valueOf(getId());
	}
	
	private boolean _saved = false;
	
	public void onSave() {
		_saved=true;
	}
	
	
	public void onLoad() {
		_saved=true;
	}
	
	
	public boolean isSaved() {
		return _saved;
	}
	
	
}
