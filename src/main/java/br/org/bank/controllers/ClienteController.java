package br.org.bank.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.org.bank.entities.Cliente;
import br.org.bank.services.ClienteService;

@RestController
@RequestMapping("/api/v1/cliente")
public class ClienteController {

	@Autowired
	private ClienteService clienteService;
	
	@PostMapping
	public ResponseEntity<Cliente> incluirCliente(@Valid @RequestBody Cliente c) {
		return new ResponseEntity<Cliente>(clienteService.salvar(c), HttpStatus.CREATED);
	}
	
	@GetMapping
	public ResponseEntity<List<Cliente>> buscarTodosOsClientes() {
		return new ResponseEntity<List<Cliente>>(clienteService.buscarTodosOsClientes(), HttpStatus.OK);
	}
}