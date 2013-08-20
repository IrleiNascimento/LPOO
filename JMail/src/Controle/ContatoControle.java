/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import DaO.Contato;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Irlei
 */
public class ContatoControle  { /*A principio, não precisaremos dessa classe para fazer o teste de envio.
 essa classe Controladora será utilizada para armazenar os contatos em arquivos */   

    private List<Contato> contatos;   
  
    public void addContato(Contato novo){
    if(this.contatos == null)
    this.contatos = new ArrayList();
    
    this.contatos.add(novo);
    }

     public List<Contato> getContato() {
        return contatos;
    }

    public void setContato(List<Contato> contato) {
        this.contatos = contato;
    }
    
    
    public void remover() { } 
    public void editar() { } 
    public void salvar(Contato contato) { }    
  

    
}
