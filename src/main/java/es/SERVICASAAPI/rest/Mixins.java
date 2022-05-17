package es.SERVICASAAPI.rest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

public class Mixins {

	@JsonPropertyOrder({ "nombreCompleto", "ciudad" })
	@JsonIgnoreProperties(value = { "id" })
	public static interface Empleado {

		@JsonProperty("nombreCompleto")
		abstract String getNombre();

	}
	
	
}
