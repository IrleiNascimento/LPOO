/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import DaO.Contato;
import DaO.Mensagem;
import Util.JMailUtil;
import javax.mail.MessagingException;
import javax.mail.internet.MimeBodyPart;
/**
 *
 * @author Irlei
 */
public class MensagemControle {

    private Mensagem mensagem;

    public Mensagem getMensagem() {
        return mensagem;
    }    

    public void setMensagem(Mensagem mensagem) {
        this.mensagem = mensagem;
    }    

    public Contato[] getArrayDestinatarios() {
        return JMailUtil.getArrayDestinatarios(this.mensagem.getDestinatarios());
    }
    
/*Para que o corpo(Texto) da mensagem seja colocado no "envelope", o mesmo precisa esta em um  MimeBodyPart */
    public MimeBodyPart addTexto(Mensagem msg) throws MessagingException {
        MimeBodyPart mbp = null;
        if (msg.getConteudo() != null) {
            mbp = new MimeBodyPart();
            mbp.setText(msg.getConteudo()); // corpo da mensagem
        }
        return mbp;
    }
    
    
    /*Pensaremos nesses métodos quando a parte grafica for criada*/
    public void excluir(Mensagem msg) {  }    
    public void editar(Mensagem msg) {  }
    public void salvar(Mensagem msg) {  }
}
