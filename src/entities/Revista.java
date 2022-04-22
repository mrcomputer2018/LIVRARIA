package entities;

public class Revista {
    private String nome;
    private String descricao;
    private Double valor;
    private Editora editora;

    // Get e set


    public Double getValor() {
        return valor;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }

    // Metodo
    public boolean aplicaDescontoDe(double porcentagem) {
        if(porcentagem > 0.1){
            return false;
        }
        double desconto = getValor() - (getValor() * porcentagem);
        setValor(desconto);
        System.out.println("Aplicando desconto no livro Fisico");
        return true;
    }
}
