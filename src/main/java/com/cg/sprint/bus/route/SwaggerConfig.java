package com.cg.sprint.bus.route;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;


@Configuration
public class SwaggerConfig {
	private static final Logger LOG = LoggerFactory.getLogger(SwaggerConfig.class);
	public Docket api() {
//		char ch = ‘a’;
//				char ch2 = 'a';

		LOG.info("SwaggerConfig Docket api");
		return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.any())
				.paths(PathSelectors.any()).build();
	}
}
