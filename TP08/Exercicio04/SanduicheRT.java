package Exercicio04;

public class SanduicheRT extends Sanduiches {

    private String fabricacaoDeSanduiche;

    protected SanduicheRT(String fabricacaoDeSanduiche) {
        super("Bola", "Cheddar", "de Peru", "sem Verdura");
        this.fabricacaoDeSanduiche = fabricacaoDeSanduiche;

    }

    public String toString() {
        return super.toString() + " - " + this.fabricacaoDeSanduiche;
    }
}
