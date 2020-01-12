package org.krimeet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.MimeTypeUtils;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	private static final Set<String> DEFAULT_PRODUCES = new HashSet<>(Arrays.asList(MimeTypeUtils.APPLICATION_JSON_VALUE));
	private static final Set<String> DEFAULT_CONSUMES = new HashSet<>(Arrays.asList(MimeTypeUtils.APPLICATION_JSON_VALUE, MimeTypeUtils.ALL_VALUE));

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).produces(DEFAULT_PRODUCES).consumes(DEFAULT_CONSUMES).select().paths(PathSelectors.ant("/tracker/**")).build();
	}
}
