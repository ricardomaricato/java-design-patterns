package br.com.maricato.loja;

import br.com.maricato.loja.http.JavaHttpClient;
import br.com.maricato.loja.orcamento.ItemOrcamento;
import br.com.maricato.loja.orcamento.Orcamento;
import br.com.maricato.loja.orcamento.RegistroDeOrcamento;

import java.math.BigDecimal;

public class TestesAdapter {
	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento();
		orcamento.adicionarItem(new ItemOrcamento(new BigDecimal("100")));
		orcamento.aprovar();
		orcamento.finalizar();

		RegistroDeOrcamento registroDeOrcamento = new RegistroDeOrcamento(new JavaHttpClient());
		registroDeOrcamento.registrar(orcamento);
	}
}
