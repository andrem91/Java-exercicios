/*
 * Gerar aleatoriamente um vetor A com 10 elementos inteiros e iguais a 0 e 1, sugestão:
 * A[i] = (int)Math.round(Math.random() * 1);
 * Pede-se para implementar um programa que determine o percentual de números 0's e 1's existentes no vetor A.
 */
package Vetores;

public class Exercicio21 {

	public static void main(String[] args) {
		int[] A = new int[15];
		int count0 = 0;
		int count1 = 0;
		double percent0 = 0;
		double percent1 = 0;
		for (int i = 0; i < A.length; i++) {
			A[i] = (int) Math.round(Math.random() * 1);
			if (A[i] == 0) {
				count0++;
			}
			if (A[i] == 1) {
				count1++;
			}
		}
		percent0 = count0 * 100 / A.length;
		percent1 = count1 * 100 / A.length;
		System.out.println("0 = " + percent0 + "%");
		System.out.println("1 = " + percent1 + "%");
	}

}
