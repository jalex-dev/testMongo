package ec.prueba.repocitory;

import ec.prueba.model.Clientes;
import io.quarkus.mongodb.panache.PanacheMongoRepository;
import io.quarkus.mongodb.panache.PanacheQuery;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;

@ApplicationScoped
public class ClientesRepository implements PanacheMongoRepository<Clientes> {




}
