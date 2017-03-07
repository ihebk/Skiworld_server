package entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: UserTrainingId
 *
 */
@Embeddable

public class UserTrainingId implements Serializable {

	
	private int idUserFk;
	private int idTrainingFk;
	private static final long serialVersionUID = 1L;

	public UserTrainingId() {
		super();
	}   
	public int getIdUserFk() {
		return this.idUserFk;
	}

	public void setIdUserFk(int idUserFk) {
		this.idUserFk = idUserFk;
	}   
	public int getIdTrainingFk() {
		return this.idTrainingFk;
	}

	public void setIdTrainingFk(int idTrainingFk) {
		this.idTrainingFk = idTrainingFk;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idTrainingFk;
		result = prime * result + idUserFk;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserTrainingId other = (UserTrainingId) obj;
		if (idTrainingFk != other.idTrainingFk)
			return false;
		if (idUserFk != other.idUserFk)
			return false;
		return true;
	}
   
	
}
