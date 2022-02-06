package br.com.maricato.loja;

import br.com.maricato.loja.desconto.CalculadoraDeDescontos;
import br.com.maricato.loja.imposto.CalculadoraDeImpostos;
import br.com.maricato.loja.imposto.ISS;
import br.com.maricato.loja.orcamento.ItemOrcamento;
import br.com.maricato.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TesteDescontos {
	public static void main(String[] args) {
		Orcamento primeiro = new Orcamento();
		primeiro.adicionarItem(new ItemOrcamento(new BigDecimal("200")));

		Orcamento segundo = new Orcamento();
		segundo.adicionarItem(new ItemOrcamento(new BigDecimal("1000")));

		Orcamento terceiro = new Orcamento();
		terceiro.adicionarItem(new ItemOrcamento(new BigDecimal("500")));

		CalculadoraDeDescontos calculadoraDeDescontos = new CalculadoraDeDescontos();
		System.out.println(calculadoraDeDescontos.calcular(primeiro));
		System.out.println(calculadoraDeDescontos.calcular(segundo));
		System.out.println(calculadoraDeDescontos.calcular(terceiro));
	}
}
