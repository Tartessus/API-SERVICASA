package es.SERVICASAAPI.entidades;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.InheritanceType;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;

import SERVICASA.*;

@Entity
@Table(name = "SERVICIOS")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn( name = "TIPO_SERVICIO", discriminatorType = DiscriminatorType.STRING)
public class ServicioConId extends Servicio {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true)
	private Long id;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_EMPLEADO", referencedColumnName = "id")
	private EmpleadoConId empleado;

	public EmpleadoConId getEmpleado() {
		return empleado;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setEmpleado(EmpleadoConId empleado) {
		this.empleado = empleado;
	}

	public ServicioConId() {
	};

	public ServicioConId(String nombre, float precioBase) {
		super(nombre, precioBase);
	}

}