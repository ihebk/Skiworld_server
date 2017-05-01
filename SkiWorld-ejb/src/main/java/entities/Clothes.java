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
	private int quantity;
	@Lob
	private byte[] image;
	private static final long serialVersionUID = 1L;
	@ManyToOne
	private Store store;
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

	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
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
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	public Store getStore() {
		return store;
	}
	public void setStore(Store store) {
		this.store = store;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idClothes;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Clothes other = (Clothes) obj;
		if (idClothes != other.idClothes)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	
   
}
