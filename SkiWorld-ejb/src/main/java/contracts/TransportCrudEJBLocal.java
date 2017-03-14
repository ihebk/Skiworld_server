package contracts;

import java.util.List;

import javax.ejb.Local;

import entities.Transport;

@Local
public interface TransportCrudEJBLocal {
	public void addTransport(Transport t);

	public void updateTransport(Transport t);

	public void deleteTransport(int id) ;

	public Transport findTransportById(int id);

	public Transport findTransportByLabel(String label);

	public List<Transport> findAllTransport();
}
