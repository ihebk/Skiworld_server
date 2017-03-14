package contracts;

import java.util.List;

import javax.ejb.Remote;

import entities.Post;

@Remote
public interface PostCrudEJBRemote {

	boolean removePost(Post post);
	
	void updatePost(Post post);

	List<Post> findReportedPosts();

	Post findPostById(int id);
}
