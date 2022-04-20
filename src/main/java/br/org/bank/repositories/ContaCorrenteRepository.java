package br.org.bank.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.org.bank.entities.ContaCorrente;

@Repository
public interface ContaCorrenteRepository extends JpaRepository<ContaCorrente, Long> {

	String BUSCAR_CONTA_CORRENTE_POR_NOME_DO_BANCO = "FROM ContaCorrente cc WHERE cc.nomeBanco = :nomeBanco";

	@Query(value = BUSCAR_CONTA_CORRENTE_POR_NOME_DO_BANCO, name = BUSCAR_CONTA_CORRENTE_POR_NOME_DO_BANCO)
	ContaCorrente buscarContaCorrentePorNomeDoBanco(@Param("nomeBanco") String nomeBanco);
}
