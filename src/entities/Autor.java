package entities;

public class Autor {
    public String nome;
    public String email;
    public String cpf;

    public void mostrarDetalhes() {
        System.out.println("Mostrando detalhes do autor:");
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("CPF: " + cpf);
    }
}


