package es.SERVICASAAPI.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import es.SERVICASAAPI.entidades.*;

@RepositoryRestResource(path="empleados",  itemResourceRel="empleado", collectionResourceRel="empleados" )
public interface EmpleadoDAO extends JpaRepository<EmpleadoConId, Long> {

}
