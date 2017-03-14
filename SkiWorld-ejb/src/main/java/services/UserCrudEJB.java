package services;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import contracts.UserCrudEJBLocal;
import contracts.UserCrudEJBRemote;
import entities.Hotel;
import entities.User;
import exceptions.MoreThanOneResultException;
import exceptions.NoResultFoundException;

/**
 * Session Bean implementation class UserCrudEJB
 */
@Stateless
@LocalBean
public class UserCrudEJB implements UserCrudEJBRemote, UserCrudEJBLocal {
	@PersistenceContext
	EntityManager entityManager;

	/**
	 * Default constructor.
	 */
	public UserCrudEJB() {

	}

	@Override
	public void addUser(User u) {
		entityManager.persist(u);

	}

	@Override
	public boolean updateUser(User u) {
		try {
			entityManager.merge(u);
			return true;
		} catch (Exception e) {
			return false;

		}
	}

	@Override
	public void deleteUser(User u) {
		entityManager.remove(entityManager.merge(u));

	}

	@Override
	public User findById(int idUser) {

		return entityManager.find(User.class, idUser);
	}

	@Override
	public User findByUsername(String username) throws MoreThanOneResultException, NoResultFoundException {

		TypedQuery<User> query = entityManager.createNamedQuery("findUserByUsername", User.class);
		query.setParameter("username", username);

		try {
			return query.getSingleResult();
		} catch (NonUniqueResultException e) {
			throw new MoreThanOneResultException();
		} catch (NoResultException e) {
			throw new NoResultFoundException();
		}

		// String hql = "select c from User c where c.username=:pusername";
		// Query query = entityManager.createQuery(hql);
		// query.setParameter("pusername", username);
		//
		// List<User> foundUsers = (List<User>) query.getResultList();
		// if (foundUsers == null || foundUsers.isEmpty()) {
		// return null;
		// }
		//
		// return foundUsers.get(0);

		// User u = new User();
		// try
		// {
		// u= entityManager.createQuery("select c from User c where
		// c.username=:pusername", User.class)
		// .setParameter("pusername", username).getSingleResult();
		// }
		// catch( Exception e)
		// {
		// //System.out.println("Login non");
		// //return null;
		// }
		// return u;

	}

	@Override
	public List<User> findAllUsers() {

		return entityManager.createQuery("SELECT u FROM User u", User.class).getResultList();

	}

	// @Override
	// public boolean checkByUsername(String username) {
	// try {
	// TypedQuery<User> q = entityManager.createQuery("SELECT u FROM User u
	// where u.username =:username",
	// User.class);
	// q.setParameter("username", username);
	// User user = q.getSingleResult();
	// return user;
	// } catch (javax.persistence.NoResultException e) {
	// return null;
	// }
	//
	// }
	//

	@Override
	public User findByEmail(String email) {
		try {
			TypedQuery<User> q = entityManager.createQuery("SELECT u FROM User u where u.email =:email", User.class);
			q.setParameter("email", email);
			User user = q.getSingleResult();
			return user;
		} catch (javax.persistence.NoResultException e) {
			return null;
		}
	}

	@Override
	public boolean checkMailExistance(String email) {
		try {
			TypedQuery<User> q = entityManager.createQuery("SELECT u FROM User u where u.email =:email", User.class);
			q.setParameter("email", email);
			User user = q.getSingleResult();
			return true;
		} catch (javax.persistence.NoResultException e) {
			return false;
		}
	}

	@Override
	public boolean checkUsernameExistance(String username) {

		try {
			TypedQuery<User> q = entityManager.createQuery("SELECT u FROM User u where u.username =:username",
					User.class);
			q.setParameter("username", username);
			User user = q.getSingleResult();
			return true;
		} catch (javax.persistence.NoResultException e) {
			return false;
		}

	}

}
