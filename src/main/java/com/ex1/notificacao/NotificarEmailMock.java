package com.ex1.notificacao;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.ex1.modelo.Cliente;

@Profile("dev")
@TipoDoNotificador(NivelUrgencia.SEM_URGENCIA)
@Component
public class NotificarEmailMock implements Notificador {
	
	public NotificarEmailMock() {
		System.out.println("Notificador email MOCK");
	}
	
	
	@Override
	public void notificar(Cliente cliente, String mensagem) {
			System.out.printf("MOCK: Notificando seria enviada para: %s através do e-mail %s  : %s\n", cliente.getNome(), cliente.getEmail(),mensagem);
	}


}
	