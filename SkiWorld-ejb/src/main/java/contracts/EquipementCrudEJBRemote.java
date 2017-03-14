package contracts;

import java.util.List;

import javax.ejb.Remote;

import entities.Equipments;

@Remote
public interface EquipementCrudEJBRemote {
	
	public void addEquipement(Equipments Equipment);

	public void updateEquipement(Equipments Equipment);

	public void deleteEquipement(int id) ;

	public Equipments findEquipementById(int id);

	public Equipments findEquipementByLabel(String label);

	public List<Equipments> findAllEquipements();

}
