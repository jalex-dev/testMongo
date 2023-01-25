package ec.prueba.model;

import io.quarkus.mongodb.panache.PanacheMongoEntity;
import io.quarkus.mongodb.panache.common.MongoEntity;
import jdk.jfr.DataAmount;
import lombok.Data;

import java.util.List;
@Data
@MongoEntity(collection="clientes")
public class Clientes extends PanacheMongoEntity {
    /**
     * nombre
     * apellido
     * cedula
     */
    public String nombre;
    public String apellido;
    public String cedula;




}
