/*
 * Criar dois vetores A e B cada um com 10 elementos inteiros. Construir um vetor C,
 * onde cada elemento de C é a soma dos respectivos elementos em A e B, ou seja:
 * 		C[i] = A[i] + B[i].
 */

package Vetores;

public class Exercicio06 {

	public static void main(String[] args) {
		int[] A = new int[10];
		int[] B = new int[A.length];
		int[] C = new int[B.length];
		int inicio = 1;
		for (int i = 0; i < A.length; i++) {
			A[i] = inicio;
			inicio++;
		}
		inicio = 1;
		for (int i = 0; i < B.length; i++) {
			B[i] = inicio;
			inicio += 2;
		}

		for (int i = 0; i < C.length; i++) {
			C[i] = B[i] + A[i];
		}
		for (int i = 0; i < C.length; i++) {
			System.out.println(A[i] + " + " + B[i] + " = " + C[i]);
		}
	}

}
