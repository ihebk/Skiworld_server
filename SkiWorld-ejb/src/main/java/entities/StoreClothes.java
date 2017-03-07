package entities;

import entities.StoreClothesId;
import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: StoreClothes
 *
 */
@Entity

public class StoreClothes implements Serializable {

	@EmbeddedId
	private StoreClothesId storeclothesid;
	
	@ManyToOne
	private Store stores;
	@ManyToOne
	private Clothes clothes;
	private static final long serialVersionUID = 1L;

	public StoreClothes() {
		super();
	}   
	public StoreClothesId getStoreclothesid() {
		return this.storeclothesid;
	}

	public void setStoreclothesid(StoreClothesId storeclothesid) {
		this.storeclothesid = storeclothesid;
	}
   
}
