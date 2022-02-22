package Exercicio06;

public class SanduicheJP extends Sanduiches {

    private String fabricacaoDeSanduiche;

    protected SanduicheJP(String fabricacaoDeSanduiche) {
        super("Francês", "Mussarela", "de Frango", "com Verdura");
        this.fabricacaoDeSanduiche = fabricacaoDeSanduiche;

    }

    public String toString() {
        return super.toString() + " - " + this.fabricacaoDeSanduiche;
    }
}
