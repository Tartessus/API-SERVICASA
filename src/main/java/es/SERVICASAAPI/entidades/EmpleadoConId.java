package es.SERVICASAAPI.entidades;

import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import SERVICASA.Empleado;

@Table(name = "EMPLEADOS")
@Entity
public class EmpleadoConId extends Empleado {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true)
	private Long id;
	@OneToMany(targetEntity = ServicioConId.class, mappedBy = "empleado")
	private Collection<ServicioConId> servicios;

	public Long getId() {
		return id;
	}

	public Collection<ServicioConId> getServicios() {
		return servicios;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setServiciosEmpleados(Collection<ServicioConId> serviciosEmpleado) {
		this.servicios = serviciosEmpleado;
	}

	public void addServicioConId(ServicioConId servicio) {
		getServicios().add(servicio);
		servicio.setEmpleado(this);
	}

	public EmpleadoConId() {
	};

	public EmpleadoConId(Collection<ServicioConId> servicio) {
		super();
		this.servicios = servicio;
	}

}