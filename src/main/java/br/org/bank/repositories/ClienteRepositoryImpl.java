package br.org.bank.repositories;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.org.bank.entities.Cliente;

public class ClienteRepositoryImpl implements ClienteRepositoryCustom {
	
	@PersistenceContext
	EntityManager entityManager;

	@Override
	public Cliente buscarClientePorCPF(String cpf) {
		return entityManager.createQuery("FROM Cliente c WHERE c.ni = :ni", Cliente.class)
				.setParameter("ni", cpf)
				.getSingleResult();
	}

	@Override
	public Cliente buscarClientePorNome(String nome) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente buscarClientePorEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}
}
