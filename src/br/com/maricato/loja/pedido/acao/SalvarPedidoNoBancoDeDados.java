package br.com.maricato.loja.pedido.acao;

import br.com.maricato.loja.pedido.Pedido;

public class SalvarPedidoNoBancoDeDados implements AcaoAposGerarPedido {

	public void executarAcao(Pedido pedido) {
		System.out.println("Salvando pedido no banco de dados!");
	}
}
