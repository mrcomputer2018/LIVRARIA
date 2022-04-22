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
    public boolean aplicaDescontoDe(Double porcentagem){
        if( porcentagem > 0.15 ) {
            return false;
        }
        double desconto = getValor() - (getValor() * porcentagem);
        setValor(desconto);
        System.out.println("Aplicando desconto no ebook");
        return true;
    }
}
