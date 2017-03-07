package entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: ResortEventId
 *
 */
@Embeddable

public class ResortEventId implements Serializable {

	
	private int idResortFk;
	private int idEventFk;
	private static final long serialVersionUID = 1L;

	public ResortEventId() {
		super();
	}   
	public int getIdResortFk() {
		return this.idResortFk;
	}

	public void setIdResortFk(int idResortFk) {
		this.idResortFk = idResortFk;
	}   
	public int getIdEventFk() {
		return this.idEventFk;
	}

	public void setIdEventFk(int idEventFk) {
		this.idEventFk = idEventFk;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idEventFk;
		result = prime * result + idResortFk;
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
		ResortEventId other = (ResortEventId) obj;
		if (idEventFk != other.idEventFk)
			return false;
		if (idResortFk != other.idResortFk)
			return false;
		return true;
	}
   
	
	
}
