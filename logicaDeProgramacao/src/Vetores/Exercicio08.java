/*
 * Criar dois vetores A e B cada um com 10 elementos inteiros. Construir um vetor C,
 * onde cada elemento de C é a multiplicação dos respectivos elementos em A e B, ou seja:
 * 		C[i] = A[i] * B[i].
 */

package Vetores;

public class Exercicio08 {

	public static void main(String[] args) {
		int[] A = new int[10];
		int[] B = new int[A.length];
		int[] C = new int[B.length];
		int inicio = 1;
		for (int i = 0; i < A.length; i++) {
			A[i] = inicio;
			B[i] = inicio * 2;
			C[i] = A[i] * B[i];
			inicio++;
		}
		for (int i = 0; i < C.length; i++) {
			System.out.println(A[i] + " x " + B[i] + " = " + C[i]);
		}
	}

}
