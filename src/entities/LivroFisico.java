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
    @Override
    public boolean aplicaDescontoDe(Double porcentagem) {
        if( porcentagem > 0.3 ) {
            return false;
        }
        double desconto = getValor() - (getValor() * porcentagem);
        setValor(desconto);
        System.out.println("Aplicando desconto no livro Fisico");
        return true;
    }
}
