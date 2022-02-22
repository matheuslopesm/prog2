package Exercicio2;

import java.util.Scanner;

public class JogoDaVelha {

    private int casa[][] = new int[3][3];

    public JogoDaVelha() {
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                casa[i][j] = 0;
            }
        }
    }

    public void exibegrade() {
        System.out.println("Jogo da Velha ------");
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print(casa[i][j] + " ");
            }
            System.out.println();
        }
    }

    public int verificacao() {
        for (int i = 0; i < 3; i++) {
            if ((casa[i][0] == casa[i][1]) && (casa[i][0] == casa[i][2])) {
                if (casa[i][0] != 0) {
                    return casa[i][0];
                }
            }
        }
        for (int j = 0; j < 3; j++) {
            if ((casa[0][j] == casa[1][j]) && (casa[0][j] == casa[2][j]) && (casa[0][j] != 0)) {
                return casa[0][j];
            }
        }
        if ((casa[0][0] == casa[1][1]) && (casa[0][0] == casa[2][2]) && (casa[0][0] != 0)) {
            return casa[0][0];
        }
        if ((casa[0][2] == casa[1][1]) && (casa[0][2] == casa[2][0]) && (casa[0][2] != 0)) {
            return casa[0][2];
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (casa[i][j] == 0) {
                    return 0;
                }
            }
        }
        return 3;
    }

    public boolean jogada(int jogador, int casalinha, int casacoluna) {
        if((casalinha < 0) || (casalinha > 2)) {
            return false;
        }
        if((casacoluna < 0) || (casacoluna > 2)) {
            return false;
        }
        if(casa[casalinha][casacoluna] != 0) {
            return false;
        }
        casa[casalinha][casacoluna] = jogador;
        return true;
    }

    public static void main (String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            JogoDaVelha casa = new JogoDaVelha();
            int jogador = 1;
            int vencedor = casa.verificacao();
            casa.exibegrade();

            while(vencedor == 0){
                System.out.println();
                System.out.println("Jogador " + jogador + "...");
                System.out.print("Informe a Linha da sua jogada: ");
                int casalinha = sc.nextInt();
                System.out.print("Informe a Coluna da sua jogada: ");
                int casacoluna = sc.nextInt();
                System.out.println();

                if(!casa.jogada(jogador, casalinha-1, casacoluna-1)) {
                    System.out.println("Jogada impossível. Jogue Novamente!");
                    System.out.println("Você só pode jogar entre 3 linhas e 3 colunas!");
                    System.out.println();
                }
                else{
                    jogador = (jogador == 1) ? 2 : 1;
                }
                casa.exibegrade();
                vencedor = casa.verificacao();
            }
            switch(vencedor){
                case 1:
                    System.out.println();
                    System.out.println("Fim de jogo!!!!");
                    System.out.println("Parabéns Jogador 1, você venceu!");
                    break;
                case 2:
                    System.out.println();
                    System.out.println("Fim de jogo!!!!");
                    System.out.println("Parabéns Jogador 2, você venceu!");
                    break;
                case 3:
                    System.out.println();
                    System.out.println("Fim de jogo!!!!");
                    System.out.println("O jogo Empatou. ");
                    break;
            }
        }
    }
}
