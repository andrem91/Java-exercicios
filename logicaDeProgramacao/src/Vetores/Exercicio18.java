/*
 * Ler um vetor A com 10 elementos inteiros correspondentes as idades de um grupo de pessoas.
 * Escreva um programa que determine e escreva a menor e a maior idades e suas respectivas posições.
 */

package Vetores;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] idades = new int[10];
		int menorIdade = Integer.MAX_VALUE;
		int indexMenorIdade = 0;
		int maiorIdade = idades[0];
		int indexMaiorIdade = 0;
		for (int i = 0; i < idades.length; i++) {
			System.out.print("Digite a idade referente ao indice: " + i + ": ");
			idades[i] = scan.nextInt();

			if (idades[i] < menorIdade) {
				menorIdade = idades[i];
				indexMenorIdade = i;
			}
			if (idades[i] > maiorIdade) {
				maiorIdade = idades[i];
				indexMaiorIdade = i;
			}
		}
		System.out.println("A menor idade é " + menorIdade + " que está no indice " + indexMenorIdade);
		System.out.println("A maior idade é " + maiorIdade + " que está no indice " + indexMaiorIdade);
		scan.close();
	}

}
