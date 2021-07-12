package org.generation.bolgPessoal.repository.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.generation.BlogPessoal.model.Usuario;
import org.generation.BlogPessoal.repository.UsuarioRepository;
import org.generation.bolgPessoal.service.UsuarioService;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class UsuarioRespositoryTest {

	@Autowired
	private UsuarioRepository repository;

	@BeforeAll
	public void start() {
		Usuario usuario = new Usuario("Gabi", "gabi@gmail.com", "1234567");
		if (repository.findFirstByNome(usuario.getNome()) == null)
			repository.save(usuario);
		usuario = new Usuario("Gabri", "gabri@gmail.com", "7654321");
		if (repository.findFirstByNome(usuario.getNome()) == null)
			repository.save(usuario);
		usuario = new Usuario("Felipe", "fe@gmail.com", "7654321");
		if (repository.findFirstByNome(usuario.getNome()) == null)
			repository.save(usuario);
		usuario = new Usuario("Zinha", "zinha@gmail.com", "7654321");
		if (repository.findFirstByNome(usuario.getNome()) == null)
			repository.save(usuario);
	}

	@Test
	public void findByUsuarioRetornaEmail() throws Exception {

		UsuarioService usuario = repository.findByEmail("gabri@gmail.com").get();
		assertTrue(usuario.getEmail().equals("gabri@gmail.com"));
	}

	@Test
	public void findAllByNomeContainingIgnoreCaseRetornaTresNomes() {

		List<UsuarioService> listaDeUsuarios = repository.findAllByNomeContainingIgnoreCase("Felipe");
		assertEquals(3, listaDeUsuarios.size());
	}

	@AfterAll
	public void end() {
		repository.deleteAll();
	}
}