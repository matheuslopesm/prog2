package Exercicio01.B;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ProgramaB {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Set<Principal> listaDeProdutos = new HashSet<Principal>();

        System.out.println("---| Sistema de cadastro de produtos |---");
        System.out.println("Digite quantos produtos voce quer cadastrar:");
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            System.out.println("Informe...");
            System.out.println("O nome do produto [" + i + "]:");
            String nome = sc.next();

            System.out.println("O preco do produto [" + i + "]:");
            String preco = sc.next();

            System.out.println("O codigo do produto [" + i + "]:");
            int codigo = sc.nextInt();
            
            Principal p = new Principal();
            p.setNome(nome);
            p.setPreco(preco);
            p.setCodigo(codigo);

            if (listaDeProdutos.contains(p)) {
                System.out.println("Esse produto já foi cadastrado.");
            } else {
                listaDeProdutos.add(p);
            }
        }

        System.out.println("----------------------------------------");
        System.out.println("Fim do cadastro. Seus produtos cadastrados foram:");
        
        for(Principal principal : listaDeProdutos) {
        	principal.escreveNaTela();
            System.out.println("---------------------");
        }
    }
}
