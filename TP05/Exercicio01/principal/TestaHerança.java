package Exercicio01.principal;

public class TestaHerança {

    public static void main (String [] args) {

        Cachorro cah1 = new Cachorro("Caramelo", 22, "Vira-Lata");
        System.out.println("------------------");
        System.out.println(cah1);
        System.out.println("------------------");

        Peixe px1 = new Peixe("Bacalhau", 39, "Demersal");
        System.out.println(px1);
        System.out.println("------------------");

    }
}
