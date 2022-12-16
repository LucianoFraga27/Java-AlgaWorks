package com.ex1.servico;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.ex1.modelo.Cliente;
import com.ex1.notificacao.NivelUrgencia;
import com.ex1.notificacao.Notificador;
import com.ex1.notificacao.TipoDoNotificador;

@Component
public class AtivacaoClienteServico {
	
	@TipoDoNotificador(NivelUrgencia.SEM_URGENCIA)
	@Autowired
	private Notificador notificador;
	

	public void ativar(Cliente cliente) {
		cliente.ativar();
	
		notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
		

	}
	
}
