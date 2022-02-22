package TrabalhoPratico01;

import java.util.Scanner;

public class exercicio05 {

    public static void main (String [] args){

        int matriz[][] = new int[3][3];
        int matriz2[][] = new int[3][3];

        Scanner ler = new Scanner (System.in);

        System.out.println("Rotação de Matriz 3x3!");

        for (int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                System.out.println();
                System.out.print("Informe o valor da posição " + (i+1) + "," + (j+1));
                System.out.println();
                matriz[i][j] = ler.nextInt();
            }
        }

        for (int i = 0; i < matriz.length; i++)
        {   
            for(int j = 0; j < matriz.length; j++)
            {
                matriz2[i][j] = matriz[3-j-1][i]; 
            }
        }

        System.out.print("==========================================================");
        System.out.println();
        System.out.print("Sua Matriz rotacionada em 90 Graus é:");
        System.out.println();

        for (int i = 0; i < matriz.length; i++)
        {   
            for(int j = 0; j < matriz.length; j++)
            {
                System.out.print(matriz2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.print("==========================================================");
    
        ler.close();
    }
}