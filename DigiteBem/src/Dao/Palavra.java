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
public class Palavra implements Serializable{

    private String texto;
    private int tema;
    private int nivel;

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getTema() {
        return tema;
    }

    public void setTema(int tema) {
        this.tema = tema;
    }

    public String getTexto() {
        return texto;
    }

    @Override
    public String toString() {
        return "Palavra{" + "texto=" + texto + ", tema=" + tema + ", nivel=" + nivel + '}';
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

}
