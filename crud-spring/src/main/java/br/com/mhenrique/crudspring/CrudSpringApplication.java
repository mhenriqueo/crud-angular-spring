package br.com.mhenrique.crudspring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import br.com.mhenrique.crudspring.model.Curso;
import br.com.mhenrique.crudspring.repository.CursoRepository;

@SpringBootApplication
public class CrudSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudSpringApplication.class, args);
	}
	
	@Bean
	CommandLineRunner initDatabase(CursoRepository cursoRepository) {
		return args -> {
			cursoRepository.deleteAll();
			
			Curso curso = new Curso();
			curso.setNome("Angular");
			curso.setCategoria("Front-End");
			
			cursoRepository.save(curso);
		};
	}

}
