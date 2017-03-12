package entities;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Piste
 *
 */
@Entity

public class Piste implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idPiste;
	private String name;
	private String description;
	private String type;
	@Lob
	private byte[] image;
	private static final long serialVersionUID = 1L;
	@OneToOne(mappedBy ="piste",cascade = CascadeType.ALL)
	private Resort resort;

	public Piste() {
		super();
	}   
	public int getIdPiste() {
		return this.idPiste;
	}

	public void setIdPiste(int idPiste) {
		this.idPiste = idPiste;
	}   
	public String getName() {
		return this.name;
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
	public void setName(String name) {
		this.name = name;
	}   
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}   
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}
   
}
