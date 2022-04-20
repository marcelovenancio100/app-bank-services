package br.org.bank.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.org.bank.entities.ContaCorrente;
import br.org.bank.repositories.ContaCorrenteRepository;

@Service
public class ContaCorrenteService {

	@Autowired
	private ContaCorrenteRepository contaCorrenteRepository;
	
	public ContaCorrente salvar(ContaCorrente cc) {
		return contaCorrenteRepository.save(cc);
	}
}
