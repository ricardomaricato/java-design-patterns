package br.com.maricato.loja.pedido.acao;

import br.com.maricato.loja.pedido.Pedido;

public class EnviarEmailPedido implements AcaoAposGerarPedido {

	public void executarAcao(Pedido pedido) {
		System.out.println("Enviando email com dados do pedido!");
	}
}
