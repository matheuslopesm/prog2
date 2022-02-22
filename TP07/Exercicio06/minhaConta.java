package Exercicio06;

import java.util.Scanner;

public class minhaConta extends ContaExcecao{

    public double saldo;

    Scanner acc = new Scanner(System.in);

    public int mostraMenu() {
        System.out.println("------------------------------------");
        System.out.println("       Banco de João Monlevade      ");
        System.out.println("------------------------------------");
        System.out.println("Operações disponíveis: ");
        System.out.println("1 - Depositar seu dinheiro");
        System.out.println("2 - Sacar seu dinheiro");
        System.out.println("3 - Ver o saldo da conta");
        System.out.println("0 - Encerrar o sistema");
        System.out.println("------------------------------------");
        System.out.println("Informe qual opção você deseja realizar: ");

        int opcao = acc.nextInt();
        return opcao;
    }

    public minhaConta() throws Exception {
        double qnt;

        while(true) {

            int opcao = mostraMenu();

            switch(opcao) {
                case 0:
                    System.out.println("------------------------------------");
                    System.out.println("Encerrando...");
                    System.exit(0);
                    System.out.println("------------------------------------");
                    break;
                case 1:
                    System.out.println("------------------------------------");
                    System.out.println("Informe quanto você deseja depositar: ");
                    int deposito = acc.nextInt();
                    saldo = saldo + deposito;
                    System.out.println("Deposito efetuado com sucesso.");
                    System.out.println("------------------------------------");
                    break;
                case 2:
                    System.out.println("------------------------------------");
                    try {
                        System.out.println("Informe quanto você deseja sacar: ");
                        int saca = acc.nextInt();
                        saldo = saldo - saca;
                    }catch(ClassCastException c){

                    }
                    break;
                case 3:
                    System.out.println("Saldo total: " + saldo);
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
    }

    public static void main (String[] args) throws Exception {
        new minhaConta();
    }
}
