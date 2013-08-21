/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import DaO.Contato;
import DaO.Usuario;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Irlei
 */
public class JMailUtil {    
    //Apenas para não precisar fiacr fazendo Cast a todo momento e ficar importando a classe Object
    public  static Contato [] getArrayDestinatarios(List contato) {
        Contato[] destin = new Contato[contato.size()];
        Iterator it = contato.iterator();
        int i = 0;
        while (it.hasNext()) {
           destin[i] = (Contato) it.next();
            i++;
        }
        return destin;
    }   
    
    //verifica apenas a terminação do email
       public static boolean validarEmail(Usuario usuario) {
        if (usuario.getEmail().contains("@hotmail.com") || usuario.getEmail().contains("@gmail.com")) {
            
            return true;
        }
        JOptionPane.showMessageDialog(null, "Email parece estar incorreto");
        return false;
    }
    
}
