package br.com.facisa.pp.bubbleSort;

/**
 * Ordena um array de inteiros utilizando o algoritmo classico do BubbleSort,
 * que consiste em iterar sobre o array empurando os maiores valores para o
 * final.
 * @author Bruno de Brito.
 */
public class BubbleSort {

	/**
	 * Metodo sem retorno ou paramentro que realiza a ordena��o de um vetor.
	 */
	public static void ordenar(int vetor[]) {

		for (int i = vetor.length; i >= 1; i--) {
			for (int j = 1; j < i; j++) {
				if (vetor[j - 1] > vetor[j]) {
					int AUX = vetor[j];
					vetor[j] = vetor[j - 1];
					vetor[j - 1] = AUX;
				}
			}
		}
	}
}