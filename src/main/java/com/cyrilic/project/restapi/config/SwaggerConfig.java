package com.cyrilic.project.restapi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Enables Swagger documentation generation.
 * 
 * JSON documentation: http://localhost:8080/v2/api-docs UI is available under:
 * http://localhost:8080/swagger-ui.html Annotation types:
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
			.select()
			.apis(RequestHandlerSelectors.basePackage("com.cyrilic.project.restapi.controller"))
			.paths(PathSelectors.any())
			.build()
			.apiInfo(apiInfo());
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
			.title("REST Api Example")
			.description("Provides documentation for API methods")
			.version("1.0")
			.build();
	}
	
//	private ApiKey apiKey() {
//		return new ApiKey("apiKey", "Authorization", "header");
//	}
}