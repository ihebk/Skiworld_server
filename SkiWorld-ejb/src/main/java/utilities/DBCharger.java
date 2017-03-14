//package utilities;
//
//import java.awt.image.RescaleOp;
//
//import javax.annotation.PostConstruct;
//import javax.ejb.EJB;
//import javax.ejb.Singleton;
//import javax.ejb.Startup;
//
//import contracts.PostCrudEJBLocal;
//import contracts.ResortCrudEJBLocal;
//import contracts.UserCrudEJBLocal;
//import entities.Post;
//import entities.Resort;
//import entities.User;
//
//@Singleton
//@Startup
//public class DBCharger {
//	@EJB
//	private PostCrudEJBLocal postCrudLocal;
//
//	@EJB
//	private UserCrudEJBLocal userCrudLocal;
//	
//	@EJB
//	private ResortCrudEJBLocal resortCrudEJBLocal;
//
//	public DBCharger() {
//
//	}
//
//	@PostConstruct
//	public void chargeData() {
//		// public User(String firstname, String lastname, String gender, Date
//		// birthdate, int phone, String username,
//		// String password, String email, int age)
//		User u = new User("haythem", "mechergui", "haythem", "123", "haythem.ipei@gmail.com", 50869318, "admin",
//				"Male");
//		User u1 = new User("ahmed", "midou", "moussa", "123", "ahmed@gmail.com", 18, 22822588, "Male");
//		User u2 = new User("adam", "midou", "ahmed", "123", "adam@gmail.com", 18, 22822588, "Male");
//		User u3 = new User("firas", "midou", "firas", "123", "skiworldcontact@gmail.com", 18, 22822588, "Male");
//		User u4 = new User("abir", "abir", "abir", "123", "abir@gmail.com", 50869318, "manager", "Female");
//		Resort r = new Resort();
//		Resort r1 = new Resort();
//		r.setName("cold weather");
//		r.setDescription("very nice one");
//		r.setLocation("Evrest");
//		resortCrudEJBLocal.addResortL(r);
//		r1.setName("funny ski");
//		r1.setDescription("have fun");
//		r1.setLocation("Alaska");
//		resortCrudEJBLocal.addResortL(r1);
//		
//		// User u5 = new User("anis", "anis", "anis", "123",
//		// "haythem.ipei@gmail.com", 50869318, "manager", "Male");
//		// User u6 = new User("hend", "hend", "hend", "123",
//		// "haythem.ipei@gmail.com", 50869318, "manager", "Female");
//		userCrudLocal.addUser(u);
//		userCrudLocal.addUser(u1);
//		userCrudLocal.addUser(u2);
//		userCrudLocal.addUser(u3);
//		userCrudLocal.addUser(u4);
//		// userCrudLocal.addUser(u5);
//		// userCrudLocal.addUser(u6);
//
//		Post p1 = new Post("hello i'm sharing my experience here", 10, 5, u1);
//		Post p2 = new Post("i had a great time", 5, 9, u2);
//		Post p3 = new Post("i don't like you", 1, 50, u3);
//		Post p4 = new Post("heyyyyyyy", 2, 80, u3);
//		Post p5 = new Post("i recommend alaska , it is a great place", 1, 50, u3);
//		// Post p6 = new Post("this is a picture of me in everest mountain", 1,
//		// 50, u5);
//
////		postCrudLocal.addPost(p1);
////		postCrudLocal.addPost(p2);
////		postCrudLocal.addPost(p3);
////		postCrudLocal.addPost(p4);
////		postCrudLocal.addPost(p5);
//		// postCrudLocal.addPost(p6);
//
//	}
//
//}
