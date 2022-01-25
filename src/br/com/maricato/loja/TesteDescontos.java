package br.com.maricato.loja;

import br.com.maricato.loja.desconto.CalculadoraDeDescontos;
import br.com.maricato.loja.imposto.CalculadoraDeImpostos;
import br.com.maricato.loja.imposto.ISS;
import br.com.maricato.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TesteDescontos {
	public static void main(String[] args) {
		Orcamento primeiro = new Orcamento(new BigDecimal("200"), 6);
		Orcamento segundo = new Orcamento(new BigDecimal("1000"), 1);

		CalculadoraDeDescontos calculadoraDeDescontos = new CalculadoraDeDescontos();
		System.out.println(calculadoraDeDescontos.calcular(primeiro));
		System.out.println(calculadoraDeDescontos.calcular(segundo));
	}
}
