package contracts;

import java.util.List;

import javax.ejb.Local;

import entities.Event;

@Local
public interface EventCrudLocal {
	public void addEvent(Event E);
	public void updateEvent(Event E);
	public void deleteEvent(Event E);
	public Event  findEventByID(int idEvent);
	 public List<Event> findAllEvents();
}
