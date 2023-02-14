package br.com.mhenrique.crudspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.mhenrique.crudspring.model.Curso;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Long>{
	
}
