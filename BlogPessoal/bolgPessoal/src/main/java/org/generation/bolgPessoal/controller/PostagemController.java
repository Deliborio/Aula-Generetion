package org.generation.bolgPessoal.controller;

import java.util.List;

import org.generation.bolgPessoal.model.postagem;
import org.generation.bolgPessoal.repository.PostagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/postagem")
@CrossOrigin("*")
public class PostagemController {

	@Autowired
	private PostagemRepository repository;

	@GetMapping
	public ResponseEntity<List<postagem>> GetAll() {
		return ResponseEntity.ok(repository.findAll());
	}

	@GetMapping("/id/{id}")
	public ResponseEntity<postagem> GetById(@PathVariable Integer id) {
		return ResponseEntity.status(200).body(repository.findById(id));
	}

	@GetMapping("/titulo/{titulo}")
	public ResponseEntity<List<postagem>> findByTitulo(@PathVariable String titulo) {
		return ResponseEntity.status(200).body(repository.findAllByTituloContainingIgnoreCase(titulo));
	}

	@PostMapping
	public ResponseEntity<postagem> post(@RequestBody postagem postagem) {
		return ResponseEntity.status(201).body(repository.save(postagem));
	}

	@PutMapping
	public ResponseEntity<postagem> put(@RequestBody postagem postagem) {
		return ResponseEntity.status(200).body(repository.save(postagem));
	}

	@DeleteMapping("/id/{id}")
	public void delete(@PathVariable long id) {
		repository.deleteById(id);
	}

}