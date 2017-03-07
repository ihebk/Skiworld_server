package entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: StoreClothesId
 *
 */
@Embeddable

public class StoreClothesId implements Serializable {

	
	private int idStoreFk;
	private int idClothesFk;
	private static final long serialVersionUID = 1L;

	public StoreClothesId() {
		super();
	}   
	public int getIdStoreFk() {
		return this.idStoreFk;
	}

	public void setIdStoreFk(int idStoreFk) {
		this.idStoreFk = idStoreFk;
	}   
	public int getIdClothesFk() {
		return this.idClothesFk;
	}

	public void setIdClothesFk(int idClothesFk) {
		this.idClothesFk = idClothesFk;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idClothesFk;
		result = prime * result + idStoreFk;
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
		StoreClothesId other = (StoreClothesId) obj;
		if (idClothesFk != other.idClothesFk)
			return false;
		if (idStoreFk != other.idStoreFk)
			return false;
		return true;
	}
   
	
	
}
