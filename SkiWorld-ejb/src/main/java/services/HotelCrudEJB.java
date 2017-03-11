package services;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import contracts.HotelCrudEJBLocal;
import contracts.HotelCrudEJBRemote;
import entities.Hotel;

/**
 * Session Bean implementation class HotelCrudEJB
 */
@Stateless
@LocalBean
public class HotelCrudEJB implements HotelCrudEJBRemote, HotelCrudEJBLocal {

	@PersistenceContext

	EntityManager entityManager;

	public HotelCrudEJB() {
	}

	@Override
	public void addHotel(Hotel hotel) {
		entityManager.persist(entityManager.merge(hotel));
	}

	@Override
	public void updateHotel(Hotel hotel) {
		entityManager.merge(hotel);
	}

	@Override
	public void deleteHotel(int id) {
	entityManager.remove(findHotelById(id));
	
	}

	@Override
	public Hotel findHotelById(int id) {
		return entityManager.find(Hotel.class, id);
	}

	@Override
	public Hotel findHotelByLabel(String label) {
		return entityManager.createQuery("select h from Hotel h where h.name=:hname", Hotel.class).setParameter("hname", label).getSingleResult();
	}

	@Override
	public List<Hotel> findAllHotels() {
			return entityManager.createQuery("SELECT h FROM Hotel h",Hotel.class).getResultList();
		}

	}


