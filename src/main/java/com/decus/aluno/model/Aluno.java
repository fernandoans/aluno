package com.decus.aluno.model;

public class Aluno {

    private int matricula;
    private String nome;
    private String email;
    private char genero;

    public Aluno(int matricula, String nome, String email, char genero) {
        this.matricula = matricula;
        this.nome = nome;
        this.email = email;
        this.genero = genero;
    }

    public Aluno() {
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }
}
