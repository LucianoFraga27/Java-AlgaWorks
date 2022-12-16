package com.ex1.notificacao;

import com.ex1.modelo.Cliente;

public interface Notificador {
	void notificar(Cliente cliente, String mensagem);
}
