package Exercicio03;

public class FabricaDeFormas extends FabricaAbstrataDeFormas {

    public FormasGeometricas FactoryFormasGeometricas(String nome, String lados, String vertices) {

        if (nome.equals("Triangulo") && lados.equals("3") && vertices.equals("3")) {
            return new FormaTriangulo("Fabricando a forma geométrica triangular...");
        } else if (nome.equals("Circulo") && lados.equals("0") && vertices.equals("0")) {
            return new FormaCirculo("Fabricando a forma geométrica circular...");
        } else if (nome.equals("Quadrado") && lados.equals("4") && vertices.equals("4")) {
            return new FormaQuadrado("Fabricando a forma geométrica quadrangular...");
        } else {
            return new FormasGeometricas(nome, lados, vertices);
        }
    }
}