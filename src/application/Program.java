/*
* Sistema de gerenciamento de livraria
*/
package application;

public class Program {
    public static void main(String[] args) {

        CadastroDeLivros cadastroDeLivros = new CadastroDeLivros();
        System.out.println("Testando sistema");
        System.out.println("***** MENU *****");
        System.out.println("( 1 )- Cadastrar Livros");
        System.out.println();
        cadastroDeLivros.cadastrar();
    }
 }
