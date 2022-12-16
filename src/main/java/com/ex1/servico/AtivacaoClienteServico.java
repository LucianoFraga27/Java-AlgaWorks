package com.ex1.servico;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.ex1.modelo.Cliente;
import com.ex1.notificacao.NivelUrgencia;
import com.ex1.notificacao.Notificador;
import com.ex1.notificacao.TipoDoNotificador;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

//@Component
public class AtivacaoClienteServico implements InitializingBean, DisposableBean {
	
	@TipoDoNotificador(NivelUrgencia.SEM_URGENCIA)
	@Autowired
	private Notificador notificador;
	
	
	//callback's
	//@PostConstruct
	public void init() {
		System.out.println("INIT "+notificador);
	}
	
	//@PreDestroy
	public void destroy() {
		System.out.println("DESTROY");
	}
	

	public void ativar(Cliente cliente) {
		cliente.ativar();
	
		notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		
	}
	
}
