package br.org.cip.repositories;

import br.org.cip.entities.Cliente;

public interface ClienteRepositoryCustom {

	public Cliente buscarClientePorCPF(String cpf);
	
	public Cliente buscarClientePorNome(String nome);
	
	public Cliente buscarClientePorEmail(String email);
}
