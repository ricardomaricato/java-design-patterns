package br.com.maricato.loja.orcamento;

import br.com.maricato.loja.DomainExeption;
import br.com.maricato.loja.http.HttpAdapter;

import java.util.Map;

public class RegistroDeOrcamento {

	private HttpAdapter http;

	public RegistroDeOrcamento(HttpAdapter http) {
		this.http = http;
	}

	public void registrar(Orcamento orcamento) {
		if (!orcamento.isFinalizado()) {
			throw new DomainExeption("Orçamento não finalizado!");
		}
		String url = "http://api.externa/orcamento";
		Map<String, Object> dados = Map.of("valor", orcamento.getValor(),
				"quantidadeItens", orcamento.getQuantidadeItens()
		);
	}
}
