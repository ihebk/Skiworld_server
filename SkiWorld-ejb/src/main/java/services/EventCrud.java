package services;


import java.util.List;


import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import contracts.EventCrudLocal;
import contracts.EventCrudRemote;
import entities.Event;

/**
 * Session Bean implementation class EventCrud
 */
@Stateless
@LocalBean
public class EventCrud implements EventCrudRemote, EventCrudLocal {
	@PersistenceContext
	EntityManager em;
    /**
     * Default constructor. 
     */
    public EventCrud() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void addEvent(Event E) {
		em.persist(em.merge(E));
		
	}

	@Override
	public void updateEvent(Event E) {
		em.merge(E);
		
	}

	@Override
	public  void deleteEvent(Event P) {
		em.remove(em.merge(P));			
	}

	@Override
	public  Event findEventByID(int idEvent) {
		return em.find(Event.class,idEvent);
	}
    
	
	  public List<Event> findAllEvents() {
		    Query query = em.createQuery("SELECT e FROM Event e");
		    List<Event> resultList = (List<Event>) query.getResultList();
			return resultList;
		  }
	  



}
