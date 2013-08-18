package DaO;
/**
 *
 * @author Irlei
 */
public class Usuario extends Pessoa {

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
