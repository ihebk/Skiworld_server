package contracts;

import java.util.List;
import entities.Equipments;
import javax.ejb.Local;

@Local
public interface EquipementCrudEJBLocal {
	public List<Equipments> findAllEquipementsLocal();
	public void addEquipement(Equipments Equipment);

	public void updateEquipement(Equipments Equipment);

	public void deleteEquipement(int id) ;

	public Equipments findEquipementById(int id);

	public Equipments findEquipementByLabel(String label);

	public List<Equipments> findAllEquipements();
}
