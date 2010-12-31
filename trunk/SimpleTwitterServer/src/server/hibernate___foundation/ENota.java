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

public class ENota extends EntityServer {
	public ENota() {
	}
	
	public static ENota loadENotaByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = server.hibernate___foundation.Android2javaPersistentManager.instance().getSession();
			return loadENotaByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ENota getENotaByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = server.hibernate___foundation.Android2javaPersistentManager.instance().getSession();
			return getENotaByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ENota loadENotaByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = server.hibernate___foundation.Android2javaPersistentManager.instance().getSession();
			return loadENotaByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ENota getENotaByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = server.hibernate___foundation.Android2javaPersistentManager.instance().getSession();
			return getENotaByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ENota loadENotaByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (ENota) session.load(server.hibernate___foundation.ENota.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ENota getENotaByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (ENota) session.get(server.hibernate___foundation.ENota.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ENota loadENotaByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (ENota) session.load(server.hibernate___foundation.ENota.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ENota getENotaByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (ENota) session.get(server.hibernate___foundation.ENota.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ENota[] listENotaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = server.hibernate___foundation.Android2javaPersistentManager.instance().getSession();
			return listENotaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ENota[] listENotaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = server.hibernate___foundation.Android2javaPersistentManager.instance().getSession();
			return listENotaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ENota[] listENotaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From server.hibernate___foundation.ENota as ENota");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			List list = query.list();
			return (ENota[]) list.toArray(new ENota[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ENota[] listENotaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From server.hibernate___foundation.ENota as ENota");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			List list = query.list();
			return (ENota[]) list.toArray(new ENota[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ENota loadENotaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = server.hibernate___foundation.Android2javaPersistentManager.instance().getSession();
			return loadENotaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ENota loadENotaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = server.hibernate___foundation.Android2javaPersistentManager.instance().getSession();
			return loadENotaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ENota loadENotaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		ENota[] eNotas = listENotaByQuery(session, condition, orderBy);
		if (eNotas != null && eNotas.length > 0)
			return eNotas[0];
		else
			return null;
	}
	
	public static ENota loadENotaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		ENota[] eNotas = listENotaByQuery(session, condition, orderBy, lockMode);
		if (eNotas != null && eNotas.length > 0)
			return eNotas[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateENotaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = server.hibernate___foundation.Android2javaPersistentManager.instance().getSession();
			return iterateENotaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateENotaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = server.hibernate___foundation.Android2javaPersistentManager.instance().getSession();
			return iterateENotaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateENotaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From server.hibernate___foundation.ENota as ENota");
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
	
	public static java.util.Iterator iterateENotaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From server.hibernate___foundation.ENota as ENota");
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
	
	public static ENota loadENotaByCriteria(ENotaCriteria eNotaCriteria) {
		ENota[] eNotas = listENotaByCriteria(eNotaCriteria);
		if(eNotas == null || eNotas.length == 0) {
			return null;
		}
		return eNotas[0];
	}
	
	public static ENota[] listENotaByCriteria(ENotaCriteria eNotaCriteria) {
		return eNotaCriteria.listENota();
	}
	
	public static ENota createENota() {
		return new server.hibernate___foundation.ENota();
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
			if(getScrittaDa() != null) {
				getScrittaDa().getAutoreDi().remove(this);
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
			if(getScrittaDa() != null) {
				getScrittaDa().getAutoreDi().remove(this);
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
	
	public int id;
	
	private server.hibernate___foundation.EUtente scrittaDa;
	
	public String content;
	
	public long data;
	
	public void setContent(String value) {
		this.content = value;
	}
	
	public String getContent() {
		return content;
	}
	
	public void setData(long value) {
		this.data = value;
	}
	
	public long getData() {
		return data;
	}
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setScrittaDa(server.hibernate___foundation.EUtente value) {
		this.scrittaDa = value;
	}
	
	public server.hibernate___foundation.EUtente getScrittaDa() {
		return scrittaDa;
	}
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
