package br.com.maricato.loja;

import br.com.maricato.loja.pedido.GeraPedido;
import br.com.maricato.loja.pedido.GeraPedidoHandler;

import java.math.BigDecimal;

public class TestesPedidos {
	public static void main(String[] args) {
		String cliente = args[0];
		BigDecimal valorOrcamento = new BigDecimal(args[1]);
		int quantidadeItens = Integer.parseInt(args[2]);

		GeraPedido geraador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
		GeraPedidoHandler handler = new GeraPedidoHandler(/*dependências*/);
		handler.executa(geraador);
	}
}
