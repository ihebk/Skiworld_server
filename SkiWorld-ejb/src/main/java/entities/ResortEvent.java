package entities;

import entities.ResortEventId;
import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: ResortEvent
 *
 */
@Entity

public class ResortEvent implements Serializable {

	@EmbeddedId
	private ResortEventId resorteventid;
	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	private Resort resort;
	@ManyToOne
	private Event event;

	public ResortEvent() {
		super();
	}   
	public ResortEventId getResorteventid() {
		return this.resorteventid;
	}

	public void setResorteventid(ResortEventId resorteventid) {
		this.resorteventid = resorteventid;
	}
   
}
