package contracts;

import java.util.List;

import javax.ejb.Local;

import entities.Hotel;

@Local
public interface HotelCrudEJBLocal {

	public List<Hotel> findAllHotelsLocal();

}
