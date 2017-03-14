package services;

import javax.ejb.Stateless;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import contracts.UserRemote;
import entities.User;

@Stateless
public class UserCrudService implements UserRemote {
	@PersistenceContext
	EntityManager entitymanager;
	@Override
	public boolean addUser(User user) {
		entitymanager.persist(user);
		
		return false;
	}

}
