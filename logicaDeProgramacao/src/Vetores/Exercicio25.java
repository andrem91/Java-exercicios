/*
 * Ler dois vetores A e B com 10 elementos cada. Construir um vetor C, sendo este a junção dos dois outros vetores. Os primeiros 10
 * elementos de C deverão receber os elementos de A e os últimos elementos C deverão receber os elementos de B. Desta forma, C
 * deverá ter o dobro de elementos de A e B, ou seja, 20 elementos.
 */
package Vetores;

public class Exercicio25 {

	public static void main(String[] args) {
		int[] A = new int[10];
		int[] B = new int[A.length];
		int[] C = new int[A.length + B.length];
		for (int i = 0; i < A.length; i++) {
			A[i] = (i + 1) * 2;
			C[i] = A[i];
		}
		for (int i = 0; i < B.length; i++) {
			B[i] = A[A.length - 1 - i];
			C[i + A.length] = B[i];
		}
		for (int i = 0; i < C.length; i++) {
			System.out.print(C[i] + " ");
		}
	}

}
