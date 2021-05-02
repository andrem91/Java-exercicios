/*
 * Criar um vetor A com 10 elementos inteiros. Implementar um programa que defina e
 * escreva a média aritmética simples dos elementos ímpares armazenados neste vetor.
 */

package Vetores;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] A = new int[10];
		int soma = 0;
		double media = 0;
		int elementosImpares = 0;
		for(int i = 0 ; i< A.length ; i++) {
			System.out.print("Digite um número para o indice " + i + ": ");
			A[i] = scan.nextInt();
		}
		for(int elementos : A) {
			if(elementos % 2 != 0 ) {
				soma+=elementos;
				elementosImpares++;
				System.out.print(elementos + " ");
			}
		}
		media = soma / elementosImpares;
		System.out.println("\nmédia: " + media);
		scan.close();
	}

}
