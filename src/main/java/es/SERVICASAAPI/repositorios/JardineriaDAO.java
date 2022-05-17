package es.SERVICASAAPI.repositorios;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import es.SERVICASAAPI.entidades.JardineriaConId;

@RepositoryRestResource(path="jardinerias",  itemResourceRel="jardineria", collectionResourceRel="jardinerias" )
public interface JardineriaDAO extends JpaRepository<JardineriaConId, Long> {

}
