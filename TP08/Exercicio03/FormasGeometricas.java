package Exercicio03;

public class FormasGeometricas {

    private String nome;
    private String lados;
    private String vertices;

    protected FormasGeometricas(String nome, String lados, String vertices) {
        this.nome = nome;
        this.lados = lados;
        this.vertices = vertices;
    }

    public FormasGeometricas() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLados() {
        return lados;
    }

    public void setLados(String lados) {
        this.lados = lados;
    }

    public String getVertices() {
        return vertices;
    }

    public void setVertices(String vertices) {
        this.vertices = vertices;
    }

    public String toString () {
        return "[ Nome: " + this.nome + " | Lados: " + this.lados + " | Vértices: " + this.vertices + " ]";
    }
}
