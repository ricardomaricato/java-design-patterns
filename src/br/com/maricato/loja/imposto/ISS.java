package br.com.maricato.loja.imposto;

import br.com.maricato.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class ISS implements Imposto {

	public BigDecimal calcular(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.1"));
	}
}
