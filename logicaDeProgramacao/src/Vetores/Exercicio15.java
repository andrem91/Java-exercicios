/*
 * Criar um vetor A com 10 elementos inteiros. Desenvolver um programa que defina o
 * percentual de elementos pares e ímpares, respectivamente, armazenados neste vetor.
 */

package Vetores;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] A = new int[10];
		int pares = 0;
		int impares = 0;
		for (int i = 0; i < A.length; i++) {
			System.out.print("Digite um números para o indice" + i + ": ");
			A[i] = scan.nextInt();
		}
		for (int elementos : A) {
			if (elementos % 2 == 0) {
				pares++;
			} else {
				impares++;
			}
		}
		System.out.println("pares: " + pares * 100 / A.length);
		System.out.println("impares: " + impares * 100 / A.length);
		scan.close();
	}

}
