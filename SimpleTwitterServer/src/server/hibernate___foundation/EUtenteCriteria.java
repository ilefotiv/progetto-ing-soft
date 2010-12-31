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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class EUtenteCriteria extends AbstractORMCriteria {
	public final StringExpression id;
	public final StringExpression username;
	
	public EUtenteCriteria(Criteria criteria) {
		super(criteria);
		id = new StringExpression("id", this);
		username = new StringExpression("username", this);
	}
	
	public EUtenteCriteria(PersistentSession session) {
		this(session.createCriteria(EUtente.class));
	}
	
	public EUtenteCriteria() throws PersistentException {
		this(server.hibernate___foundation.Android2javaPersistentManager.instance().getSession());
	}
	
	public server.hibernate___foundation.EUtenteCriteria createInseguitoreCriteria() {
		return new server.hibernate___foundation.EUtenteCriteria(createCriteria("inseguitore"));
	}
	
	public server.hibernate___foundation.ENotaCriteria createAutoreDiCriteria() {
		return new server.hibernate___foundation.ENotaCriteria(createCriteria("autoreDi"));
	}
	
	public server.hibernate___foundation.EUtenteCriteria createInseguitoCriteria() {
		return new server.hibernate___foundation.EUtenteCriteria(createCriteria("inseguito"));
	}
	
	public EUtente uniqueEUtente() {
		return (EUtente) super.uniqueResult();
	}
	
	public EUtente[] listEUtente() {
		java.util.List list = super.list();
		return (EUtente[]) list.toArray(new EUtente[list.size()]);
	}
}

