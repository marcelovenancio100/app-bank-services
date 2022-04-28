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

import br.org.bank.entities.Fornecedor;
import br.org.bank.services.FornecedorService;

@RestController
@RequestMapping("/api/v1/fornecedor")
public class FornecedorController {

	@Autowired
	private FornecedorService fornecedorService;
	
	@PostMapping()
	public ResponseEntity<Fornecedor> incluirFornecedor(@Valid @RequestBody Fornecedor f) {
		return new ResponseEntity<Fornecedor>(fornecedorService.salvar(f), HttpStatus.CREATED);
	}
	
	@GetMapping()
	public ResponseEntity<List<Fornecedor>> buscarTodosOsFornecedores(Long id) {
		return new ResponseEntity<List<Fornecedor>>(fornecedorService.buscarTodosOsFornecedores(), HttpStatus.OK);
	}
	
//	@PutMapping("/{id}")
//	public ResponseEntity<Fornecedor> editarFornecedor(@Valid @RequestBody Fornecedor f, @RequestParam Long id) {
//		f.setId(id);
//		return new ResponseEntity<Fornecedor>(fornecedorService.editar(f), HttpStatus.OK);
//	}
	
	//TODO Implementar exclusão
	//TODO Implementar findById
}
