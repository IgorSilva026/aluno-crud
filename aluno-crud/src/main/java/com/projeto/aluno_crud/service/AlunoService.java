package com.projeto.aluno_crud.service;


import com.projeto.aluno_crud.model.Aluno;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {

        private final com.seuprojeto.alunos.AlunoRepository repository;

        public AlunoService(com.seuprojeto.alunos.AlunoRepository repository) {
            this.repository = repository;
        }
    public List<Aluno> listarTodos() {
        return repository.findAll();
    }

    public Aluno salvar(Aluno aluno) {
        return repository.save(aluno);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }

    public Aluno buscarPorId(Long id) {
        return repository.findById(id).orElse(null);
    }
}
