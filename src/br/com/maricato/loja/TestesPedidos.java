package br.com.maricato.loja;

import br.com.maricato.loja.pedido.GeraPedido;
import br.com.maricato.loja.pedido.GeraPedidoHandler;
import br.com.maricato.loja.pedido.acao.EnviarEmailPedido;
import br.com.maricato.loja.pedido.acao.SalvarPedidoNoBancoDeDados;

import java.math.BigDecimal;
import java.util.Arrays;

public class TestesPedidos {
	public static void main(String[] args) {
		String cliente = "Ricardo";
		BigDecimal valorOrcamento = new BigDecimal("300");
		int quantidadeItens = Integer.parseInt("2");

		GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
		GeraPedidoHandler handler = new GeraPedidoHandler(
				Arrays.asList(new SalvarPedidoNoBancoDeDados(),
						new EnviarEmailPedido())
		);
		handler.executa(gerador);
	}
}
