package contracts;

import java.util.List;

import javax.ejb.Local;

import entities.Piste;

@Local
public interface PisteCrudEJBLocal {
	public void addPiste(Piste piste);

	public void updatePiste(Piste piste);

	public void deletePiste(int id) ;

	public Piste findPisteById(int id);

	public Piste findPisteByLabel(String label);

	public List<Piste> findAllPistes();
}
