package TrabalhoPratico01;

import java.util.Scanner;

public class exercicio03 { 

    public static void main (String [] args){

        Scanner ler = new Scanner(System.in);

        int n = 0;
        int num = 3;

        int recursiva = 0;

        System.out.println();    
        System.out.println("=======================================");
        System.out.println("F(n) = 2 * F(n-1) + 3 * F(n-2)");
        System.out.println();
        System.out.println("Informe um número inteiro para ser calculado na função recursiva acima:");
        System.out.println();

        n = ler.nextInt();
        ler.close();

        System.out.println("F(1) = 1");
        System.out.println("F(2) = 2");

        for(int contador = 3; contador < n+1; contador++)
        {
            recursiva = (2 * (num - 1)) + (3 * (num - 2));
            System.out.print("F("+ contador +") = " + recursiva);
            num++;
            System.out.println();
        }
    }
}