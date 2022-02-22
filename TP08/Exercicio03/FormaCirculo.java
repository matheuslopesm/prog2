package Exercicio03;

public class FormaCirculo extends FormasGeometricas {

    private String processoDeCriacao;

    protected FormaCirculo(String processoDeCriacao) {
        super("Circulo", "0", "0");
        this.processoDeCriacao = processoDeCriacao;
    }

    public String toString() {
        return super.toString() + " - " + this.processoDeCriacao;
    }
}
