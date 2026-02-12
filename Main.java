package cadastroUsuario;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        SistemaCadastro sistema = new SistemaCadastro();

        int opcao;

        do {
            System.out.println("\n=== SISTEMA DE CADASTRO ===");
            System.out.println("1 - Cadastrar usuário");
            System.out.println("2 - Listar usuários");
            System.out.println("3 - Buscar usuário");
            System.out.println("4 - Remover usuário");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            opcao = entrada.nextInt();
            entrada.nextLine(); // limpar buffer

            switch (opcao){

                case 1:
                    System.out.print("Nome: ");
                    String nome = entrada.nextLine();

                    System.out.print("Email: ");
                    String email = entrada.nextLine();

                    System.out.print("Idade: ");
                    int idade = entrada.nextInt();
                    entrada.nextLine(); // limpar buffer

                    System.out.print("CPF: ");
                    int cpf = entrada.nextInt();
                    entrada.nextLine(); // limpar buffer

                    Usuario usuario = new Usuario(nome, email, idade, cpf);
                    sistema.adicionarUsuario(usuario);

                    break;

                case 2:
                    sistema.listarUsuario();
                    break;

                case 3:
                    System.out.print("Digite o email: ");
                    String buscaremail = entrada.nextLine();
                    sistema.buscarUsuario(buscaremail);
                    break;

                case 4 :
                    System.out.print("Digite o email: ");
                    String removeremail = entrada.nextLine();
                    sistema.removerUsuario(removeremail);
                    break;

                case 0:
                    System.out.println("Encerrando sistema...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        entrada.close();
    }
}