package com.ex1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ex1.notificacao.Notificador;
import com.ex1.servico.AtivacaoClienteServico;

@Configuration
public class ServiceConfig {
	/*
	@Bean
	public AtivacaoClienteServico ativacaoClienteServico(Notificador notificador) {
		return new AtivacaoClienteServico(notificador);
	}
	*/
}
