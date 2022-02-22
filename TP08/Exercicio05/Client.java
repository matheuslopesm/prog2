package Exercicio05;

public class Client {

    public static void main(String[] args) {

        System.out.println("------------------------------------");
        System.out.println("             UFOP Motors            ");
        System.out.println("------------------------------------");
        System.out.println("Fabricamos carros Populares e Sedan");
        System.out.println("da Fiat e da Ford!");
        System.out.println();

        FabricaDeCarros fabrica = new FabricaDaFiat();
        CarroSedan s = fabrica.criaCarroSedan();
        CarroPopular p = fabrica.criaCarroPopular();

        System.out.println("------------------------------------");
        System.out.println("Nossos carros da Fiat:");
        s.mostraSedan();
        System.out.println();

        p.mostraPopular();
        System.out.println();
        System.out.println("------------------------------------");
        fabrica = new FabricaDaFord();
        s = fabrica.criaCarroSedan();
        p = fabrica.criaCarroPopular();
        System.out.println("Nossos carros da Ford:");

        s.mostraSedan();
        System.out.println();
        p.mostraPopular();
        System.out.println("------------------------------------");

    }
}
