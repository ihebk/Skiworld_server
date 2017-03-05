package entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: UserEventId
 *
 */
@Embeddable

public class UserEventId implements Serializable {

	
	private int idUserFk;
	private int idEventFk;
	private static final long serialVersionUID = 1L;

	public UserEventId() {
		super();
	}

	public int getIdUserFk() {
		return idUserFk;
	}

	public void setIdUserFk(int idUserFk) {
		this.idUserFk = idUserFk;
	}

	public int getIdEventFk() {
		return idEventFk;
	}

	public void setIdEventFk(int idEventFk) {
		this.idEventFk = idEventFk;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idEventFk;
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
		UserEventId other = (UserEventId) obj;
		if (idEventFk != other.idEventFk)
			return false;
		if (idUserFk != other.idUserFk)
			return false;
		return true;
	}   
	
   
}
