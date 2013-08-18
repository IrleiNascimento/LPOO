package DaO;

import java.util.Objects;

/**
 *
 * @author Irlei
 */
public class Anexo {
    
    private String nomeDoArquivo;
    private String localDoArquivo;
    private int tamanho;
    private String tipo;
    
    public Anexo() {
    }

    public Anexo(String nomeDoArquivo, String localDoArquivo) {
        this.nomeDoArquivo = nomeDoArquivo;
        this.localDoArquivo = localDoArquivo;
    }

    
    public String getLocalDoArquivo() {
        return localDoArquivo;
    }

    public void setLocalDoArquivo(String localDoArquivo) {
        this.localDoArquivo = localDoArquivo;
    }

    public String getNomeDoArquivo() {
        return nomeDoArquivo;
    }

    public void setNomeDoArquivo(String nomeDoArquivo) {
        this.nomeDoArquivo = nomeDoArquivo;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Anexo other = (Anexo) obj;
        if (!Objects.equals(this.nomeDoArquivo, other.nomeDoArquivo)) {
            return false;
        }
        if (!Objects.equals(this.localDoArquivo, other.localDoArquivo)) {
            return false;
        }
        if (this.tamanho != other.tamanho) {
            return false;
        }
        if (!Objects.equals(this.tipo, other.tipo)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.nomeDoArquivo);
        return hash;
    }
    
    
    
}
