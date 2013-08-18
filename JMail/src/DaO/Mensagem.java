package DaO;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Irlei
 */
public class Mensagem {

    private String assunto;
    private String conteudo;
    private List<Anexo> anexos;
    private Pessoa remetente;
    private List<Contato>destinatarios;  
    private boolean anexo;
    
    public Mensagem() {
    }

    public Mensagem(String assunto, String conteudo, List<Anexo>  anexo, Pessoa remetente, List<Contato>  destinatario) {
        this.assunto = assunto;
        this.conteudo = conteudo;
        this.anexos = anexo;
        this.remetente = remetente;
        this.destinatarios = destinatario;        
    }

    public List<Anexo> getAnexos() {
        return anexos;
    }

    public List<Contato> getDestinatarios() {
        return destinatarios;
    }

    public void addAnexo(Anexo anexo) {
        if(this.anexos ==null)
            this.anexos=new ArrayList<>(); 
        
        this.anexos.add(anexo);
        this.setAnexo(true);
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public boolean isAnexo() {
        return anexo;
    }

    public void setAnexo(boolean anexo) {
        this.anexo = anexo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }   

    public void addDestinatario(Contato destinatario) {
        if(this.destinatarios==null)
            this.destinatarios = new ArrayList<>();
        
        this.destinatarios.add(destinatario);
    }  

    public Pessoa getRemetente() {
        return remetente;
    }

    public void setRemetente(Pessoa pessoa) {
        this.remetente = pessoa;
    }  

    @Override
    public String toString() {
        return assunto;
    }
}
