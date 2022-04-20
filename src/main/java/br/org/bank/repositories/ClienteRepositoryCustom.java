package br.org.bank.repositories;

import br.org.bank.entities.Cliente;

public interface ClienteRepositoryCustom {

	public Cliente buscarClientePorCPF(String cpf);
	
	public Cliente buscarClientePorNome(String nome);
	
	public Cliente buscarClientePorEmail(String email);
}
