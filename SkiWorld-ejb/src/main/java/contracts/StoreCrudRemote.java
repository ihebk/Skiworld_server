package contracts;

import java.util.List;

import javax.ejb.Remote;


import entities.Store;

@Remote
public interface StoreCrudRemote {
	public boolean addStore(Store store);
	public boolean updateStore(Store store);
	public boolean removeStore(Store store);
	public List<Store> findAllStore();
}
