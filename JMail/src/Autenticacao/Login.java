package Autenticacao;

import Controle.AnexoControle;
import Controle.ContatoControle;
import Controle.MensagemControle;
import Controle.UsuarioControle;
import Util.JMailUtil;

public final class Login {  
    
    private Sessao sessao;
    
    /*O UsuarioControle  que chegar como paramentro tem apenas o Usuário instaniado, logo apos validação do seu email
     todos os outros atributos receberão instancias A mai importante delas é a Session  que carrega comsigo todas as propriedade
     do PROVEDOR  de email   como  protocolo,  socket  porta   etc. Sem ela jamais poderiamos enviar o email */
    public Login(UsuarioControle usuarioControle) {  
        /*A validação do email  se da apenas com a termiação  @hotmail.com   ou @gmail.com   caso voce informe o inicio do endereco 
         de forma errada,  esse será rejeitado  no ato do envio  da mensagem*/
        if (JMailUtil.validarEmail(usuarioControle.getUsuario())) {
            usuarioControle.setMensagemControle(new MensagemControle());
            usuarioControle.setAnexoControle(new AnexoControle());
            usuarioControle.setContatoControle(new ContatoControle());
            this.sessao = new Sessao();            
            usuarioControle.setSessao(this.sessao.configuraConexao(usuarioControle.getUsuario()));
        }
    }
    
    
 
    
}
