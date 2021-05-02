/*
 * Criar um vetor A com 10 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho, sendo que cada
 * elemento do vetor B deverá ser o resto da divisão do respectivo elemento de A por 2 (dois), ou seja:
 * 		B[i] := A[i] % 2.
 */

package Vetores;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] A = new int[10];
		int[] B = new int[A.length];
		for (int i = 0; i < A.length; i++) {
			System.out.print("Digite um valor para o indice " + i + ": ");
			A[i] = scan.nextInt();
		}
		for (int i = 0; i < B.length; i++) {
			B[i] = A[i] % 2;
			System.out.println("Resto da divisão de " + A[i] + " por 2 é " + B[i]);
		}
		scan.close();

	}

}
