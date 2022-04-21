package application;

import entities.Autor;
import entities.Ebook;
import entities.Livro;

public class RegrasDeDesconto {
    public void aplicar() {
        Autor autor = new Autor();
        autor.setNome("Rodrigo Turini");

        Livro livro = new Livro(autor);
        livro.setValor(59.90);

        if (!livro.aplicaDescontoDe(0.3)) {
            System.out.println("Desconto não pode ser maior do que 30%");
        } else {
            System.out.println("Valor do livro com desconto: R$" + livro.getValor());
        }

        Ebook ebook = new Ebook(autor);
        ebook.setValor(29.90);

        if (!ebook.aplicaDescontoDe(0.3)) {
            System.out.println("Desconto não pode ser maior do que 15%");
        } else {
            System.out.println("Valor do livro com desconto: R$" + ebook.getValor());
        }

    }
}
