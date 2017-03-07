package entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: StoreEquipments
 *
 */
@Entity

public class StoreEquipments implements Serializable {
	@EmbeddedId
	private StoreEquipmentsId storeequipmentsid;
	
	@ManyToOne
	private Store stores;
	@ManyToOne
	private Equipments equipments;
	
	private static final long serialVersionUID = 1L;

	public StoreEquipments() {
		super();
	}
   
}
