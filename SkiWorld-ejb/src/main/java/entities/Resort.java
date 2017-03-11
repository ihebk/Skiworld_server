package entities;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Resort
 *
 */
@Entity

public class Resort implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idResort;
	private String name;
	private String description;
	private String location;
	private float rating;
	private String country;
	private static final long serialVersionUID = 1L;
	@OneToOne
	private Store store;
	@OneToOne(mappedBy="resort")
	private Piste piste;
	
	@OneToMany(mappedBy="resort")
	private List<Hotel> hotels;
	
	@OneToMany(mappedBy="resort")
	private List<Transport> transport;
	
	@OneToMany(mappedBy="resort")
	private List<Event> events;
	
	@OneToMany(mappedBy="resort")
	private List<Training> training;
	

	public Resort() {
		super();
	}   
	public int getIdResort() {
		return this.idResort;
	}

	public void setIdResort(int idResort) {
		this.idResort = idResort;
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
	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}   
	public float getRating() {
		return this.rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}   
	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
   
}
