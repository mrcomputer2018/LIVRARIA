package application;

import entities.Livro;

public class CarrinhoDeCompras {
    private double total = 0;

    // Getters
    public double getTotal(){
        return total;
    }

    // Metodos
    public void adiciona(Livro livro) {
        System.out.println("Adicionando: " + livro);
        // Aplica desconto a cada venda
        livro.aplicaDescontoDe(0.05);
        total = total + livro.getValor();
    }
}
