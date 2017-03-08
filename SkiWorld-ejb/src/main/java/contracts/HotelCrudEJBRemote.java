package contracts;

import java.util.List;

import javax.ejb.Remote;

import entities.Hotel;


@Remote
public interface HotelCrudEJBRemote {
	
	public void addHotel(Hotel hotel);

	public void updateHotel(Hotel hotel);

	public void deleteHotel(int id) ;

	public Hotel findHotelById(int id);

	public Hotel findHotelByLabel(String label);

	public List<Hotel> findAllHotels();

}
