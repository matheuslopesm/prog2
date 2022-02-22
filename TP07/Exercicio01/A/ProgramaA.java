package Exercicio01.A;

import java.util.*;

public class ProgramaA {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Set<String> listaDeNomes = new HashSet<String>();

        System.out.println("----------------------------------------");
        System.out.println("Digite quantos nomes você quer informar:");
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            System.out.println("Informe o nome [" + i + "]:");
            String nomes = sc.next();
            listaDeNomes.add(nomes);
        }
        System.out.println("----------------------------------------");
        System.out.println("Fim do Loop. Agora você tem 3 opções:");
        System.out.println("[1] - Deletar um nome do conjunto");
        System.out.println("[2] - Verificar se um nome já está no conjunto");
        System.out.println("[3] - Deletar TODOS os nomes do conjunto (Zerar a lista)");
        System.out.println();
        System.out.println("Qual opção você deseja executar?");
        int opcao = sc.nextInt();

        switch(opcao) {
            case 1:
                System.out.println("----------------------------------------");
                System.out.println("Você escolheu [Deletar um nome do conjunto]");
                System.out.println("Informe o nome que você deseja deletar:");
                String nomeDeletado = sc.next();
                if(listaDeNomes.contains(nomeDeletado)){
                    listaDeNomes.remove(nomeDeletado);
                    System.out.println("Nome deletado com sucesso. Sua nova lista é:");
                    System.out.println(listaDeNomes);
                } else {
                    System.out.println("Esse nome não está na lista!");
                }
                System.out.println("----------------------------------------");
                break;
            case 2:
                System.out.println("----------------------------------------");
                System.out.println("Você escolheu [Verificar se um nome já está no conjunto]");
                System.out.println("Informe o nome que você deseja verificar:");
                String nomeVerificado = sc.next();
                if(listaDeNomes.contains(nomeVerificado)){
                    System.out.println("Esse nome já está na lista!");
                } else {
                    System.out.println("Esse nome não está na lista!");
                }
                System.out.println("----------------------------------------");
                break;
            case 3:
                System.out.println("----------------------------------------");
                System.out.println("Você escolheu [Deletar TODOS os nomes do conjunto (Zerar a lista)]");
                System.out.println("Zerando...");
                listaDeNomes.clear();
                System.out.println("Lista zerada com sucesso!");
                System.out.println(listaDeNomes);
                System.out.println("----------------------------------------");
                break;
        }
    }
}
