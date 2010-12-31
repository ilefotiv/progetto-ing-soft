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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class ENotaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final StringExpression content;
	public final LongExpression data;
	
	public ENotaDetachedCriteria() {
		super(server.hibernate___foundation.ENota.class, server.hibernate___foundation.ENotaCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		content = new StringExpression("content", this.getDetachedCriteria());
		data = new LongExpression("data", this.getDetachedCriteria());
	}
	
	public ENotaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, server.hibernate___foundation.ENotaCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		content = new StringExpression("content", this.getDetachedCriteria());
		data = new LongExpression("data", this.getDetachedCriteria());
	}
	
	public server.hibernate___foundation.EUtenteDetachedCriteria createScrittaDaCriteria() {
		return new server.hibernate___foundation.EUtenteDetachedCriteria(createCriteria("scrittaDa"));
	}
	
	public ENota uniqueENota(PersistentSession session) {
		return (ENota) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public ENota[] listENota(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (ENota[]) list.toArray(new ENota[list.size()]);
	}
}

