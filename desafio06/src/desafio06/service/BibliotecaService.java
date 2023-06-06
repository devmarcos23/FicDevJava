package desafio06.service;
import java.util.List;
import desafio06.model.Livro;
import desafio06.model.Usuario;
import desafio06.repository.LivroRepository;
import desafio06.repository.UsuarioRepository;
/**
 *
 * @author Marcos
 */
public class BibliotecaService {
    private LivroRepository livroRepository = new LivroRepository();
    private UsuarioRepository usuarioRepository = new UsuarioRepository();
    
    public void cadastrarLivro(Livro livro){
        livroRepository.cadastrar(livro);
    }

    public void cadastrarUsuario(Usuario usuario){
        usuarioRepository.cadastrar(usuario);
    }
    
    public void realizarEmprestimo(int idLivro, int idUsuario)throws EmprestimoException{
        Livro livro = livroRepository.buscarPorId(idLivro);
        Usuario usuario = usuarioRepository.buscarPorId(idUsuario);
        if (livro != null && usuario != null && livro.isDisponivel() && usuario.getPossuiVaga()) {
            livro.setDisponivel(false);
            usuario.adicionarLivro(livro);
        } else {
            throw new EmprestimoException("Nao foi possivel realizar o emprestimo.");
        }
    }
        
        public void realizarDevolucao(int idLivro, int idUsuario)throws DevolucaoException{
            Livro livro = livroRepository.buscarPorId(idLivro);
            Usuario usuario = usuarioRepository.buscarPorId(idUsuario);
            if (livro != null && usuario != null && !livro.isDisponivel() && usuario.getLivrosEmprestados().contains(livro)) {
                livro.setDisponivel(true);
                usuario.removerLivro(livro);
            } else {
                throw new DevolucaoException("Nao foi possivel realizar a devolucao");
            }
        }
        public List<Livro> listarLivros() {
            return livroRepository.buscarTodos();
        }
        public List<Usuario> listarUsuarios() {
            return usuarioRepository.buscarTodos();
        }
        public Livro buscarLivro(int id) {
            return livroRepository.buscarPorId(id);
        }
        public Usuario buscarUsuario(int id) {
            return usuarioRepository.buscarPorId(id);
        }
    }

