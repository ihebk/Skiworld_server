package entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: StoreEquipmentsId
 *
 */
@Embeddable

public class StoreEquipmentsId implements Serializable {

	
	private int idStoreFk;
	private int idEquipmentsFk;
	private static final long serialVersionUID = 1L;

	public StoreEquipmentsId() {
		super();
	}   
	public int getIdStoreFk() {
		return this.idStoreFk;
	}

	public void setIdStoreFk(int idStoreFk) {
		this.idStoreFk = idStoreFk;
	}   
	public int getIdEquipmentsFk() {
		return this.idEquipmentsFk;
	}

	public void setIdEquipmentsFk(int idEquipmentsFk) {
		this.idEquipmentsFk = idEquipmentsFk;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idEquipmentsFk;
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
		StoreEquipmentsId other = (StoreEquipmentsId) obj;
		if (idEquipmentsFk != other.idEquipmentsFk)
			return false;
		if (idStoreFk != other.idStoreFk)
			return false;
		return true;
	}
	
	
   
}
