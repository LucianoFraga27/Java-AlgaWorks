package com.ex1.notificacao;

import org.springframework.stereotype.Component;

import com.ex1.modelo.Cliente;

@Component
public class NotificarSMS implements Notificador {

	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Notificando %s através do SMS %s usando SMTP $s : %s\n", 
				cliente.getNome(), cliente.getTelefone(), mensagem);
	}
	
	
	
}
	