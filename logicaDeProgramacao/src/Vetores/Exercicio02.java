/*
 * Criar um vetor A com 8 elementos inteiros. Construir um vetor B de
 * mesmo tipo e tamanho e com os elementos do vetor A multiplicados
 * por 2, ou seja: B[i] = A[i] * 2.
 */
package Vetores;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[8];
		int[] vetorB = new int[vetorA.length];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("Entre com o número da posição " + i + ": ");
			vetorA[i] = scan.nextInt();
			vetorB[i] = vetorA[i] * 2;
		}
		System.out.print("A = ");
		for (int elements : vetorA) {
			System.out.print(elements + " ");
		}
		System.out.println();
		System.out.print("B = ");
		for (int elements : vetorB) {
			System.out.print(elements + " ");
		}
		scan.close();
	}

}
