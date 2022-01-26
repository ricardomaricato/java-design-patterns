package br.com.maricato.loja.orcamento.situacao;

import br.com.maricato.loja.orcamento.Orcamento;

public class Reprovado extends SituacaoOrcamento {

	public void finalizar(Orcamento orcamento) {
		orcamento.setSituacao(new Finalizado());
	}
}
