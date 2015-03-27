package resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import model.Cliente;
import dao.ClienteDAO;

@Path("/customers1")
public class ClientesResource {
	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	public Response getLista() {
		ClienteDAO clienteDAO = new ClienteDAO();
		List<Cliente> lista = clienteDAO.getLista();
		return Response.status(Response.Status.OK)
                .entity(lista)
                .type(MediaType.APPLICATION_JSON).build();
	}
}
