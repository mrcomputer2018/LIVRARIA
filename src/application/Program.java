/*
* Sistema de gerenciamento de livraria
*/
package application;

import exceptions.DomainException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner inputChar = new Scanner(System.in);

        char continuar = 's';
        while( continuar == 's' || continuar == 'S') {
            try {
                CadastroDeLivros cadastroDeLivros = new CadastroDeLivros();
                RegrasDeDesconto regrasDeDesconto = new RegrasDeDesconto();
                RegistroDeVendas registroDeVendas = new RegistroDeVendas();

                System.out.println("====== SISTEMA LIVRARIA =====");
                System.out.println("+++++++++++ MENU ++++++++++");
                System.out.println("( 1 ) - Cadastrar Livros");
                System.out.println("( 2 ) - Aplicar desconto");
                System.out.println("( 3 ) - Registrar vendas");
                System.out.println("Digite a opção desejada :");
                int menu = input.nextInt();

                switch (menu) {
                    case 1:
                        System.out.println();
                        cadastroDeLivros.cadastrar();
                        break;
                    case 2:
                        System.out.println();
                        regrasDeDesconto.aplicar();
                        break;
                    case 3:
                        System.out.println();
                        registroDeVendas.registrar();
                        break;
                }
            } catch (DomainException e) {
                System.out.println("Error : " + e.getMessage());
            } catch (InputMismatchException e ) {
                System.out.println("Error : Opção invalida!!!");
                input.next();
            }

            System.out.println();
            System.out.println("Deseja continuar(s/n)? ");
            continuar = inputChar.next().charAt(0);

        } // Fim while
        input.close();
        inputChar.close();
        System.out.println();
        System.out.println("----------------------------");
        System.out.println("---- SISTEMA FINALIZADO ----");
        System.out.println("----------------------------");
    }
 }
