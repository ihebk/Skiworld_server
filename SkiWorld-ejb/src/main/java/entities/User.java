package entities;

import java.io.Serializable;
import java.lang.String;
import java.sql.Blob;
import java.sql.Date;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: User
 *
 */
@Entity

public class User implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idUser;
	private String firstname;
	private String lastname;
	private String username;
	private String password;
	private String email;
	private int age;
	private Date birthdate;
	private String address;
	private String role;
	private Blob photo;
	private String gender;
	private static final long serialVersionUID = 1L;
	@OneToMany(mappedBy="postOwner")
	private List<Post> listPost;
	@OneToMany(mappedBy="commentOwner")
	private List<Comment> listComment;
	
	@OneToMany(mappedBy="event")
	private List<UserEvent> userevent;

	public User() {
		super();
	}   
	public int getIdUser() {
		return this.idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}   
	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}   
	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}   
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}   
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}   
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}   
	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}   
	public Date getBirthdate() {
		return this.birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}   
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}   
	public String getRole() {
		return this.role;
	}

	public void setRole(String role) {
		this.role = role;
	}   
	public Blob getPhoto() {
		return this.photo;
	}

	public void setPhoto(Blob photo) {
		this.photo = photo;
	}   
	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
   
}
