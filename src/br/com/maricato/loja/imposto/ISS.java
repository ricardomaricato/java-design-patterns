package br.com.maricato.loja.imposto;

import br.com.maricato.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class ISS extends Imposto {

	public ISS(Imposto outro) {
		super(outro);
	}

	public BigDecimal realizarCalculo(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.1"));
	}
}
