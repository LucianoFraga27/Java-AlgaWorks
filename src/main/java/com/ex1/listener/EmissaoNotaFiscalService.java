package com.ex1.listener;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.ex1.servico.ClienteAtivadoEvent;

import ch.qos.logback.core.net.server.Client;

@Component
public class EmissaoNotaFiscalService {
	
	@EventListener
	public void emiteNota(ClienteAtivadoEvent event) {
		System.out.println("Emitindo nota fiscal para "+event.getCliente().getNome());
	}
	
}

