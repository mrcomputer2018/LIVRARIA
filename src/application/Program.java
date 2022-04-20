/*
* Sistema de gerenciamento de livraria
*/
package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner inputChar = new Scanner(System.in);

        try {
            CadastroDeLivros cadastroDeLivros = new CadastroDeLivros();
            System.out.println("====== SISTEMA LIVRARIA =====");
            System.out.println("***** MENU *****");
            System.out.println("( 1 ) - Cadastrar Livros");
            System.out.println("( 2 ) - Aplicar desconto");
            System.out.println("Digite a opção desejada :");
            int menu = input.nextInt();

            switch (menu) {
                case 1:
                    System.out.println();
                    cadastroDeLivros.cadastrar();
            }
        }
        catch() {

        }
    }
 }
