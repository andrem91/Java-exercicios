/*
 * Criar um vetor A com 10 elementos inteiros. Implementar um programa que
 * defina e escreva a soma de todos os elementos armazenados neste vetor.
 */

package Vetores;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] A = new int[10];
		int soma = 0;
		for (int i = 0; i < A.length; i++) {
			System.out.print("Digite um valor para o indice " + i + " do vetor A:");
			A[i] = scan.nextInt();
		}
		for (int elementos : A) {
			soma += elementos;
		}
		System.out.println("A soma dos elementos do vetor A é: " + soma);
		scan.close();
	}

}
