package services;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import contracts.TransportCrudEJBLocal;
import contracts.TransportCrudEJBRemote;
import entities.Hotel;
import entities.Transport;

/**
 * Session Bean implementation class TransportCrudEJB
 */
@Stateless
@LocalBean
public class TransportCrudEJB implements TransportCrudEJBRemote, TransportCrudEJBLocal {

	@PersistenceContext

	EntityManager entityManager;

	/**
	 * Default constructor.
	 */
	public TransportCrudEJB() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addTransport(Transport t) {
		entityManager.persist(entityManager.merge(t));

	}

	@Override
	public void updateTransport(Transport t) {
		entityManager.merge(t);
	}

	@Override
	public void deleteTransport(int id) {
		entityManager.remove(findTransportById(id));

	}

	@Override
	public Transport findTransportById(int id) {
		return entityManager.find(Transport.class, id);

	}

	@Override
	public Transport findTransportByLabel(String label) {
		return entityManager.createQuery("select t from Transport t where t.name=:tname", Transport.class)
				.setParameter("tname", label).getSingleResult();

	}

	@Override
	public List<Transport> findAllTransport() {
		return entityManager.createQuery("SELECT t FROM Transport t", Transport.class).getResultList();

	}

}
