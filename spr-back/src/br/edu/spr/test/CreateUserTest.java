package br.edu.spr.test;

import static org.junit.Assert.*;

import javax.persistence.EntityManager;

import org.junit.Test;

import br.edu.spr.model.Usuario;
import br.edu.spr.model.util.JPAUltil;

public class CreateUserTest {

	Usuario usuario; 
	@Test
	public void instanciarUsuario() {
		usuario = new Usuario();
		usuario.setEmail("teste@teste.com");
		usuario.setNome("Fulano");
		usuario.setSenha("123");
		assertTrue( usuario != null);
	}
	
	@Test
	public void persistir(){
		this.instanciarUsuario();
		
		EntityManager em = new JPAUltil().getManeger();
		em.getTransaction().begin();
		em.persist(usuario);
		em.getTransaction().commit();
		em.close();
		
		
	}

	
}
