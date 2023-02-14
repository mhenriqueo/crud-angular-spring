package br.com.mhenrique.crudspring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.mhenrique.crudspring.model.Curso;
import br.com.mhenrique.crudspring.repository.CursoRepository;

@Service
public class CursoService {

	@Autowired
	private CursoRepository cursoRepository;
	
//	public Curso cadastrarCurso(Curso curso) {
//		return cursoRepository.save(curso);
//	}
	
	public List<Curso> listaDeCursos(){
		return cursoRepository.findAll();
	}
}
