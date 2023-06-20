package cat.barcelonactiva.tech4good.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(info = @Info(title = "Tech4Good APP", version = "1.0.0", description = "Documentation Tech4Good API"))
public class OpenApiConfig {

}