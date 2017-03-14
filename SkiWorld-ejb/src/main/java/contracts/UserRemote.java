package contracts;

import javax.ejb.Remote;

import entities.User;

@Remote
public interface UserRemote {
	
	public boolean addUser(User user);

}
