/*
 * Criar um vetor A com 15 elementos inteiros. Construir um vetor B de
 * mesmo tamanho, sendo que cada elemento do vetor B deverá ser a
 * raiz quadrada do respectivo elemento de A, ou seja:
 * 		B[i] = sqrt(A[i]).
 */
package Vetores;

import java.text.DecimalFormat;

public class Exercicio04 {

	public static void main(String[] args) {

		int[] vetorA = new int[15];
		double[] vetorB = new double[vetorA.length];
		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = i + 1;
			vetorB[i] = Math.sqrt(vetorA[i]);
		}
		DecimalFormat df = new DecimalFormat("###,###.###");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Raiz quadrada de " + vetorA[i] + " é: " + df.format(vetorB[i]));
		}
	}

}
