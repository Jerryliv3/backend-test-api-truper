package com.truper.api.exam.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.databind.json.JsonMapper;

@Configuration
public class GlobalConfiguration {
	
	@Bean
	public JsonMapper getJsonMapper() {
		return new JsonMapper();
	}

}
