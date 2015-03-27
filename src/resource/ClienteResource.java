package resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import model.Cliente;
import dao.ClienteDAO;

@Path("/customer/{id}")
public class ClienteResource {
	@GET
	@Produces( { MediaType.APPLICATION_JSON })
	public Cliente getClienteById(@PathParam("id") Integer id) {
		ClienteDAO clienteDAO = new ClienteDAO();
		Cliente cliente = clienteDAO.getById(id);
		return cliente;
	}
}
