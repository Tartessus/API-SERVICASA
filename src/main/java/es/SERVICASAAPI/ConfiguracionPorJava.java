package es.SERVICASAAPI;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.databind.ObjectMapper;

import es.SERVICASAAPI.entidades.EmpleadoConId;
import es.SERVICASAAPI.rest.Mixins;


@Configuration
@ComponentScan("es.SERVICASAAPI.rest")
public class ConfiguracionPorJava {

	@Bean
	public ObjectMapper getObjectMapper() {

		ObjectMapper mapper = new ObjectMapper();
		 mapper.addMixIn(EmpleadoConId.class, Mixins.Empleado.class);
		return mapper;
	}

}

