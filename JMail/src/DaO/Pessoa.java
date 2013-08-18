package DaO;
import java.util.Objects;
import javax.mail.Address;
/**
 *
 * @author Irlei
 */
public class Pessoa  extends Address{ /* extendendo a classe Address do pacote javax.mail 
 * um objeto da classe Pessoa podera ser passada como destinatário*/

    private String nome;
    private String email;

    public Pessoa() {
    }
 public Pessoa(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString(){
        return "Nome: "+this.nome +"Email:"+this.email;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pessoa other = (Pessoa) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 13 * hash + Objects.hashCode(this.email);
        return hash;
    }

    @Override
    public String getType() {  // asinatura de metodo da classe Address, por enquanto não precisaremos dele 
        throw new UnsupportedOperationException("Not supported yet.");
    }

   
    
    
}
