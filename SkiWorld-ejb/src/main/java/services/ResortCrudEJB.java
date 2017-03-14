package services;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import contracts.ResortCrudEJBLocal;
import contracts.ResortCrudEJBRemote;
import entities.Resort;


/**
 * Session Bean implementation class ResortCrud
 */
@Stateful
@LocalBean
public class ResortCrudEJB implements ResortCrudEJBRemote, ResortCrudEJBLocal {
	@PersistenceContext
	EntityManager entitymanager;
    /**
     * Default constructor. 
     */
    public ResortCrudEJB() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public boolean addResort(Resort resort) {
		entitymanager.persist(resort);
		return false;
	}

	@Override
	public boolean updateResort(Resort resort) {
		entitymanager.merge(resort);
		return false;
	}

	@Override
	public boolean removeResort(Resort resort) {
		entitymanager.remove(entitymanager.merge(resort));
		return false;
	}

	@Override
	public List<Resort> findAllResort() {
		return entitymanager.createQuery("select r from Resort r", Resort.class).getResultList();
	}
	public Resort findResortByLabel(String label) {
		return entitymanager.createQuery("select r from Resort r where r.name=:rname", Resort.class).setParameter("rname", label).getSingleResult();

	}

	@Override
	public List<Resort> findResort(String txt) {
		return entitymanager.createQuery("select r from Resort r where r.name="+txt, Resort.class).getResultList();
	}

	@Override
	public void addResortL(Resort r) {
		entitymanager.persist(r);
		
	}
}
