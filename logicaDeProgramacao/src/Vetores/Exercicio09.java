/*
 * Criar dois vetores A e B cada um com 10 elementos inteiros. Construir um vetor C,
 * onde cada elemento de C é a divisão dos respectivos elementos em A e B, ou seja:
 * 		C[i] = A[i] / float(B[i]).
 */
package Vetores;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] A = new int[10];
		double[] B = new double[A.length];
		double[] C = new double[B.length];
		for (int i = 0; i < A.length; i++) {
			System.out.print("Entre com o valor do vetor A da posição " + i + ": ");
			A[i] = scan.nextInt();
		}
		for (int i = 0; i < B.length; i++) {
			System.out.print("Entre com o valor do vetor B da posição " + i + ": ");
			B[i] = scan.nextInt();
		}
		for (int i = 0; i < C.length; i++) {
			C[i] = A[i] / (B[i]);
			System.out.println(A[i] + " / " + B[i] + " = " + C[i]);
		}
		scan.close();
	}

}
