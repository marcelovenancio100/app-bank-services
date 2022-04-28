package br.org.bank.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.org.bank.entities.Fornecedor;
import br.org.bank.repositories.FornecedorRepository;

@Service
public class FornecedorService {

	@Autowired
	private FornecedorRepository fornecedorRepository;
	
	public Fornecedor salvar(Fornecedor f) {
		return fornecedorRepository.save(f);
	}
	
	public List<Fornecedor> buscarTodosOsFornecedores() {
		return fornecedorRepository.findAll();
	}
	
	public List<Fornecedor> findAllByGenero(Integer genero) {
		return fornecedorRepository.findAllByGenero(genero);
	}
}
