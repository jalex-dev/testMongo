package ec.prueba.controler;

import ec.prueba.model.Clientes;
import ec.prueba.service.impl.IService;
import ec.prueba.service.impl.Serviceclientes;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.xml.validation.Validator;
import java.util.List;

@Path("/clientes")
public class controler {

    @Inject
    IService iService;


    List<Clientes> listClientes;


    @GET
    @Path("/listAll")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response obtenerTodosRegistro() {
        listClientes = iService.listaClientes();
        if(listClientes.isEmpty()){
            return Response.ok().entity(listClientes).build();
        }else
        {
            return Response.ok("Lista Vacia").build();

        }

    }

    @POST
    @Path("/guardar")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response guardar(Clientes cliente) {

        return Response.ok().entity(iService.guardarClientes(cliente)).build();
    }

    @GET
    @Path("buscar/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response get(@PathParam("id") String id) {       
        return Response.ok().entity(iService.buscarClientes(id)).build();
    }

    @PUT
    @Path("/actualizar/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response update(@PathParam("id") String id,Clientes cliente){
        return Response.ok().entity(iService.modificarClientes(cliente,id)).build();
    }
}