package application;

import entities.*;

public class RegrasDeDesconto {
    public void aplicar() {
        Autor autor = new Autor();
        autor.setNome("Rodrigo Turini");

        LivroFisico livro = new LivroFisico(autor);
        livro.setValor(59.90);

        if (!livro.aplicaDescontoDe(0.3)) {
            System.out.println("Desconto não pode ser maior do que 30% para livro fisico");
        } else {
            System.out.println("Valor do livro com desconto: R$" + livro.getValor());
        }

        Ebook ebook = new Ebook(autor);
        ebook.setValor(29.90);

        if (!ebook.aplicaDescontoDe(0.3)) {
            System.out.println("Desconto não pode ser maior do que 15% para ebook");
        } else {
            System.out.println("Valor do ebook com desconto: R$" + ebook.getValor());
        }

        Livro miniLivro = new MiniLivro(autor);
        miniLivro.setValor(39.90);
        System.out.println("Desconto não pode ser aplicado para mini livro");
        System.out.println("Valor do mini livro: R$" + miniLivro.getValor());
    }
}
