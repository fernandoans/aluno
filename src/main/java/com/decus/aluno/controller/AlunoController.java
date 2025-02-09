package com.decus.aluno.controller;

import com.decus.aluno.model.Aluno;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    private Aluno aluno;

    @GetMapping("/{matricula}")
    public ResponseEntity<Aluno> getAluno(@PathVariable int matricula) {
        return ResponseEntity.ok(aluno);
    }

    @PostMapping
    public ResponseEntity<Aluno> createAluno(@RequestBody Aluno aluno) {
        this.aluno = aluno;
        return new ResponseEntity<>(aluno, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<String> updateAluno(@RequestBody Aluno aluno) {
        this.aluno = aluno;
        return ResponseEntity.ok("Aluno modificado com sucesso");
    }

    @DeleteMapping("/{matricula}")
    public ResponseEntity<String> deleteAluno(@PathVariable int matricula) {
        this.aluno = null;
        return ResponseEntity.ok("Aluno excluído com sucesso");
    }
}
