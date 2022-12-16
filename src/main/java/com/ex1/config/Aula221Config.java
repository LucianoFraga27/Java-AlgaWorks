package com.ex1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ex1.servico.AtivacaoClienteServico;

@Configuration
public class Aula221Config {
	
	@Bean
	public AtivacaoClienteServico ativacaoClienteServico () {
		return new AtivacaoClienteServico();
	}
	
}
