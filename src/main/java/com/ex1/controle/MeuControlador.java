package com.ex1.controle;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ex1.servico.AtivacaoClienteServico;

@Controller
public class MeuControlador {
	
	private AtivacaoClienteServico ativacaoClienteServico;
	
	public MeuControlador(AtivacaoClienteServico ativacaoClienteServico) {
		this.ativacaoClienteServico = ativacaoClienteServico;
		System.out.println("MeuControlador: "+ativacaoClienteServico);
	}

	@GetMapping("/hello")
	@ResponseBody
	public String hello() {
		return "hello";
	}
	
}
