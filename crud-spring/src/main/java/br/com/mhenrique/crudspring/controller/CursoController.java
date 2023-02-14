package br.com.mhenrique.crudspring.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.mhenrique.crudspring.model.Curso;
import br.com.mhenrique.crudspring.service.CursoService;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/cursos")
@AllArgsConstructor
public class CursoController {
	
	private final CursoService cursoService;
	
//	@PostMapping
//	public Curso cadastrarCurso(Curso curso) {
//		return cursoService.cadastrarCurso(curso);
//	}
	
	@GetMapping
	public List<Curso> listaDeCursos(){
		return cursoService.listaDeCursos();
	}
	
}
