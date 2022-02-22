package Exercicio04;

public class SanduicheCG extends Sanduiches {

    private String fabricacaoDeSanduiche;

    protected SanduicheCG(String fabricacaoDeSanduiche) {
        super("Integral", "Prato", "de Frango", "sem Verdura");
        this.fabricacaoDeSanduiche = fabricacaoDeSanduiche;

    }

    public String toString() {
        return super.toString() + " - " + this.fabricacaoDeSanduiche;
    }
}
