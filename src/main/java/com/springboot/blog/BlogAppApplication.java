package com.springboot.blog;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@OpenAPIDefinition(
        info = @Info(
                title = "Spring Boot App REST APIs",
                description = "Spring Boot Blog REST APIs Documentation",
                version = "v1.0",
                contact = @Contact(
                        name = "Manar",
                        email = "manarzich233@gmail.com",
                        url = "https://www.manar-zich.software"
                ),
                license = @License(
                        name = "Apache 2.0",
                        url = "https://github.com/Mana1r/Blog-app-SpringBoot"
        )
        ),
        externalDocs = @ExternalDocumentation(
                description = "Spring Boot Blog Documentation",
                url="https://github.com/Mana1r"
        )
)
public class BlogAppApplication {
    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

    public static void main(String[] args) {
        SpringApplication.run(BlogAppApplication.class, args);
    }

}
