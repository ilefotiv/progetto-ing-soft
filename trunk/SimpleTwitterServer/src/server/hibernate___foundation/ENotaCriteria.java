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

public class ENotaCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final StringExpression content;
	public final LongExpression data;
	
	public ENotaCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		content = new StringExpression("content", this);
		data = new LongExpression("data", this);
	}
	
	public ENotaCriteria(PersistentSession session) {
		this(session.createCriteria(ENota.class));
	}
	
	public ENotaCriteria() throws PersistentException {
		this(server.hibernate___foundation.Android2javaPersistentManager.instance().getSession());
	}
	
	public EUtenteCriteria createScrittaDaCriteria() {
		return new EUtenteCriteria(createCriteria("scrittaDa"));
	}
	
	public ENota uniqueENota() {
		return (ENota) super.uniqueResult();
	}
	
	public ENota[] listENota() {
		java.util.List list = super.list();
		return (ENota[]) list.toArray(new ENota[list.size()]);
	}
}

