package Exercicio03.A;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ProgA {

    public static void main(String[] args) {

        ArrayList<Integer> listaDeNumeros = new ArrayList<Integer>();

        Random r = new Random();

        for(int i = 0; i < 51; i++) {
            int k = r.nextInt(99);
            listaDeNumeros.add(k);
        }

        for(int i = 0; i < 51; i++) {
            System.out.println(listaDeNumeros.get(i));
        }

        System.out.println();

        System.out.println("Maior número: " + Collections.max(listaDeNumeros));
        System.out.println("Menor número: " + Collections.min(listaDeNumeros));
        System.out.println("O menor número apareceu " + Collections.frequency(listaDeNumeros, Collections.min(listaDeNumeros)) + " vezes");
        Collections.sort(listaDeNumeros);
        System.out.println("A lista em ordem crescente é: ");
        System.out.println(listaDeNumeros);
    }
}