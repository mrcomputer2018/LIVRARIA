package application;

import entities.Produto;

public class CarrinhoDeCompras {
    private double total = 0;

    // Getters
    public double getTotal(){
        return total;
    }

    // Metodos
    public void adiciona(Produto produto) {
        System.out.println("Adicionando: " + produto);
        // Aplica desconto a cada venda
       // produto.aplicaDescontoDe(0.05);
        this.total = this.total + produto.getValor();
    }
}
