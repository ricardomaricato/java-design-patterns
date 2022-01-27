package br.com.maricato.loja.pedido;

import br.com.maricato.loja.orcamento.Orcamento;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class GeraPedidoHandler {

	public void executa(GeraPedido dados) {
		Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeDeItens());
		Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);

		System.out.println("Salvar pedido no Banco de Dados!");
		System.out.println("Enviar email com dados do novo pedido!");
	}
}
