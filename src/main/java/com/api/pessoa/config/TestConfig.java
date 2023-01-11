package com.api.pessoa.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.api.pessoa.service.DBService;

@Configuration
@Profile("test")
public class TestConfig {

	@Autowired
	private DBService deDbService;
	
	@Bean
	public void intanciaBaseDeDados() {
		this.deDbService.instanciaBaseDeDados();
	}
	
}
