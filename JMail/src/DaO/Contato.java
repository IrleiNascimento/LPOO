package DaO;

public class Contato extends Pessoa{
   
    private int categoria;    
    
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
    public String toString() {
        return this.getEmail();
    }
    
    
}
