package Exercicio05;

public class FabricaDaFord extends FabricaDeCarros {

    @Override
    public CarroSedan criaCarroSedan() {
        return new FiestaSedan();
    }

    @Override
    public CarroPopular criaCarroPopular() {
        return new Fiesta();
    }
}
