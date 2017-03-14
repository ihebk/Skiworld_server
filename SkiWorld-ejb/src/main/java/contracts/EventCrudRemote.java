package contracts;

import java.util.List;

import javax.ejb.Remote;

import entities.Event;


@Remote
public interface EventCrudRemote {
	public void addEvent(Event E);
	public void updateEvent(Event E);
	public void deleteEvent(Event E);
	public Event  findEventByID(int idEvent);
	 public List<Event> findAllEvents();
}
