
package desafio06.model;

/**
 *
 * @author Marcos
 */
public class Livro {
    private int id, anoPublicacao;
    private String  titulo, autor;
    private boolean disponivel;

    public Livro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public int getId(){
        return this.id;
    }
    
    public void setAnoPublicacao(int anoPublicacao){
        this.anoPublicacao = anoPublicacao;
    }
    
    public int getAnoPublicacao(){
        return this.anoPublicacao;
    }
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public String getTitulo(){
        return this.titulo;
    }
    
    public void setAutor(String autor){
        this.autor = autor;
    }
    
    public String getAutor(){
        return this.autor;
    }
    
    public void setDisponivel(Boolean disponivel){
        this.disponivel = disponivel;
    }
    
    
    public Boolean isDisponivel(){
        return this.disponivel;
    }
}
    

