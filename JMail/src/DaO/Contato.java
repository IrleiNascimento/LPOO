package DaO;
/**
 *
 * @author Irlei
 */
public class Contato extends Pessoa{
   
    private int categoria;   // será definido como constante futuramente
    
    public Contato() {
    }

    public Contato(String nome, String email) {
        super(nome, email);
    }

    public Contato( int categoria, String nome, String email) {
        super(nome, email);       
        this.categoria = categoria;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }  
    
    
    @Override
    public String toString() { /*Contato extende Pessoa portanto ele tambem é um Address 
     sendo assim vamos sobreescrever o toString, porque o que interessa no contato é o email*/
        return this.getEmail();
    }
    
    
}
