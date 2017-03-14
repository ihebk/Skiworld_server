package contracts;

import java.util.List;

import javax.ejb.Local;

import entities.Resort;

@Local
public interface ResortCrudEJBLocal {
public void addResortL(Resort r);
public boolean addResort(Resort resort);
public boolean updateResort(Resort resort);
public boolean removeResort(Resort resort);
public List<Resort> findAllResort();
public Resort findResortByLabel(String label);
public List<Resort> findResort(String txt);
}
