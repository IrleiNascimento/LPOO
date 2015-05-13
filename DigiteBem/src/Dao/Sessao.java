/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Irlei
 */
public class Sessao implements Serializable{

    private static final long serialVersionUID = 1L;
    private List<Aluno> alunos;
    private List<Palavra> palavras;
    private List<String> temas;
    private int nivel;
    private int tempo;
    private Aluno jogador;
    private int tema;

    public Sessao(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public Sessao() {
    }

    public List<Aluno> getAlunos() {
        if (this.alunos == null) {
            this.alunos = new ArrayList<>();
        }

        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public List<Palavra> getPalavras() {
        if (this.palavras == null) {
            this.palavras = new ArrayList<>();
        }
        return palavras;
    }

    public Aluno getJogador() {
        return jogador;
    }

    public int getTema() {
        return tema;
    }

    public void setTema(int tema) {
        this.tema = tema;
    }

    public void setJogador(Aluno jogador) {
        this.jogador = jogador;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getTempo() {
        return tempo;
    }

    public List<String> getTemas() {

        if (this.temas == null) {
            this.temas = new ArrayList<>();
        }
        return temas;
    }

    public void setTemas(List<String> temas) {
        this.temas = temas;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    public void setPalavras(List<Palavra> palavras) {
        this.palavras = palavras;
    }

    public void addAluno(Aluno al) {
        if (al != null) {
            if (this.alunos == null) {
                alunos = new ArrayList<>();
                alunos.add(al);
            } else if (!this.alunos.contains(al)) {
                alunos.add(al);
            }

        }
    }

    public void addPalavra(Palavra pa) {
        if (pa != null) {
            if (this.palavras == null) {
                palavras = new ArrayList<>();
                palavras.add(pa);
            } else if (!this.palavras.contains(pa)) {
                palavras.add(pa);
            }

        }
    }

    public void addTema(String tema) {
        if (tema != null) {
            if (this.temas == null) {
                this.temas = new ArrayList<>();
                this.temas.add(tema);
            } else if (!this.temas.contains(tema)) {
                this.temas.add(tema);
            }

        }
    }

    public List<Aluno> getListAlunos(String turma) {
        List<Aluno> result = new ArrayList<>();
        for (Aluno al : this.getAlunos()) {
            if (al.getTurma().equals(turma)) {
                result.add(al);
            }
        }
        return result;
    }

    public List<Palavra> getListPalavras(int nivel, int tema) {
        List<Palavra> result = new ArrayList<>();
        for (Palavra p : this.getPalavras()) {
            if (p.getNivel() == nivel && p.getTema() == tema) {
                result.add(p);
            }
        }
        return result;

    }

    @Override
    public String toString() {
        return "Sessao{" + "alunos=" + alunos + ", palavras=" + palavras + ", temas=" + temas + ", nivel=" + nivel + ", tempo=" + tempo + ", jogador=" + jogador + ", tema=" + tema + '}';
    }

  
}
