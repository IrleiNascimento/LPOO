/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import DaO.Usuario;
import java.util.Date;
import javax.mail.*;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
/**
 *
 * @author Irlei
 */
public class UsuarioControle {

    private Usuario usuario;
    private MensagemControle mensagemControle;
    private AnexoControle anexoControle;
    private ContatoControle contatoControle;
    private Session sessao;

    public UsuarioControle() {
        this.usuario = new Usuario();
    }

    public AnexoControle getAnexoControle() {
        return anexoControle;
    }

    public void setAnexoControle(AnexoControle anexoControle) {
        this.anexoControle = anexoControle;
    }

    public ContatoControle getContatoControle() {
        return contatoControle;
    }

    public void setContatoControle(ContatoControle contatoControle) {
        this.contatoControle = contatoControle;
    }

    public MensagemControle getMensagemControle() {
        return mensagemControle;
    }

    public void setMensagemControle(MensagemControle mensagemControle) {
        this.mensagemControle = mensagemControle;
    }

    public Session getSessao() {
        return sessao;
    }

    public void setSessao(Session sessao) {
        this.sessao = sessao;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Message preparaMensagem() throws AddressException, MessagingException {
        //prepara a mensagem
        Message message = new MimeMessage(this.getSessao());
        // Rementente
        message.setFrom(new InternetAddress(this.getUsuario().getEmail())); // email do remetente
       //Destinatarios
        message.setRecipients(Message.RecipientType.TO, this.mensagemControle.getArrayDestinatarios());
       //Assunto
        message.setSubject(this.mensagemControle.getMensagem().getAssunto());
        //Container para o texto e os anexos
        Multipart mp = new MimeMultipart();  //recebe  texto e tambem   anexo;
        //corpo da mensagem (texto)
        mp.addBodyPart(this.mensagemControle.addTexto(this.mensagemControle.getMensagem()));
        //anexo      
        if (this.mensagemControle.getMensagem().isAnexo()) {
            this.anexoControle.anexarArquivo(mp, this.mensagemControle.getMensagem().getAnexos());
        }
        message.setContent(mp);
        message.setSentDate(new Date());
        message.saveChanges();
        return message;
    }
    
    public void enviarMensagem() {
        boolean envio = false;
        this.getSessao().setDebug(true);
        try {
            Transport.send(this.preparaMensagem());               
        } catch (MessagingException e) {
           System.out.println(e.getMessage());
        }   
    }   
    
    public void carregarHistoricoDoUsuario() { }/*dados do usuário que estarão armazenados em arquivos.
     Pensaremos nela mais tarde*/
}
