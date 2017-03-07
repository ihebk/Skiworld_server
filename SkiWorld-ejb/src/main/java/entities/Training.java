package entities;

import java.io.Serializable;
import java.lang.String;
import java.sql.Date;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Training
 *
 */
@Entity

public class Training implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idTraining;
	private Date startDate;
	private Date endDate;
	private float duration;
	private String description;
	private static final long serialVersionUID = 1L;
	@OneToMany(mappedBy="user")
	private List<UserTraining> usertraining;
	
	@ManyToOne
	private Resort resort;

	public Training() {
		super();
	}   
	public int getIdTraining() {
		return this.idTraining;
	}

	public void setIdTraining(int idTraining) {
		this.idTraining = idTraining;
	}   
	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}   
	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}   
	public float getDuration() {
		return this.duration;
	}

	public void setDuration(float duration) {
		this.duration = duration;
	}   
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
   
}
