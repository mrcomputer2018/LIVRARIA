package application;

import entities.Autor;
import entities.Livro;

public class CadastroDeLivros {

    public void cadastrar() {
        // Scanner input = new Scanner();
        Autor autor = new Autor();
        Autor outroAutor = new Autor();

        autor.setNome("Rodrigo Turini");
        autor.setCpf("123456789-70");
        autor.setEmail("rodrigo.turini@caelum.com.br");

        Livro livro = new Livro(autor);

        livro.setNome("Java 8 Pratico");
        livro.setDescricao("Novos recursos de linguaguem");
        livro.setValor(59.90);
        System.out.println("Valor atual: R$" + livro.getValor());
        if (!livro.aplicaDescontoDe(0.1)) {
            System.out.println("Desconto não pode ser maior do que 30%");
        } else {
            System.out.println("Valor com desconto: R$" + livro.getValor());
        }
        livro.setIsbn("978-85-66250-46-6");

        livro.aplicaDescontoDe(0.1);
        livro.mostrarDetalhes();

        outroAutor.setNome("Paulo Silveira");
        outroAutor.setCpf("123456789-90");
        outroAutor.setEmail("paulo.silveira@caelum.com.br");

        Livro outroLivro = new Livro(outroAutor);

        System.out.println();
        outroLivro.setNome("JLogica de Prpgramacao");
        outroLivro.setDescricao("Crie seus primeiros programas");
        outroLivro.setValor(59.90);
        System.out.println("Valor atual: R$" + outroLivro.getValor());
        if (!outroLivro.aplicaDescontoDe(0.4)) {
            System.out.println("Desconto não pode ser maior do que 30%");
        } else {
            System.out.println("Valor com desconto: R$" + outroLivro.getValor());
        }
        outroLivro.setIsbn("978-85-66250-22-0");

        outroLivro.aplicaDescontoDe(0.1);
        outroLivro.mostrarDetalhes();

    }
}
