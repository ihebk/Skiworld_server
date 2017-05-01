package entities;

import java.io.Serializable;
import java.lang.String;

import java.sql.Date;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Event
 *
 */
@Entity

public class Event implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idEvent;
	private String name;
	private String description;
	private Date startDate;
	private Date endDate;
	private String type;
	@Lob
	private byte[] image;
	

	private static final long serialVersionUID = 1L;
	@OneToMany(mappedBy="user")
	private List<UserEvent> userevent;
	@ManyToOne(cascade={CascadeType.PERSIST,CascadeType.MERGE})
	private Resort resort;

	public Event() {
		super();
	}   
	public int getIdEvent() {
		return this.idEvent;
	}

	public void setIdEvent(int idEvent) {
		this.idEvent = idEvent;
	}   
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}   
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
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
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	public Resort getResort() {
		return resort;
	}
	public void setResort(Resort resort) {
		this.resort = resort;
	}
	public List<UserEvent> getUserevent() {
		return userevent;
	}
	public void setUserevent(List<UserEvent> userevent) {
		this.userevent = userevent;
	}
	
   
}
