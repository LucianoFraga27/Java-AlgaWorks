package com.ex1.notificacao;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.ex1.modelo.Cliente;

@Profile("prod")
@TipoDoNotificador(NivelUrgencia.SEM_URGENCIA)
@Component
public class NotificarEmail implements Notificador {
	
	public NotificarEmail() {
		System.out.println("Notificador email real");
	}
	
	
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		
		System.out.printf("Notificando %s através do e-mail %s  : %s\n", 
												  cliente.getNome(), cliente.getEmail(),mensagem);
	}


}
	