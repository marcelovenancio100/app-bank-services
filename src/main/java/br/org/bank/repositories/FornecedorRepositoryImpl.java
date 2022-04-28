package br.org.bank.repositories;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.org.bank.entities.Fornecedor;

public class FornecedorRepositoryImpl implements FornecedorRepositoryCustom {
	
	@PersistenceContext
	EntityManager entityManager;

	@Override
	public List<Fornecedor> findAllByGenero(Integer genero) {
		//ISSO É SQL PARA POSTGRES
		String select = "SELECT * FROM Fornecedor WHERE genero = " + genero + " ORDER BY codigo DESC LIMIT 10";
		
		//ISSO É HQL
		String selectWithHQL = "FROM Fornecedor f ORDER BY codigo DESC";
		
		if (genero.equals(Fornecedor.GENERO_MASCULINO)) {
			select += "";
		} else {
			select += "AND codigo LIKE 'MA%'";
		}
		
		select += "";
		
		//return entityManager.createNativeQuery(select, Fornecedor.class).getResultList();
		return entityManager.createQuery(selectWithHQL, Fornecedor.class).setParameter("genero", genero).setMaxResults(10).getResultList();
	}

}
