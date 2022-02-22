package Exercicio02.src;

import java.util.Scanner;

public class Loja {

    public static void main (String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("------- Informática Matheus -------");
        System.out.println("Precisamos dos dados da sua compra!");

        System.out.println("Informe o numero do seu produto:");
        int num = sc.nextInt();

        System.out.println("Informe a descriçao do seu produto");
        String desc = sc.next();

        System.out.println("Informe a quantidade do seu produto");
        int quant = sc.nextInt();

        System.out.println("Informe o preco unitário do seu produto");
        double valor = sc.nextDouble();

        Invoice inv = new Invoice (quant, valor);

        inv.setNum(num);
        inv.setDesc(desc);

        System.out.println("------- Informática UFOP -------");
        System.out.println("           Sua fatura:          ");

        System.out.println("Número: " + inv.getNum());
        System.out.println("Descrição: " + inv.getDesc());
        System.out.println("Quantidade: " + inv.getQuant());
        System.out.println("Valor: " + inv.getPreco());
        System.out.println();
        System.out.println("Total da fatura: " + inv.getInvoiceAmount());
        System.out.println("--------------------------------");
    }
}
