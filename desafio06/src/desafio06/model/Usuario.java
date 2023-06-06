
package desafio06.model;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Marcos
 */
public class Usuario {
    private int id, telefone, qtdLivrosEmprestados;
    private String nome, email;
    private List<Livro> livrosEmprestados = new ArrayList<>();

    public Usuario(String nome, String email, int telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.qtdLivrosEmprestados = 0;
    
    }

    public boolean getPossuiVaga(){
        return qtdLivrosEmprestados < 3;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public int getQtdLivrosEmprestados() {
        return qtdLivrosEmprestados;
    }

    public void setQtdLivrosEmprestados(int qtdLivrosEmprestados) {
        this.qtdLivrosEmprestados = qtdLivrosEmprestados;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Livro> getLivrosEmprestados() {
        return livrosEmprestados;
    }

    public void setLivrosEmprestados(List<Livro> livrosEmprestados) {
        this.livrosEmprestados = livrosEmprestados;
    }
    
    public void adicionarLivro(Livro livro) {
        livrosEmprestados.add(livro);
        qtdLivrosEmprestados++;
    }

    public void removerLivro(Livro livro) {
        livrosEmprestados.remove(livro);
        qtdLivrosEmprestados--;
    }
}