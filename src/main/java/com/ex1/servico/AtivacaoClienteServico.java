package com.ex1.servico;

import org.springframework.stereotype.Component;

import com.ex1.modelo.Cliente;
import com.ex1.notificacao.Notificador;

@Component
public class AtivacaoClienteServico {

	private Notificador notificador;
	
	public AtivacaoClienteServico(Notificador notificador) {
		this.notificador = notificador;
		
		System.out.println("AtivacaoClienteService: " + notificador);
	}

	public void ativar(Cliente cliente) {
		cliente.ativar();

		notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
	}
	
}
