package entities;

import java.io.Serializable;
import java.lang.String;
import java.sql.Date;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Comment
 *
 */
@Entity

public class Comment implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idComment;
	private String content;
	private Date postDate;
	private int nbrLike;
	private int nbrReport;
	private static final long serialVersionUID = 1L;
	@ManyToOne
	private User commentOwner;
	@ManyToOne
	private Post post;

	public Comment() {
		super();
	}   
	public int getIdComment() {
		return this.idComment;
	}

	public void setIdComment(int idComment) {
		this.idComment = idComment;
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
	public int getNbrLike() {
		return this.nbrLike;
	}

	public void setNbrLike(int nbrLike) {
		this.nbrLike = nbrLike;
	}   
	public int getNbrReport() {
		return this.nbrReport;
	}

	public void setNbrReport(int nbrReport) {
		this.nbrReport = nbrReport;
	}
   
}
