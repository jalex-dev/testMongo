package ec.prueba.service.impl;

import ec.prueba.model.Clientes;

import java.util.List;

public interface IService {

    List<Clientes> listaClientes();
    Clientes guardarClientes(Clientes clientes);
    Clientes modificarClientes(Clientes clientes,String id);
    Clientes buscarClientes(String id);
}
