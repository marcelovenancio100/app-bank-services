package br.org.bank.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.org.bank.entities.Cliente;
import br.org.bank.repositories.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	public Cliente salvar(Cliente c) {
		return clienteRepository.save(c);
	}
	
	public List<Cliente> buscarTodosOsClientes() {
		return clienteRepository.findAll();
	}
	
	public Cliente consultarClientePorCPF(String cpf) {
		return clienteRepository.buscarClientePorCPF(cpf);
	}
}
