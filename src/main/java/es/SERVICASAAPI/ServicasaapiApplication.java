package es.SERVICASAAPI;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;




@Import(ConfiguracionPorJava.class)
@ImportResource({ "classpath:config/jpa-config.xml" })
@SpringBootApplication
public class ServicasaapiApplication {

	public static void main(String[] args) {

		SpringApplication.run(ServicasaapiApplication.class, args);

	}

}
