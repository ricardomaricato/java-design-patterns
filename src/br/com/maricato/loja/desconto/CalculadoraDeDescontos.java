package br.com.maricato.loja.desconto;

import br.com.maricato.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDescontos {

	public BigDecimal calcular(Orcamento orcamento) {
		Desconto cadeiaDeDesconto = new DescontoParaOrcamentoComMaisDeCincoItens(
				new DescontoParaOrcamentoComValorMaiorQueQuinhentos(
						new SemDesconto()));

		return cadeiaDeDesconto.calcular(orcamento);
	}
}
