/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Autenticacao;

import DaO.Usuario;
import java.util.Properties;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.swing.JOptionPane;

/**
 *
 * @author Irlei
 */
public class Sessao {

    public Session configuraConexao(final Usuario usuario) {
        
        Session sessao = null;
        
        Properties props = new Properties();  // Estrutura de Dados hashTable

        // Parâmetros de conexão com servidor Hotmail
        if (usuario.getEmail().contains("@hotmail.com")) {
            props.put("mail.transport.protocol", "smtp");
            props.put("mail.smtp.host", "smtp.live.com");
            props.put("mail.smtp.socketFactory.port", "587");  //mapa
            props.put("mail.smtp.socketFactory.fallback", "false");
            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.port", "587");
JOptionPane.showMessageDialog(null, "Sessão pronta para @hotmail.com");
            return sessao = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
                @Override
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(usuario.getEmail(), usuario.getSenha());
                }
            });
            // Parâmetros para conexão com servidor gmail
        } else if (usuario.getEmail().contains("@gmail.com")) {
            props.put("mail.smtp.host", "smtp.gmail.com");
            props.put("mail.smtp.socketFactory.port", "465");
            props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.port", "465");
            
JOptionPane.showMessageDialog(null, "Sessão pronta para @gmail.com");
            return sessao = Session.getDefaultInstance(props, new javax.mail.Authenticator() {

                @Override
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(usuario.getEmail(), usuario.getSenha());
                }
            });


        } else {
            
            JOptionPane.showMessageDialog(null, "Serviço indisponivel para o email informado");
            return null;
        }
    }
}
