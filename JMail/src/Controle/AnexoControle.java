package Controle;

import DaO.Anexo;
import java.util.Iterator;
import java.util.List;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Part;
import javax.mail.internet.MimeBodyPart;

/**
 *
 * @author Irlei
 */
public class AnexoControle {

    private Anexo anexo;
  

    public Anexo getAnexo() {
        return anexo;
    }

    public void setAnexo(Anexo anexo) {
        this.anexo = anexo;
    }   
   
    public void removerAnexo(){} // será implementado quando a parte grafica for criada
    

    /*Esse metodo irá empacontar todos os anexos aqui é utilizado o PADRÃO COMPOSITE
     As informaçãoes do anexo é colocada em  MimeBodyPart e esse por sua vez é colocado em Multipart que é o "envelope da mensagem"*/
    public void anexarArquivo(Multipart mp, List<Anexo> anexo) throws MessagingException {
        
        MimeBodyPart[] mbp = new MimeBodyPart[anexo.size()];
        Iterator it = anexo.iterator();
        int i = 0;
        for(Anexo anx : anexo){                     
                mbp[i] = new MimeBodyPart();
                DataSource caminhoDoArquivo = new FileDataSource(anx.getLocalDoArquivo()); // caminho do arquivo
                mbp[i].setDataHandler(new DataHandler(caminhoDoArquivo));
                mbp[i].setFileName(anx.getNomeDoArquivo());
                mbp[i].setDisposition(Part.ATTACHMENT);
                mp.addBodyPart(mbp[i]);
                i++;
            
        }
        }

    }

