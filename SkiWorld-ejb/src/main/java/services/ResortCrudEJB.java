package services;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import contracts.ResortCrudEJBLocal;
import contracts.ResortCrudEJBRemote;
import entities.Hotel;
import entities.Resort;

/**
 * Session Bean implementation class ResortCrudEJB
 */
@Stateless
@LocalBean
public class ResortCrudEJB implements ResortCrudEJBRemote, ResortCrudEJBLocal {
	@PersistenceContext

	EntityManager entityManager;
    /**
     * Default constructor. 
     */
    public ResortCrudEJB() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void addResort(Resort resort) {
		entityManager.persist(entityManager.merge(resort));
		
	}

	@Override
	public void updateResort(Resort resort) {
		entityManager.merge(resort);
		
	}

	@Override
	public void deleteResort(int id) {
		entityManager.remove(findResortById(id));
		
	}

	@Override
	public Resort findResortById(int id) {
		return entityManager.find(Resort.class, id);
	}

	@Override
	public Resort findResortByLabel(String label) {
		return entityManager.createQuery("select r from Resort r where r.name=:rname", Resort.class).setParameter("rname", label).getSingleResult();

	}

	@Override
	public List<Resort> findAllResorts() {
		return entityManager.createQuery("SELECT r FROM Resort r",Resort.class).getResultList();

	}

}
