/*
 * Criar um vetor A com 15 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho,
 * sendo que cada elemento do vetor B deverá ser o quadrado do respectivo elemento de A, ou seja:
 * 	B[i] = A[i] * A[I].
 */
package Vetores;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] vetA = new int[15];
		int[] vetB = new int[vetA.length];

		for (int i = 0; i < vetA.length; i++) {
			vetA[i] = (i + 1);
			vetB[i] = (int) Math.pow(vetA[i], 2);
		}

		for (int i = 0; i < vetA.length; i++) {
			System.out.println(vetA[i] + "² = " + vetB[i]);
		}

		scan.close();
	}

}
