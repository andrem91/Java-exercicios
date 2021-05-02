/*
 * Criar um vetor A com 10 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho, obedecendo as seguintes regras de formação:
 * 		a) Bi deverá receber 1 quando Ai for par;
 * 		b) Bi deverá receber 0 quando Ai for ímpar.
 */
package Vetores;

public class Exercicio23 {

	public static void main(String[] args) {
		int[] A = new int[10];
		int[] B = new int[A.length];

		for (int i = 0; i < A.length; i++) {
			A[i] = (int) Math.round(Math.random() * 10);
			if (A[i] % 2 == 0) {
				B[i] = 1;
			} else {
				B[i] = 0;
			}
			System.out.println(A[i]);
		}
		for (int elementos : B) {
			System.out.print(elementos);
		}
	}

}
