package br.com.maricato.loja;

import br.com.maricato.loja.http.JavaHttpClient;
import br.com.maricato.loja.orcamento.Orcamento;
import br.com.maricato.loja.orcamento.RegistroDeOrcamento;

import java.math.BigDecimal;

public class TestesAdapter {
	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(BigDecimal.TEN, 1);
		orcamento.aprovar();
		orcamento.finalizar();

		RegistroDeOrcamento registroDeOrcamento = new RegistroDeOrcamento(new JavaHttpClient());
		registroDeOrcamento.registrar(orcamento);
	}
}
