/*
 * Ler um vetor A com 10 elementos e construir um vetor B de mesmo tipo e tamanho e com os mesmos elementos de A, sendo que estes
 * deverão estar invertidos, ou seja, o primeiro elemento de A passa a ser o último de B, o segundo elemento de A passa a ser o
 * penúltimode B e assim por diante.
 */
package Vetores;

public class Exercicio24 {

	public static void main(String[] args) {
		int[] A = new int[10];
		int[] B = new int[A.length];
		for (int i = 0; i < A.length; i++) {
			A[i] = (i + 1) * 2;
		}
		for (int i = 0; i < B.length; i++) {
			B[i] = A[A.length - 1 - i];

			System.out.println(B[i]);
		}
	}

}
