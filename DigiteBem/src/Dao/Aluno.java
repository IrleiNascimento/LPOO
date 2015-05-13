/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import java.io.Serializable;

/**
 *
 * @author Irlei
 */
public class Aluno implements Serializable, Comparable<Aluno> {
    private String nome;
    private String sobrenome;
    private String turma;
    private int pontos;
    private  int tempo;

    public Aluno(String nome, String turma, int pontos) {
        this.nome = nome;
        this.turma = turma;
        this.pontos = pontos;
    }

    public Aluno() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPontos() {
        return pontos;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    @Override
    public String toString() {
return nome+" "+ sobrenome ;   }
      @Override
    public int compareTo(Aluno t) {
        if (this.getPontos() < t.getPontos()) {
            return 1;
        } else if (this.getPontos() == t.getPontos()) {
            return 0;
        } else {
            return -1;

        }
    }
    
}
