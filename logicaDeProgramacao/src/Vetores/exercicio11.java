/*
 * Criar um vetor A com 10 elementos inteiros. Implementar um programa que defina
 * e escreva a quantidade de elementos armazenados neste vetor que são pares.
 */

package Vetores;

import java.util.Scanner;

public class exercicio11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] A = new int[10];
		int pares = 0;
		for (int i = 0; i < A.length ; i++) {
			System.out.print("Digite um valor para o indice " + i + ": ");
			A[i] = scan.nextInt();
		}
		for (int elementos : A) {
			if(elementos % 2 == 0) {
				pares++;
				System.out.println(elementos);
			}
		}
		System.out.println("Há " + pares + " números pares no vetor A.");
		scan.close();
	}

}
