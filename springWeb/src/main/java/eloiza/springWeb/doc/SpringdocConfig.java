package eloiza.springWeb.doc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;

@Configuration
public class SpringdocConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
            .info(new Info()
                .title("Title - RestAPI")
                .description("API exemplo de uso de Spring Boot REST API")
                .version("1.0")
                .termsOfService("Termo de uso: Open Source")
                .contact(new Contact()
                    .name("Seu nome")
                    .url("http://www.seusite.com.br")
                    .email("voce@seusite.com.br"))
                .license(new io.swagger.v3.oas.models.info.License()
                    .name("Licença - Sua Empresa")
                    .url("http://www.seusite.com.br")))
            .addServersItem(new Server().url("/"));
    }
}
