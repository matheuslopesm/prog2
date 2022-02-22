package Exercicio01;

public class Principal {

    public static void main(String[] args) throws Exception {

        MetodoSingleton novo = MetodoSingleton.GetInstance();

        novo.setNome("Peter");
        novo.setPais("Estados Unidos");
        novo.setIdade("17");

        System.out.println();
        System.out.println(novo);

    }

}
