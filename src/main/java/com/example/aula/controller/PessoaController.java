package com.example.aula.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.aula.core.model.entity.Pessoa;

import reactor.core.publisher.Mono;

@RequestMapping("/pessoa")
public interface PessoaController {

	@GetMapping("/all")
	Mono<List<Pessoa>> getPessoas();

	@PostMapping("/save")
	Mono<Pessoa> savePessoa(@RequestBody Pessoa pessoa);
	
	@DeleteMapping("/delete")
	void deletePessoa(@RequestParam("params") Long pessoa);
	
	@PutMapping("/edit")
	Mono<Pessoa> editPessoa(@RequestBody Pessoa pessoa);


}
