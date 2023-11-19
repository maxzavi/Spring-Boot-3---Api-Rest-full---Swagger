package pe.maxz.demo_api_rest_full;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Product API Rest full", version = "1.0.0"))

public class DemoApiRestFullApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApiRestFullApplication.class, args);
	}

}
