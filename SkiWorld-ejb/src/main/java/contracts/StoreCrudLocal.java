package contracts;

import java.util.List;

import javax.ejb.Local;

import entities.Store;

@Local
public interface StoreCrudLocal {
	public boolean addStore(Store store);
	public boolean updateStore(Store store);
	public boolean removeStore(Store store);
	public List<Store> findAllStore();
}
