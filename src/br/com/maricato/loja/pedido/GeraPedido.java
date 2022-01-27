package br.com.maricato.loja.pedido;

import java.math.BigDecimal;

public class GeraPedido {

	private String cliente;
	private BigDecimal valorOrcamento;
	private int quantidadeDeItens;

	public GeraPedido(String nome, BigDecimal valorOrcamento, int quantidadeDeItens) {
		this.cliente = nome;
		this.valorOrcamento = valorOrcamento;
		this.quantidadeDeItens = quantidadeDeItens;
	}

	public String getCliente() {
		return cliente;
	}

	public BigDecimal getValorOrcamento() {
		return valorOrcamento;
	}

	public int getQuantidadeDeItens() {
		return quantidadeDeItens;
	}
}
