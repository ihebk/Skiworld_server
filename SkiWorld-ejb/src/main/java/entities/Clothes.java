package entities;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Clothes
 *
 */
@Entity

public class Clothes implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idClothes;
	private String name;
	private String type;
	private float price;
	private String description;
	private float deal;
	private static final long serialVersionUID = 1L;
	
	@OneToMany(mappedBy="stores")
	private List<StoreClothes> storeclothes;

	public Clothes() {
		super();
	}   
	public int getIdClothes() {
		return this.idClothes;
	}

	public void setIdClothes(int idClothes) {
		this.idClothes = idClothes;
	}   
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}   
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}   
	public float getPrice() {
		return this.price;
	}

	public void setPrice(float price) {
		this.price = price;
	}   
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}   
	public float getDeal() {
		return this.deal;
	}

	public void setDeal(float deal) {
		this.deal = deal;
	}
   
}
