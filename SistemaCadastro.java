package cadastroUsuario;
import java.util.ArrayList;

public class SistemaCadastro{

    private ArrayList<Usuario> usuarios = new ArrayList<>();

    //adicionar usuario

    public void adicionarUsuario(Usuario usuario){
        usuarios.add(usuario);
        System.out.println("Usuário cadastrado com sucesso!");
    }

    //listar usuario

    public void listarUsuario(){

        if (usuarios.isEmpty()) {
            System.out.println("Nenhum usuário cadastrado.");
            return;
        }

        System.out.println("\n=== Lista de Usuários ===");

        for (Usuario u : usuarios) {
                u.exibirUsuario();
        }
    }

    //buscar usuario

    public void buscarUsuario(String email) {
        for (Usuario u : usuarios)
             if((u.getEmail().equalsIgnoreCase(email))){
                 System.out.println("Usuário encontrado:");
                 u.exibirUsuario();
                 return;
             }
    }

    //remover usuario

    public void removerUsuario(String email){
        Usuario encontrado = null;

        for (Usuario u : usuarios) {
            if (u.getEmail().equalsIgnoreCase(email)){
                encontrado = u;
                break;
            }
        }

        if (encontrado != null){
            usuarios.remove(encontrado);
            System.out.println("Usuario removido com Sucesso!");
        } else {
            System.out.println("Usuario nao encontrado...");
        }
    }
}