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
		entityManager.persist(hotel);
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Hotel> findAllHotels() {
			return entityManager.createQuery("SELECT h FROM Hotel h",Hotel.class).getResultList();
		}

	@Override
	public List<Hotel> findAllHotelsLocal() {
		// TODO Auto-generated method stub
		return entityManager.createQuery("SELECT h FROM Hotel h",Hotel.class).getResultList();
	}
	}


