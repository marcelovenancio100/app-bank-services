package br.org.cip.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.org.cip.entities.ContaCorrente;
import br.org.cip.repositories.ContaCorrenteRepository;

@Service
public class ContaCorrenteService {

	@Autowired
	private ContaCorrenteRepository contaCorrenteRepository;
	
	public ContaCorrente salvar(ContaCorrente cc) {
		return contaCorrenteRepository.save(cc);
	}
}
