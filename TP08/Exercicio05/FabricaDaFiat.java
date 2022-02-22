package Exercicio05;

public class FabricaDaFiat extends FabricaDeCarros {

    @Override
    public CarroSedan criaCarroSedan() {
        return new Siena();
    }

    @Override
    public CarroPopular criaCarroPopular() {
        return new Palio();
    }
}
