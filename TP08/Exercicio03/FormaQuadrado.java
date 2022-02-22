package Exercicio03;

public class FormaQuadrado extends FormasGeometricas {

    private String processoDeCriacao;

    protected FormaQuadrado(String processoDeCriacao) {
        super("Quadrado", "4", "4");
        this.processoDeCriacao = processoDeCriacao;
    }

    public String toString() {
        return super.toString() + " - " + this.processoDeCriacao;
    }
}
