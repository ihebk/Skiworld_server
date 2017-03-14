package contracts;

import java.util.List;

import javax.ejb.Remote;

import entities.Clothes;
import entities.Equipments;

@Remote
public interface ClotheCrudEJBRemote {
	
	public void addClothe(Clothes Clothe);

	public void updateClothe(Clothes Clothe);

	public void deleteClothe(int id) ;

	public Clothes findClotheById(int id);

	public Clothes findClotheByLabel(String label);

	public List<Clothes> findAllClothes();

}
