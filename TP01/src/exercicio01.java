package TrabalhoPratico01;

import java.util.Scanner;

public class exercicio01 { 

    public static void main (String [] args){

        Scanner ler = new Scanner(System.in);

        int pes[] = new int[5];
        int maos[] = new int[5];
        int podologia[] = new int[5];
        int fatu[] = new int[5];

        System.out.println();    
        System.out.println("Cada manicure recebe 50% do seu faturamento mensal!");

        for(int contador = 0; contador < 5; contador++)
        {
            System.out.print("Informe quanto a Manicure " + contador + " faturou com pés");
            System.out.println();
            pes[contador] = ler.nextInt();
        }

        for(int contador = 0; contador < 5; contador++)
        {
            System.out.print("Informe quanto a Manicure " + contador + " faturou com mãos");
            System.out.println();
            maos[contador] = ler.nextInt();
        }

        for(int contador = 0; contador < 5; contador++)
        {
            System.out.print("Informe quanto é o serviço de podologia da Manicure " + contador);
            System.out.println();
            podologia[contador] = ler.nextInt();
        }

        ler.close();

        System.out.println("==============================");
        System.out.println("O faturamento de cada manicure é aproximadamente:");

        for(int contador = 0; contador < 5; contador++)
        {
            fatu[contador] = (int) ((pes[contador] + maos[contador] + podologia[contador]) * 0.5);
            System.out.println("Manicure " + contador + ": R$ " + fatu[contador] + " Reais");
        }

        System.out.println("==============================");
    }
}