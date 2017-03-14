package services;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import contracts.PostCrudEJBLocal;
import contracts.PostCrudEJBRemote;
import entities.Post;
import entities.User;

/**
 * Session Bean implementation class PostCrudEJB
 */
@Stateless
public class PostCrudEJB implements PostCrudEJBRemote, PostCrudEJBLocal {
	@PersistenceContext
	EntityManager entityManager;

	/**
	 * Default constructor.
	 */
	public PostCrudEJB() {

	}

	@Override
	public void addPost(Post post) {
		entityManager.persist(entityManager.merge(post));
	}

	@Override
	public boolean removePost(Post post) {
		try {
			entityManager.remove(entityManager.merge(post));
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public List<Post> findReportedPosts() {
		return entityManager
				.createQuery("select p from Post p where p.nbrReport IS NOT NULL and p.isDeleted =0", Post.class)
				.getResultList();

	}

	@Override
	public Post findPostById(int id) {

		return entityManager.find(Post.class, id);
	}

	@Override
	public void updatePost(Post post) {
		entityManager.merge(post);
	}

}
