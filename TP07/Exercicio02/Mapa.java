package Exercicio02;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Mapa {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        String idFuncionario;

        Map<String, Empregado> empregados = new HashMap<String, Empregado>();

        Empregado e1 = new Empregado("Steve Jobs", "Presidente", 50000);
        empregados.put("a1234", e1);

        Empregado e2 = new Empregado("Scott McNealy", "CEO", 20000);
        empregados.put("a1235", e2);

        Empregado e3 = new Empregado("Jeff Bezos", "CEO & CMO", 100000);
        empregados.put("a1236", e3);

        Empregado e4 = new Empregado("Larry Ellinson McNealy", "Diretor", 5000);
        empregados.put("a1237", e4);

        Empregado e5 = new Empregado("Bill Gates McNealy", "Owner", 800000);
        empregados.put("a1238", e5);

        System.out.println("----------------------------------------");
        System.out.println("----Mapa de cadastro de funcionários----");
        System.out.println("----------------------------------------");
        System.out.println("[1] - Verificar se um funcionário já está no Sistema (usando ID)");
        System.out.println("[2] - Exibir todos os funcionários cadastrados");
        System.out.println();
        System.out.println("Qual opção você deseja executar?");
        System.out.println("----------------------------------------");

        int opcao = sc.nextInt();

        switch(opcao) {
            case 1:
                System.out.println("----------------------------------------");
                System.out.println("Informe o ID que você deseja procurar:");
                idFuncionario = sc.next();

                if(empregados.containsKey(idFuncionario.toLowerCase())){
                    System.out.println(empregados.get(idFuncionario.toLowerCase()).toString());
                } else {
                    if (empregados.containsKey(idFuncionario.toUpperCase())){
                        System.out.println(empregados.get(idFuncionario.toUpperCase()).toString());
                    }else {
                        System.out.println("Esse funcionário NÃO está no sistema!");
                    }
                }
                System.out.println("----------------------------------------");
                break;
            case 2:

                Set<String> infos = empregados.keySet();
                System.out.println("----------------------------------------");
                System.out.println("Exibindo todos os funcionários...]");

                for(String info : infos) {
                    System.out.println(empregados.get(info).toString());
                }
        }
    }
}
