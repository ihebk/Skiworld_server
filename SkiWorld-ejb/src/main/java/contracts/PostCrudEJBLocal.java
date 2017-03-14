package contracts;

import java.util.List;

import javax.ejb.Local;

import entities.Post;

@Local
public interface PostCrudEJBLocal {
	void addPost(Post post);

	List<Post> findReportedPosts();
	boolean removePost(Post post);
	
	void updatePost(Post post);


	Post findPostById(int id);

}
