package application;

import entities.Autor;
import entities.Livro;

public class Program {
    public static void main(String[] args) {
        Livro livro = new Livro();
        Livro outroLivro = new Livro();
        Autor autor = new Autor();
        Autor outroAutor = new Autor();

        autor.nome = "Rodrigo Turini";
        autor.cpf = "123456789-70";
        autor.email = "rodrigo.turini@caelum.com.br";

        livro.nome = "Java 8 Pratico";
        livro.descricao = "Novos recursos de linguaguem";
        livro.valor = 59.90;
        livro.isbn = "978-85-66250-46-6";
        livro.autor = autor;
        livro.aplicaDesconto(0.1);

        livro.mostrarDetalhes();

        outroAutor.nome = "Paulo Silveira";
        outroAutor.cpf = "123456789-90";
        outroAutor.email = "paulo.silveira@caelum.com.br";

        System.out.println();
        outroLivro.nome = "JLogica de Prpgramacao";
        outroLivro.descricao = "Crie seus primeiros programas";
        outroLivro.valor = 59.90;
        outroLivro.isbn = "978-85-66250-22-0";
        outroLivro.autor = outroAutor;

        outroLivro.mostrarDetalhes();
    }
 }
