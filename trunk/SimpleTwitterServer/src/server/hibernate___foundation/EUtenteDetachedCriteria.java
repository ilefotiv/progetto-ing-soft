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

public class EUtenteDetachedCriteria extends AbstractORMDetachedCriteria {
	public final StringExpression id;
	public final StringExpression username;
	
	public EUtenteDetachedCriteria() {
		super(server.hibernate___foundation.EUtente.class, server.hibernate___foundation.EUtenteCriteria.class);
		id = new StringExpression("id", this.getDetachedCriteria());
		username = new StringExpression("username", this.getDetachedCriteria());
	}
	
	public EUtenteDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, server.hibernate___foundation.EUtenteCriteria.class);
		id = new StringExpression("id", this.getDetachedCriteria());
		username = new StringExpression("username", this.getDetachedCriteria());
	}
	
	public server.hibernate___foundation.EUtenteDetachedCriteria createInseguitoreCriteria() {
		return new server.hibernate___foundation.EUtenteDetachedCriteria(createCriteria("inseguitore"));
	}
	
	public server.hibernate___foundation.ENotaDetachedCriteria createAutoreDiCriteria() {
		return new server.hibernate___foundation.ENotaDetachedCriteria(createCriteria("autoreDi"));
	}
	
	public server.hibernate___foundation.EUtenteDetachedCriteria createInseguitoCriteria() {
		return new server.hibernate___foundation.EUtenteDetachedCriteria(createCriteria("inseguito"));
	}
	
	public EUtente uniqueEUtente(PersistentSession session) {
		return (EUtente) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public EUtente[] listEUtente(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (EUtente[]) list.toArray(new EUtente[list.size()]);
	}
}

