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
	private String name;
	private Date startDate;
	private Date endDate;
	private String type;
	private String description;
	private static final long serialVersionUID = 1L;
	@OneToMany(mappedBy="user")
	private List<UserTraining> usertraining;
	
	@ManyToOne(cascade={CascadeType.PERSIST,CascadeType.MERGE})
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
	
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Resort getResort() {
		return resort;
	}
	public void setResort(Resort resort) {
		this.resort = resort;
	}
   
}
