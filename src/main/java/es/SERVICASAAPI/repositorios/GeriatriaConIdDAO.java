package es.SERVICASAAPI.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import es.SERVICASAAPI.entidades.GeriatriaConId;

@RepositoryRestResource(path = "geriatrias", itemResourceRel = "geriatria", collectionResourceRel = "geriatrias")
public interface GeriatriaConIdDAO extends JpaRepository<GeriatriaConId, Long> {

}