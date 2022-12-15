package com.ex1.servico;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ex1.modelo.Cliente;
import com.ex1.notificacao.Notificador;

@Component
public class AtivacaoClienteServico {

	@Autowired
	private List<Notificador> notificadores;
	
	
	
	
	/*
	@Autowired
	public AtivacaoClienteServico(Notificador notificador) {
		this.notificador = notificador;
		}
	
	public AtivacaoClienteServico(String qualquer) {
		
		}
	*/
	public void ativar(Cliente cliente) {
		cliente.ativar();
		for(Notificador notificador : notificadores ) {
			notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
		}

	}
	
	/*
	@Autowired
	public void setNotificador(Notificador notificador) {
		this.notificador = notificador;
	}
	*/
}
