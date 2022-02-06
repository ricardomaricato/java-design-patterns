package br.com.maricato.loja;

import br.com.maricato.loja.imposto.CalculadoraDeImpostos;
import br.com.maricato.loja.imposto.ISS;
import br.com.maricato.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesImpostos {
	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(new BigDecimal("100"), 1);
		CalculadoraDeImpostos calculadoraDeImpostos = new CalculadoraDeImpostos();
		System.out.println(calculadoraDeImpostos.calcular(orcamento, new ISS(null)));
	}
}
