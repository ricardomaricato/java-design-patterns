package br.com.maricato.loja.desconto;

import br.com.maricato.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class Desconto {

	protected Desconto proximo;

	public abstract BigDecimal calcular(Orcamento orcamento);

	public Desconto(Desconto proximo) {
		this.proximo = proximo;
	}
}
