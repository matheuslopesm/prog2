package Exercicio08;

import java.io.FileInputStream;
import java.util.Scanner;

public class Programa08 extends Throwable{

    public static void main (String[] args) {

        int x = 0;
        int y = 0;
        double r = 0;

        try {
            Scanner teclado = new Scanner(System.in);

            System.out.println("----------------------------------------");
            System.out.println("Eu sei dividir!");
            System.out.print("Informe o primeiro valor: ");
            x = teclado.nextInt();

            System.out.print("Informe o segundo valor: ");
            y = teclado.nextInt();

            r = (x/y);

        }catch (Exception e) {
            System.out.println("Entrada de dados inválida.");
        }

        System.out.println("O resultado da divisão é " + r);
        System.out.println("----------------------------------------");

        try {
            soma();
        }catch (Exception e){
            System.out.println("Não é possível fazer somas!");
            e.printStackTrace();
        }
    }

    public static double r(int x, int y) {
            return x/y;
    }

    public static void soma() throws Exception{
        FileInputStream file = new FileInputStream("Eu sei somar!");
        file.close();
    }
}
