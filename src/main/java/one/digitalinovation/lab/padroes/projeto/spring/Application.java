package one.digitalinovation.lab.padroes.projeto.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class Application {

	/**
	 * Projeto Spring Boot gerado via Spring Initializr
	 * Os seguintes módulos foram selecionados:
	 *  - Spring Data JPA
	 *  - Spring Web
	 *  - H2 Database
	 *  - OpenFeign
	 */

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		
	}
}
