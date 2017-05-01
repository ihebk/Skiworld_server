package contracts;

import java.util.List;

import javax.ejb.Local;

import entities.Clothes;

@Local
public interface ClotheCrudEJBLocal {
	public void addClothe(Clothes Clothe);

	public void updateClothe(Clothes Clothe);

	public void deleteClothe(int id) ;

	public Clothes findClotheById(int id);

	public Clothes findClotheByLabel(String label);

	public List<Clothes> findAllClothes();
	
	byte[] findPictureByProductName(String productName);
}
