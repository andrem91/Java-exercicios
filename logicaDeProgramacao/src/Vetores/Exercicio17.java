/*
 * Ler um vetor A com 10 elementos inteiros correspondentes as idades de um grupo de pessoas.
 * Escreva um programa que determine e escreva a quantidade de pessoas que possuem idade superior a 35 anos.
 */

package Vetores;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] idades = { 15, 18, 56, 32, 41, 12, 17, 23, 24, 36 };
		int maior35 = 0;
		for (int elementos : idades) {
			if (elementos > 35) {
				maior35++;
			}
		}
		System.out.println(maior35 + " pessoas tem mais de 35 anos");
		scan.close();
	}
}
