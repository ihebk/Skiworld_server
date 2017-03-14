package entities;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Store
 *
 */
@Entity

public class Store implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idStore;
	private String name;
	private String description;
	private String location;
	private long phone;
	private String email;
	private static final long serialVersionUID = 1L;
	@ManyToOne
	private Resort resort;
	@OneToMany(mappedBy="equipments")
	private List<StoreEquipments> storeequipments;
	@OneToMany(mappedBy="clothes")
	private List<StoreClothes> storeclothes;
	

	public Store() {
		super();
	}   
	public int getIdStore() {
		return this.idStore;
	}

	public void setIdStore(int idStore) {
		this.idStore = idStore;
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
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Resort getResort() {
		return resort;
	}
	public void setResort(Resort resort) {
		this.resort = resort;
	}   
	
   
}
