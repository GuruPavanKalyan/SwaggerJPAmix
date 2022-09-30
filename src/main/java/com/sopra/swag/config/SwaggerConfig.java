package com.sopra.swag.config;

import static springfox.documentation.builders.PathSelectors.regex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@Configuration
@EnableSwagger2
public class SwaggerConfig {
	@Bean
	public Docket productapi()
	{
	    return new Docket(DocumentationType.SWAGGER_2)//Docket is used for documentation
	            .select()
	            .apis(RequestHandlerSelectors.basePackage("com.sopra.swag.controller"))//apis is used to where we get the apis from source
	            .paths(regex("/.*"))
	            .build();

	}

}

