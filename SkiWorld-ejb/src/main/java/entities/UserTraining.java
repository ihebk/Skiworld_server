package entities;

import entities.UserTrainingId;
import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: UserTraining
 *
 */
@Entity

public class UserTraining implements Serializable {

	@EmbeddedId
	private UserTrainingId usertrainingid;
	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	private User user;
	@ManyToOne
	private Training training;

	public UserTraining() {
		super();
	}   
	public UserTrainingId getUsertrainingid() {
		return this.usertrainingid;
	}

	public void setUsertrainingid(UserTrainingId usertrainingid) {
		this.usertrainingid = usertrainingid;
	}
   
}
