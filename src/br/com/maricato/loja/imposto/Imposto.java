package br.com.maricato.loja.imposto;

import br.com.maricato.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public interface Imposto {

	BigDecimal calcular(Orcamento orcamento);
}
