package Exercicio05;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception extends Throwable {

    public static void main (String[] args) {

        int x = 0;
        int y = 0;
        double r = 0;

        try {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Eu sei dividir!");
            System.out.print("Informe o primeiro valor: ");
            x = teclado.nextInt();
            System.out.print("Informe o segundo valor: ");
            y = teclado.nextInt();
            r = (x/y);
        }catch (InputMismatchException e) {
            System.out.println("Entrada de dados inválida.");
        }catch (ArithmeticException e) {
            System.out.println("O valor do denominador é zero, logo temos um erro.");
        }catch (java.lang.Exception e) {
            System.out.println("Erro inesperado.");
        }

        System.out.println("O resultado da divisão é " + r);
    }

    public static double r(int x, int y) {
        return x/y;
    }
}
