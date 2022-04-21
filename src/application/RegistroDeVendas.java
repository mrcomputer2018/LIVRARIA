package application;

import entities.Autor;
import entities.Ebook;
import entities.LivroFisico;

public class RegistroDeVendas {
    // Metodos
    public void registrar() {
        Autor autor = new Autor();
        autor.setNome("Mauricio Aniche");

        LivroFisico fisico = new LivroFisico(autor);
        fisico.setNome("Test-driven Deveelopment");
        fisico.setValor(59.90);

        Ebook ebook = new Ebook(autor);
        ebook.setNome("Test-driven Deveelopment");
        ebook.setValor(29.90);

        CarrinhoDeCompras carrinho= new CarrinhoDeCompras();
        carrinho.adiciona(fisico);
        carrinho.adiciona(ebook);
        System.out.println("Total : R$" + carrinho.getTotal());
    }
}
