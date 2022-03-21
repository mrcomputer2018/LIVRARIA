package entities;

public class Livro {
    public String nome;
    public String descricao;
    public Double valor;
    public String isbn;
    public Autor autor;

    // Metodo
    public Boolean temAutor() {
        return this.autor != null;
    }

    public void aplicaDesconto(Double porcentagem){
        this.valor-= this.valor * porcentagem;
    }

    public void mostrarDetalhes() {
        String mensagem = "Mostrando detalhes do livro:";
        System.out.println(mensagem);
        System.out.println("Nome: " + nome);
        System.out.println("Descricao: " + descricao);
        System.out.println("Valor: RS" + valor);
        System.out.println("ISBN: " + isbn);
        if (temAutor()) {
            autor.mostrarDetalhes();
        }
        else {
            System.out.println("Este livro não tem autor adastrado");
        }
        System.out.println(" _ _ _ ");
    }
}
