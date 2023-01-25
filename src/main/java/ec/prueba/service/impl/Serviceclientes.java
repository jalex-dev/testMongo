package ec.prueba.service.impl;

import ec.prueba.model.Clientes;
import ec.prueba.repocitory.ClientesRepository;
import org.bson.types.ObjectId;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;
@ApplicationScoped
public class Serviceclientes implements IService {
    @Inject
    ClientesRepository clientesRepository;
    @Override
    public List<Clientes> listaClientes() {
        System.out.println(clientesRepository.listAll());
        return clientesRepository.listAll();
    }

    @Override
    public Clientes guardarClientes(Clientes clientes) {
        clientesRepository.persist(clientes);
        return clientes;
    }

    @Override
    public Clientes modificarClientes(Clientes clientes, String id) {
        clientes.id = new ObjectId(id);
        clientesRepository.update(clientes);
        return clientes ;
    }

    @Override
    public Clientes buscarClientes(String id) {

        return  clientesRepository.findById(new ObjectId(id));
    }
}
