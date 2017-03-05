package entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: UserEvent
 *
 */
@Entity

public class UserEvent implements Serializable {
	@EmbeddedId
	private UserEventId usereventid;
	@ManyToOne
	private User user;
	@ManyToOne
	private Event event;

	
	private static final long serialVersionUID = 1L;

	public UserEvent() {
		super();
	}
   
}
