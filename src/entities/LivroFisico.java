package entities;

public class LivroFisico extends Livro{
    private double taxaImpressao;

    // Construtor
    public LivroFisico(Autor autor) {
        super(autor);
    }

    // Getters e setters
    public double getTaxaImpressao() {
        return this.getValor() * 0.05;
    }

    // Metodos

}
