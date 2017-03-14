package contracts;

import java.util.List;

import javax.ejb.Local;

import entities.User;
import exceptions.MoreThanOneResultException;
import exceptions.NoResultFoundException;

@Local
public interface UserCrudEJBLocal {
	public void addUser(User u);

	public boolean updateUser(User u);

	public void deleteUser(User u);

	public User findById(int idUser);

	public User findByUsername(String username) throws MoreThanOneResultException, NoResultFoundException;

	public List<User> findAllUsers();

	public User findByEmail(String email);

	public boolean checkMailExistance(String mail);

	public boolean checkUsernameExistance(String username);
}
