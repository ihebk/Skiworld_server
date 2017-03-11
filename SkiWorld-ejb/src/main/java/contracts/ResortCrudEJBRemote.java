package contracts;

import java.util.List;

import javax.ejb.Remote;

import entities.Resort;

@Remote
public interface ResortCrudEJBRemote {
	public void addResort(Resort resort);

	public void updateResort(Resort resort);

	public void deleteResort(int id) ;

	public Resort findResortById(int id);

	public Resort findResortByLabel(String label);

	public List<Resort> findAllResorts();
}
