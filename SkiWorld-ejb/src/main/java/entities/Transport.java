package entities;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Transport
 *
 */
@Entity

public class Transport implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idTransport;
	private String description;
	private String type;
	private float bookingPrice;
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public float getBookingPrice() {
		return bookingPrice;
	}
	public void setBookingPrice(float bookingPrice) {
		this.bookingPrice = bookingPrice;
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

	
	@Lob
	private byte[] image;
	private static final long serialVersionUID = 1L;
	
	@ManyToOne(cascade={CascadeType.PERSIST,CascadeType.MERGE})
	private Resort resort;

	public Transport() {
		super();
	}   
	public int getIdTransport() {
		return this.idTransport;
	}

	public void setIdTransport(int idTransport) {
		this.idTransport = idTransport;
	}   
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}   

   
}
