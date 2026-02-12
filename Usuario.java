package cadastroUsuario;

public class Usuario {

    private String nome;
    private String email;
    private int idade;
    private int cpf;


    //cadastro

    public Usuario(String nome, String email, int idade, int cpf) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
        this.cpf = cpf;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public int getIdade() {
        return idade;
    }

    public int getCpf() {
        return cpf;
    }

    //exibir usuario

    public void exibirUsuario() {
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Idade: " + idade);
        System.out.println("Cpf: " + cpf);
        System.out.println("-----------------------");
    }
}

