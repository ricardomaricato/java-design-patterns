package br.com.maricato.loja.pedido;

import br.com.maricato.loja.orcamento.ItemOrcamento;
import br.com.maricato.loja.orcamento.Orcamento;
import br.com.maricato.loja.pedido.acao.AcaoAposGerarPedido;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class GeraPedidoHandler {

	private List<AcaoAposGerarPedido> acoes;

	public GeraPedidoHandler(List<AcaoAposGerarPedido> acoes) {
		this.acoes = acoes;
	}

	public void executa(GeraPedido dados) {
		Orcamento orcamento = new Orcamento();
		orcamento.adicionarItem(new ItemOrcamento(new BigDecimal("100")));
		Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);

		acoes.forEach(a -> a.executarAcao(pedido));
	}
}
