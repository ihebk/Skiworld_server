package entities;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Equipments
 *
 */
@Entity

public class Equipments implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idEquipment;
	private String name;
	private String description;
	private float price;
	private float deal;
	private String type;
	private static final long serialVersionUID = 1L;
	@OneToMany(mappedBy="stores")
	private List<StoreEquipments> storeequipments;

	public Equipments() {
		super();
	}   
	public int getIdEquipment() {
		return this.idEquipment;
	}

	public void setIdEquipment(int idEquipment) {
		this.idEquipment = idEquipment;
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
	public float getPrice() {
		return this.price;
	}

	public void setPrice(float price) {
		this.price = price;
	}   
	public float getDeal() {
		return this.deal;
	}

	public void setDeal(float deal) {
		this.deal = deal;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
   
}
