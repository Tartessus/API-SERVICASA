package es.SERVICASAAPI.entidades;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


import SERVICASA.Geriatria;


@Entity
@Access(value = AccessType.FIELD)
@DiscriminatorValue("G")
public class GeriatriaConId extends ServicioConId implements Geriatria {
	@Column(name = "ANOS_EXPERIENCIA")
	private int anosExperiencia;
	@Column(name = "TITULACION")
	private String titulacion;

	@Override
	public int getAnosExperiencia() {
		return anosExperiencia;
	}

	@Override
	public String getTitulacion() {
		return titulacion;
	}

	@Override
	public void setAnosExperiencia(int anosExperiencia) {

	}

	@Override
	public void setTitulacion(String titulacion) {

	}

	public GeriatriaConId() {
	};

	public GeriatriaConId(String nombre, float precioBase) {
		super(nombre, precioBase);
	}

}



