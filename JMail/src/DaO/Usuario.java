package DaO;
/**
 *
 * @author Irlei
 */
public class Usuario extends Pessoa { /*Como o Usuário precisa de nome e 
 * email e a classe Pessoa ja os possui basta herdar*/

    private String senha;

    public Usuario() {
    }

    public Usuario(String senha, String nome, String email) {
        super(nome, email);
        this.senha = senha;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }    
}
