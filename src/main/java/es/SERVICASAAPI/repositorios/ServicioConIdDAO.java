package es.SERVICASAAPI.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import es.SERVICASAAPI.entidades.ServicioConId;

public interface ServicioConIdDAO {
	@RepositoryRestResource(path = "servicios", itemResourceRel = "servicio", collectionResourceRel = "servicios")
	public interface EmpleadoConIdDAO extends JpaRepository<ServicioConId, Long> {

	}

}