package Exercicio1;

import java.util.Scanner;

public class Grafo {

    private int grafo[][] = { { 0 , 1 , 0 , 0 , 1 },
                              { 1 , 0 , 1 , 1 , 1 },
                              { 0 , 1 , 0 , 1 , 0 },
                              { 0 , 1 , 1 , 0 , 1 },
                              { 1 , 1 , 0 , 1 , 0 }};

    public boolean verificacao(int vtz1, int vtz2) {
        if((vtz1 >= 1) || (vtz2 <= 5)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("------- Grafos -------");
        System.out.println("Escolha a operação que você quer: ");
        System.out.println("1- Determinar se dois vértices são vizinhos");
        System.out.println("2- Determinar a lista de todos os vértices vizinhos do vértice que você quer");
        int escolha = sc.nextInt();

        if(escolha == 1) {
            System.out.println("--- Você escolheu: Determinar se dois vértices são vizinhos! ---");
            System.out.print("Informe o primeiro vértice que você quer: ");
            int vtz1 = sc.nextInt();
            System.out.print("Informe o segundo vértice que você quer: ");
            int vtz2 = sc.nextInt();
         }
    }
}
