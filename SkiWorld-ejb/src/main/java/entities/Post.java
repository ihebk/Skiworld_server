package entities;

import java.io.Serializable;
import java.lang.String;
import java.sql.Date;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Post
 *
 */
@Entity

public class Post implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idPost;
	private String content;
	private Date postDate;
	private int nbrLikes;
	private int nbrReport;
	private static final long serialVersionUID = 1L;
	@ManyToOne
	private User postOwner;
	@OneToMany(mappedBy="post")
	private List<Comment> comments;

	public Post() {
		super();
	}   
	public int getIdPost() {
		return this.idPost;
	}

	public void setIdPost(int idPost) {
		this.idPost = idPost;
	}   
	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}   
	public Date getPostDate() {
		return this.postDate;
	}

	public void setPostDate(Date postDate) {
		this.postDate = postDate;
	}   
	public int getNbrLikes() {
		return this.nbrLikes;
	}

	public void setNbrLikes(int nbrLikes) {
		this.nbrLikes = nbrLikes;
	}   
	public int getNbrReport() {
		return this.nbrReport;
	}

	public void setNbrReport(int nbrReport) {
		this.nbrReport = nbrReport;
	}
   
}
