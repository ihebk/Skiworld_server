package services;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import contracts.ClotheCrudEJBLocal;
import contracts.ClotheCrudEJBRemote;
import entities.Clothes;
import entities.Equipments;

/**
 * Session Bean implementation class ClotheCrudEJB
 */
@Stateless
@LocalBean
public class ClotheCrudEJB implements ClotheCrudEJBRemote, ClotheCrudEJBLocal {

	@PersistenceContext
	EntityManager entityManager;
    public ClotheCrudEJB() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void addClothe(Clothes Clothe) {
		entityManager.persist(Clothe);
		
	}

	@Override
	public void updateClothe(Clothes Clothe) {
		entityManager.merge(Clothe);
		
	}

	@Override
	public void deleteClothe(int id) {
		entityManager.remove(findClotheById(id));
		
	}

	@Override
	public Clothes findClotheById(int id) {
		return entityManager.find(Clothes.class, id);
		
	}

	@Override
	public Clothes findClotheByLabel(String label) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Clothes> findAllClothes() {
		return entityManager.createQuery("SELECT h FROM Clothes h",Clothes.class).getResultList();
		
	}

}
