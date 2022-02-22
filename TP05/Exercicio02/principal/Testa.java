package Exercicio02.principal;

public class Testa {

    public static void main (String [] args) {

        Cliente cli1 = new Cliente("Jorge", 45, "Masculino",5000, 1996);
        System.out.println("------------------");
        System.out.println(cli1);
        System.out.println("------------------");

        Vendedor vend1 = new Vendedor("Pedro", 1500, 8750, 123);
        System.out.println(vend1);
        System.out.println("------------------");

        Gerente ger1 = new Gerente("João", 64, "8129", "Americanas S.A.", 2000);
        System.out.println(ger1);
        System.out.println("------------------");
    }
}