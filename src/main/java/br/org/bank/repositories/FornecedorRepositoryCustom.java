package br.org.bank.repositories;

import java.util.List;

import br.org.bank.entities.Fornecedor;

public interface FornecedorRepositoryCustom {

	public List<Fornecedor> findAllByGenero(Integer genero);
}
