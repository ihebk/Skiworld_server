package entities;

import java.io.Serializable;
import java.lang.String;
import java.sql.Blob;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Hotel
 *
 */
@Entity

public class Hotel implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idHotel;
	private String name;
	private String description;
	private int capacity;
	private float rating;
	@Lob
	private byte[] image;
	private static final long serialVersionUID = 1L;
	
	@ManyToOne(cascade={CascadeType.PERSIST,CascadeType.MERGE})
	private Resort resort;

	public Resort getResort() {
		return resort;
	}
	public void setResort(Resort resort) {
		this.resort = resort;
	}
	public Hotel() {
		super();
	}   
	public int getIdHotel() {
		return this.idHotel;
	}

	public void setIdHotel(int idHotel) {
		this.idHotel = idHotel;
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
	public int getCapacity() {
		return this.capacity;
	}

	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}   
	public float getRating() {
		return this.rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

   
}
