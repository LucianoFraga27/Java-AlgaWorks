package com.ex1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ex1.notificacao.NotificarEmail;
import com.ex1.servico.AtivacaoClienteServico;

//@Configuration
public class Ex1Config {
	/*
	@Bean
	public NotificarEmail notificaEmail() {
		// Instanciando o bean
		NotificarEmail notificador = new NotificarEmail("smtp.email.com.br");
		// Configurando bean
		notificador.setCaixaAlta(true);
		// 
		return notificador;
	}
	
	@Bean
	public AtivacaoClienteServico ativacaoClienteServico() {
		return new AtivacaoClienteServico(notificaEmail());
	}
	*/
}
