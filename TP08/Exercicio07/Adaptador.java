package Exercicio07;

import java.util.ArrayList;
import java.util.List;

public class Adaptador implements SomadorEsperado {

	private static SomadorExistente somador = new SomadorExistente();

	public int somaVetor(int[] vetor) {

		List<Integer> lista = new ArrayList<Integer>();

		for (int cont = 0; cont < vetor.length; cont++) {
			lista.add(vetor[cont]);
		}
		return somador.somaLista(lista);
	}
}
