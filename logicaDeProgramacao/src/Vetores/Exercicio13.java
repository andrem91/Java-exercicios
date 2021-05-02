/*
 * Criar um vetor A com 10 elementos inteiros. Implementar um programa que determine
 * a soma dos elementos armazenados neste vetor que são múltiplos de 5.
 */

package Vetores;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] A = new int[10];
		int soma = 0;
		String output = "Os elementos múltiplos por 5 são: ";
		for (int i = 0; i < A.length; i++) {
			System.out.print("Digite um valor para o indice " + i + " do vetor A: ");
			A[i] = scan.nextInt();
		}

		for (int elementos : A) {
			if (elementos % 5 == 0) {
				soma += elementos;
				output += elementos + ", ";
			}
		}
		System.out.println(output);
		System.out.println("A soma desses elementos é: " + soma);
		scan.close();
	}

}
