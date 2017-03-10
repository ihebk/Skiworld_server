package models;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.swing.table.DefaultTableModel;

import contracts.HotelCrudEJBRemote;
import entities.Hotel;

public class HotelModel {

	public List<Hotel> hotellist;

	public DefaultTableModel hotelModel() throws SQLException, IOException {
		InitialContext ctx;

		DefaultTableModel hotelModel = null;
		try {

			ctx = new InitialContext();

			HotelCrudEJBRemote proxy_hotel = (HotelCrudEJBRemote) ctx
					.lookup("/SkiWorld-ear/SkiWorld-ejb/HotelCrudEJB!contracts.HotelCrudEJBRemote");
			hotellist = proxy_hotel.findAllHotels();

			String col[] = { "Name", "Descritption", "Rating", "Capacity" };
			hotelModel = new DefaultTableModel(col, 0);
			for (int i = 0; i < proxy_hotel.findAllHotels().size(); i++) {
				String Name = proxy_hotel.findAllHotels().get(i).getName();
				String Description = proxy_hotel.findAllHotels().get(i).getDescription();
				float Rating = proxy_hotel.findAllHotels().get(i).getRating();
				int Capacity = proxy_hotel.findAllHotels().get(i).getCapacity();

				Object[] data = { Name, Description, Rating, Capacity };
				hotelModel.addRow(data);

			}
		} catch (NamingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return hotelModel;

	}

}
