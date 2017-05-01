package entities;

import java.io.Serializable;
import java.sql.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

/**
 * Entity implementation class for Entity: User
 *
 */
@Entity
@NamedQueries({ @NamedQuery(name = "findUserByUsername", query = "select p from User p where p.username=:username") })
public class User implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idUser;
	private String firstname;

	private String lastname;
	private String username;
	private String password;
	private String email;
	@Column(nullable = true)
	private int age;
	@Column(nullable = true)

	private int phone;
	private Date birthdate;
	private String address;
	private String role;
	@Lob
	private byte[] photo;
	private String gender;
	private int nbrBlock;
	private static final long serialVersionUID = 1L;
	@OneToMany(mappedBy = "postOwner", cascade = { CascadeType.MERGE }, orphanRemoval = true, fetch = FetchType.EAGER)
	private List<Post> listPost;
	@OneToMany(mappedBy = "commentOwner")
	private List<Comment> listComment;
	@OneToMany(mappedBy = "user")
	private Set<Clothes> listclothes = new HashSet<Clothes>();
	@OneToMany(mappedBy = "user")
	private Set<Equipments> listequi = new HashSet<Equipments>();

	@OneToMany(mappedBy = "event")
	private List<UserEvent> userevent;
	@OneToMany(mappedBy = "training")
	private List<UserTraining> usertraining;

	public User() {
		super();
	}

	public User(String firstname, String lastname, String gender, Date birthdate, int phone, String username,
			String password, String email, int age) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.username = username;
		this.phone = phone;
		this.password = password;
		this.email = email;
		this.gender = gender;
		this.birthdate = birthdate;
		this.age = age;
		this.role = "userManager";

	}

	public User(String firstname, String lastname, String username, String password, String email, int age, int phone,
			String gender) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.username = username;
		this.password = password;
		this.email = email;
		this.age = age;
		this.phone = phone;
		this.gender = gender;
		this.role = "skier";
	}

	public User(String firstname, String lastname, String username, String password, String email, int phone,
			String role, String gender) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.username = username;
		this.password = password;
		this.email = email;
		this.phone = phone;
		this.role = role;
		this.gender = gender;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public int getIdUser() {
		return this.idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	
	
	public Set<Clothes> getListclothes() {
		return listclothes;
	}

	public void setListclothes(Set<Clothes> listclothes) {
		this.listclothes = listclothes;
	}

	public Set<Equipments> getListequi() {
		return listequi;
	}

	public void setListequi(Set<Equipments> listequi) {
		this.listequi = listequi;
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

	public byte[] getPhoto() {
		return photo;
	}

	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "User [idUser=" + idUser + ", firstname=" + firstname + ", lastname=" + lastname + ", username="
				+ username + ", password=" + password + ", email=" + email + ", age=" + age + ", phone=" + phone
				+ ", birthdate=" + birthdate + ", address=" + address + ", role=" + role + ", gender=" + gender + "]";
	}

	public int getNbrBlock() {
		return nbrBlock;
	}

	public void setNbrBlock(int nbrBlock) {
		this.nbrBlock = nbrBlock;
	}

}
