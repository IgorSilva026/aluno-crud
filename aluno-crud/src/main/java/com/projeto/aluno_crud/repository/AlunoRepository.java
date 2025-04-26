package com.seuprojeto.alunos;

import com.projeto.aluno_crud.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}