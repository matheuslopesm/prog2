package Exercicio06;

public class FabricaDeSanduiches extends FabricaAbstrataDeSanduiches {

    public Sanduiches FactorySanduiches(String pao, String queijo, String presunto, String salada) {

        if (pao.equals("Integral") && queijo.equals("Prato") && presunto.equals("de Frango") && salada.equals("sem Verdura")) {
            return new SanduicheCG("Fabricando o sanduiche CG...");
        } else if (pao.equals("Bola") && queijo.equals("Cheddar") && presunto.equals("de Peru") && salada.equals("sem Verdura")) {
            return new SanduicheRT("Fabricando o sanduiche RT...");
        } else if (pao.equals("Francês") && queijo.equals("Mussarela") && presunto.equals("de Frango") && salada.equals("com Verdura")) {
            return new SanduicheJP("Fabricando o sanduiche JP...");
        } else {
            return new Sanduiches(pao, queijo, presunto, salada);
        }
    }
}
