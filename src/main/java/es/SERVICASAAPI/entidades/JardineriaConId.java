package es.SERVICASAAPI.entidades;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import SERVICASA.Jardineria;

@Entity
@Access(value = AccessType.FIELD)
@DiscriminatorValue("J")
public class JardineriaConId extends ServicioConId implements Jardineria {
	@Column(name = "MATERIAL_PROPIO")
	private boolean materialPropio;

	@Override
	public boolean isMaterialPropio() {

		return materialPropio;
	}

	@Override
	public void setMaterialPropio(boolean materialPropio) {
		this.materialPropio = materialPropio;
	}

	public JardineriaConId() {

	};

	
}
