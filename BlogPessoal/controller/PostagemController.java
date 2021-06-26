package org.generation.bolgPessoal.controller;

import java.util.List;

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
@RequestMapping("/postagens")
@CrossOrigin("*")
public class PostagemController<postagem> {

	
	@Autowired
	private  PostagemRepository repository;
	

	@GetMapping("/findAll")
	public ResponseEntity<List<org.generation.bolgPessoal.model.postagem>> findAll() {

		return ResponseEntity.ok(repository.findAll());
	}

	@SuppressWarnings("unchecked")
	@GetMapping("/findById/{id}")
	public ResponseEntity<postagem> findById(@PathVariable(value = "id") long id) {
		return (ResponseEntity<postagem>) repository.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}

	@GetMapping("/getByTitulo/{titulo}")
	public ResponseEntity<List<org.generation.bolgPessoal.model.postagem>> getByTitulo(@PathVariable(value = "titulo") String textoEscrito) {
		return ResponseEntity.ok(repository.findAllByTituloContainingIgnoreCase(textoEscrito));
	}
	
	@PostMapping("/postar")
	public ResponseEntity<postagem> post (@RequestBody postagem postagem){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(postagem));
		
	}
	@PutMapping("/trocar")
	public ResponseEntity<postagem> put (@RequestBody postagem postagem){
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(postagem));
		
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		repository.deleteById(id);
	}
	
}
