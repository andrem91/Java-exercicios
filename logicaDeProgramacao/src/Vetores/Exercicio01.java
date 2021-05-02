/*
 * Criar um vetor A com 5 elementos inteiros. Construir um vetor B de
 * mesmo tipo e tamanho e com os "mesmos" elementos do vetor A, ou
 * seja, B[i] = A[i].
 */
package Vetores;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// int[] A = {3,5,8,9,2};
		int[] vetorA = new int[5];
		int[] vetorB = new int[vetorA.length];
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("Digite o número da posição " + i + ": ");
			vetorA[i] = scan.nextInt();
			vetorB[i] = vetorA[i];
		}
		for (int elemento : vetorB) {
			System.out.println(elemento);
		}
		scan.close();
	}

}
