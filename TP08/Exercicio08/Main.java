package Exercicio08;

public class Main {

    public static void main(String[] args) {

        System.out.println("------------------------------------");
        System.out.println("       Conversor de Temperatura     ");
        System.out.println("------------------------------------");
        System.out.println();

        Adaptador adapta = new Adaptador();

        System.out.println(adapta.medirTemperatura());

        System.out.println("------------------------------------");
    }
}
