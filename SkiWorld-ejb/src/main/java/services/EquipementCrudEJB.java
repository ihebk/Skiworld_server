package services;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import contracts.EquipementCrudEJBLocal;
import contracts.EquipementCrudEJBRemote;
import entities.Equipments;

/**
 * Session Bean implementation class EquipementCrudEJB
 */
@Stateless
@LocalBean
public class EquipementCrudEJB implements EquipementCrudEJBRemote, EquipementCrudEJBLocal {

	@PersistenceContext
	EntityManager entityManager;
    public EquipementCrudEJB() {
        
    }



	@Override
	public void addEquipement(Equipments Equipment) {
		entityManager.persist(Equipment);
		
	}

	@Override
	public void updateEquipement(Equipments Equipment) {
		entityManager.merge(Equipment);
		
	}

	@Override
	public void deleteEquipement(int id) {
		entityManager.remove(findEquipementById(id));
		
	}

	@Override
	public Equipments findEquipementById(int id) {
		return entityManager.find(Equipments.class, id);
		
	}

	@Override
	public Equipments findEquipementByLabel(String label) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Equipments> findAllEquipements() {
		return entityManager.createQuery("SELECT h FROM Equipments h",Equipments.class).getResultList();
		
	}
	@Override
	public List<Equipments> findAllEquipementsLocal() {
		return entityManager.createQuery("SELECT h FROM Equipments h",Equipments.class).getResultList();
	}

}
