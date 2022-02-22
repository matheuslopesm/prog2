package Exercicio03;

public class FormaTriangulo extends FormasGeometricas {

    private String processoDeCriacao;

    protected FormaTriangulo(String processoDeCriacao) {
        super("Triangulo", "3", "3");
        this.processoDeCriacao = processoDeCriacao;
    }

    public String toString() {
        return super.toString() + " - " + this.processoDeCriacao;
    }
}
