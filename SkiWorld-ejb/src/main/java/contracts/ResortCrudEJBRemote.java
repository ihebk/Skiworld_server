package contracts;



import java.util.List;

import javax.ejb.Remote;

import entities.Resort;


@Remote
public interface ResortCrudEJBRemote {
	public boolean addResort(Resort resort);
	public boolean updateResort(Resort resort);
	public boolean removeResort(Resort resort);
	public List<Resort> findAllResort();
	public Resort findResortByLabel(String label);
	public List<Resort> findResort(String txt);
}
