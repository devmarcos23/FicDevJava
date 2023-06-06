
package desafio06.repository;
import java.util.ArrayList;
import java.util.List;
import desafio06.model.Usuario;
/**
 *
 * @author Marcos
 */
public class UsuarioRepository {
    private List<Usuario> usuarios = new ArrayList<>();
    private int proximoId = 1;
    
    public void cadastrar(Usuario usuario){
        usuario.setId(proximoId++);
        usuarios.add(usuario);
    }
    public List<Usuario> buscarTodos(){
        return usuarios;
    }
    
    public Usuario buscarPorId(int id){
        for (Usuario usuario : usuarios) {
            if (usuario.getId() == id) {
               return usuario; 
            }
            
        }
        return null;
    }
    
    public void atualizar(Usuario usuario){
        for (int i = 0; i < usuarios.size(); i++) {
            usuarios.set(i, usuario);
            break;
        }
    }
    public void excluir(int id){
        usuarios.removeIf(usuario -> usuario.getId() == id);
    }
}
