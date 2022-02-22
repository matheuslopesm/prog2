package TrabalhoPratico01;

import java.util.Scanner;

public class exercicio04 { 

    public static void main (String [] args){

        Scanner ler = new Scanner(System.in);

        int messem[][] = new int[12][4];
        int fatmensal[] = new int[12];

        int total = 0;

        for (int i = 0; i < 12; i++)
        {
            for(int j = 0; j < 4; j++)
            {
                System.out.print("Informe o total vendido no mês " + (i+1) + " e semana " + (j+1));
                System.out.println();
                messem[i][j] = ler.nextInt();

                total = total + messem[i][j];
                fatmensal[i] = fatmensal[i] + messem[i][j];
            }
        }

        System.out.print("==========================================================");

        System.out.println();
        System.out.print("O total vendido em cada MÊS é:");
        System.out.println();

        for (int i = 0; i < 12; i++)
        {
            System.out.println("Mês " + (i+1) + ": " + fatmensal[i]);
        }

        System.out.print("==========================================================");

        System.out.println();
        System.out.print("O total vendido em cada SEMANA é: ");
        System.out.println(); 

        for (int i = 0; i < 12; i++)
        {
            System.out.println();
            System.out.print("Mês " + (i+1));
            System.out.println();       
            for(int j = 0; j < 4; j++)
            {
                System.out.println("Semana " + (j+1) + ": " + messem[i][j]);   
            }
        }

        System.out.print("==========================================================");

        System.out.println();
        System.out.print("O total vendido no ano é: " + total);
        System.out.println();

        System.out.print("==========================================================");
    
        ler.close();

    }
}