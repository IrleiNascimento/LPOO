package Teste;


import Controle.UsuarioControle;
import DaO.Anexo;
import DaO.Contato;
import DaO.Mensagem;
import DaO.Usuario;
/**
 *
 * @author Irlei
 */
public class AppEmailTeste {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Rementente
        ///////////////IMPORTANTE///////////////////////////////////////////////
        /*Muita Atenção nessa parte pois, será necessário dados reais de sua conta de email
         * Depois do teste apague as informações inseridas para que niguem venha a vizualizar esse 
         * codigo e assim obter os dados de login do seu email. 
         * Recomendo um pouco de pesquisa sobre o JavaMail para adquirir mais confiança
         sobre assunto.*/
        Usuario usuario = new Usuario("senha", "nomeUsuario", "usuario@hotmail.com");
        //Usuario que ira efetuar login
        UsuarioControle user = new UsuarioControle();
        user.setUsuario(usuario);
       //MENSAGEM
      //////////////////////////////////////////////////////////////  
        Mensagem msg = new Mensagem();
          
        //Assunto e corpo da mensagem      
        msg.setAssunto("Email Teste");
        msg.setConteudo("Voce recebeu uma Mensagem de teste");
        //Anexo 
        Anexo anexo = new Anexo();
        anexo.setNomeDoArquivo("nomeDoAnexo");
        anexo.setLocalDoArquivo("C:/caminhoDoArquivo/anexo.txt");
        msg.addAnexo(anexo);
        //Destinatário
        Contato destinatario = new Contato("nomeDestinatario", "emailDestinatario@hotmail.com");
        msg.addDestinatario(destinatario);
        ///////////////////////////////////////////////////////////////////////////////      

        //para enviar a mensagem é preciso prepara a sessão
        user.logar();//validando o endereço de email e preparando a sessão
        user.getMensagemControle().setMensagem(msg);//Mensagem que será enviada
        user.enviarMensagem();//Enviando mensagem
    }
}
