package Exercicio04;

public class Teste {

    public static void main(String[] args) {

        System.out.println();

        System.out.println("Sanduiches para serem fabricados na lanchonete: ");

        FabricaAbstrataDeSanduiches cg = new FabricaDeSanduiches();
        Sanduiches sum = cg.FactorySanduiches("Integral", "Prato", "de Frango", "sem Verdura");

        FabricaAbstrataDeSanduiches rt = new FabricaDeSanduiches();
        Sanduiches sdois = rt.FactorySanduiches("Bola", "Cheddar", "de Peru", "sem Verdura");

        FabricaAbstrataDeSanduiches jp = new FabricaDeSanduiches();
        Sanduiches stres = jp.FactorySanduiches("Francês", "Mussarela", "de Frango", "com Verdura");

        System.out.println(sum);
        System.out.println(sdois);
        System.out.println(stres);

    }
}
