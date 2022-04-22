package application;

import entities.Autor;
import entities.Livro;
import entities.LivroFisico;
import exceptions.DomainException;

public class CadastroDeLivros  {

    public void cadastrar() throws DomainException {
        // Scanner input = new Scanner();
        Autor autor = new Autor();
        Autor outroAutor = new Autor();

        autor.setNome("Rodrigo Turini");
        autor.setCpf("123456789-70");
        autor.setEmail("rodrigo.turini@caelum.com.br");

        Livro livro = new LivroFisico(autor);

        livro.setNome("Java 8 Pratico");
        livro.setDescricao("Novos recursos de linguaguem");
        livro.setValor(59.90);
        livro.setIsbn("978-85-66250-46-6");

        livro.aplicaDescontoDe(0.1);
        livro.mostrarDetalhes();

        outroAutor.setNome("Paulo Silveira");
        outroAutor.setCpf("123456789-90");
        outroAutor.setEmail("paulo.silveira@caelum.com.br");

        Livro outroLivro = new LivroFisico(outroAutor);

        System.out.println();
        outroLivro.setNome("JLogica de Prpgramacao");
        outroLivro.setDescricao("Crie seus primeiros programas");
        outroLivro.setValor(59.90);
        System.out.println("Valor atual: R$" + outroLivro.getValor());
               outroLivro.setIsbn("978-85-66250-22-0");

       outroLivro.mostrarDetalhes();

    }
}
