package com.test.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

@SuppressWarnings("deprecation")
@Configuration 
@EnableSwagger2WebMvc
public class TestConfig {
	@Bean
	public Docket api() { 
		return new Docket(DocumentationType.SWAGGER_2)  
				.select()                                  
				.apis(RequestHandlerSelectors.basePackage("com.test"))              
				.paths(PathSelectors.any())                          
				.build()
				.apiInfo(apiInfo());
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("Test APIs").description("Test API reference for developers")
				.termsOfServiceUrl("http://test.com").license("Test License").licenseUrl("test@gmail.com")
				.version("1.0").build();
	}

	@Bean
	public ModelMapper modelMapper(){
		return new ModelMapper();
	}
}
