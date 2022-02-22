package Exercicio08;

public class Adaptador implements MedidorCelsiusIF {

    private MedidorFarenheit medidor = new MedidorFarenheit();

    @Override
    public double medirTemperatura() {

        double tempcelsius = ((medidor.getTemperaturaFarenheit() - 32) / 1.8);

        System.out.println("Convertendo Farenheit -> Celsius...");
        System.out.println(".....");
        System.out.println("....");
        System.out.println("...");
        System.out.println("..");
        System.out.println(".");

        System.out.println("Convertido com sucesso.");

        return tempcelsius;
    }


}
