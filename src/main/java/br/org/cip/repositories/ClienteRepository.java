package br.org.cip.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.org.cip.entities.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long>, ClienteRepositoryCustom {

}
