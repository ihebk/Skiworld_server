package services;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import contracts.TrainingCrudLocal;
import contracts.TrainingCrudRemote;

import entities.Training;

/**
 * Session Bean implementation class TrainingCrud
 */
@Stateless
@LocalBean
public class TrainingCrud implements TrainingCrudRemote, TrainingCrudLocal {
	@PersistenceContext
	EntityManager em;

    /**
     * Default constructor. 
     */
    public TrainingCrud() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void addTraining(Training T) {
		em.persist(em.merge(T));		
	}

	@Override
	public void updateTraining(Training T) {
		em.merge(T);		
	}

	@Override
	public void deleteTraining(Training T) {
		em.remove(em.merge(T));
		
	}

	@Override
	public Training findTrainingByID(int idTraining) {
		return em.find(Training.class,idTraining);
	}

	@Override
	public List<Training> findAllTrainings() {
		  Query query = em.createQuery("SELECT t FROM Training t");
		    List<Training> resultList = (List<Training>) query.getResultList();
			return resultList;
	}

}
