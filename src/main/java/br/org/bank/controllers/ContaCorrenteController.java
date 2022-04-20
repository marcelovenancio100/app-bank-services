package br.org.bank.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.org.bank.entities.ContaCorrente;
import br.org.bank.services.ContaCorrenteService;

@RestController
@RequestMapping("/api/v1/contaCorrente")
public class ContaCorrenteController {

	@Autowired
	private ContaCorrenteService contaCorrenteService;
	
	@PostMapping
	public ResponseEntity<ContaCorrente> incluirContaCorrente(@Valid @RequestBody ContaCorrente cc) {
		return new ResponseEntity<ContaCorrente>(contaCorrenteService.salvar(cc), HttpStatus.CREATED);
	}
}
