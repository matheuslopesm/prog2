package Exercicio03;

public class Desenhar {

    public static void main(String[] args) {

        System.out.println();

        System.out.println("Forma geométrica: ");

        FabricaAbstrataDeFormas triangulo = new FabricaDeFormas();
        FormasGeometricas tri = triangulo.FactoryFormasGeometricas("Triangulo", "3", "3");

        FabricaAbstrataDeFormas circulo = new FabricaDeFormas();
        FormasGeometricas cir = circulo.FactoryFormasGeometricas("Circulo", "0", "0");

        FabricaAbstrataDeFormas quadrado = new FabricaDeFormas();
        FormasGeometricas qua = quadrado.FactoryFormasGeometricas("Quadrado", "4", "4");

        System.out.println(tri);
        System.out.println(cir);
        System.out.println(qua);

    }
}
