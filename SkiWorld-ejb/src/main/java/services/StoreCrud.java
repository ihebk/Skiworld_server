package services;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import contracts.StoreCrudLocal;
import contracts.StoreCrudRemote;
import entities.Resort;
import entities.Store;

/**
 * Session Bean implementation class StoreCrud
 */
@Stateless
@LocalBean
public class StoreCrud implements StoreCrudRemote, StoreCrudLocal {
	@PersistenceContext
	EntityManager entitymanager;
    /**
     * Default constructor. 
     */
    public StoreCrud() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public boolean addStore(Store store) {
		entitymanager.persist(store);
		return false;
	}

	@Override
	public boolean updateStore(Store store) {
		entitymanager.merge(store);
		return false;
	}

	@Override
	public boolean removeStore(Store store) {
		entitymanager.remove(entitymanager.merge(store));
		return false;
	}

	@Override
	public List<Store> findAllStore() {
		// TODO Auto-generated method stub
		return entitymanager.createQuery("select s from Store s", Store.class).getResultList();
	}

}
