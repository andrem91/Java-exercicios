/*
 * Criar um vetor A com 10 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho,
 * sendo que cada elemento do vetor B deverá ser o respectivo elemento de A multiplicado
 * por sua posição (ou índice), ou seja:
 * 		B[i] = A[i] * i.
 */
package Vetores;

public class Exercicio05 {

	public static void main(String[] args) {
		int[] A = new int[10];
		int[] B = new int[A.length];
		int inicio = 1;
		for (int i = 0; i < A.length; i++) {
			A[i] = inicio;
			inicio++;
			B[i] = A[i] * i;
		}
		System.out.println("A[i] | B[i]");
		for (int i = 0; i < B.length; i++) {
			System.out.println(A[i] + " | " + B[i]);
		}
	}

}
