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

        Ebook ebook = new Ebook(autor);
        ebook.setNome("Test-driven Deveelopment");
    }
}
