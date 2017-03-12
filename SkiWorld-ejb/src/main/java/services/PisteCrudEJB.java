package services;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import contracts.PisteCrudEJBLocal;
import contracts.PisteCrudEJBRemote;
import entities.Hotel;
import entities.Piste;

/**
 * Session Bean implementation class PisteCrudEJB
 */
@Stateless
@LocalBean
public class PisteCrudEJB implements PisteCrudEJBRemote, PisteCrudEJBLocal {

	@PersistenceContext

	EntityManager entityManager;
    /**
     * Default constructor. 
     */
    public PisteCrudEJB() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void addPiste(Piste piste) {
		entityManager.persist(entityManager.merge(piste));
		
	}

	@Override
	public void updatePiste(Piste piste) {
		entityManager.merge(piste);		
	}

	@Override
	public void deletePiste(int id) {
		entityManager.remove(findPisteById(id));
		
	}

	@Override
	public Piste findPisteById(int id) {
		return entityManager.find(Piste.class, id);

	}

	@Override
	public Piste findPisteByLabel(String label) {
		return entityManager.createQuery("select p from Piste p where p.name=:pname", Piste.class).setParameter("pname", label).getSingleResult();

	}

	@Override
	public List<Piste> findAllPistes() {
		return entityManager.createQuery("SELECT p FROM Piste p",Piste.class).getResultList();

	}

}
