package entities;

public class Ebook  extends Livro{
    private String waterMark;

    // Construtor
    public Ebook(Autor autor) {
        super(autor);
    }

    // Getters e Setters
    public String getWaterMark() {
        return waterMark;
    }
    public void setWaterMark(String waterMark) {
        this.waterMark = waterMark;
    }

    // Metodos
    @Override
    public Boolean aplicaDescontoDe(Double porcentagem){
        double desconto;

        if( porcentagem > 0.15 ) {
            return false;
        }
        // Acessando o get e set da classe pai
        desconto = this.getValor() - (this.getValor() * porcentagem);
        this.setValor(desconto);
        return true;
    }
}
