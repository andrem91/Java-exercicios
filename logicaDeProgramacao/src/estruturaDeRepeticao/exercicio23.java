/*
 * Faça um programa que calcule o mostre a média aritmética de N notas.
 */

package estruturaDeRepeticao;

import java.util.Scanner;

public class exercicio23 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Quantidade de notas: ");
		int N = scan.nextInt();
		double nota = 0;
		double soma = 0;
		for (int i = 0; i < N; i++) {
			System.out.print((i + 1) + "ª nota: ");
			nota = scan.nextDouble();
			soma += nota;
		}
		double media = soma / N;
		System.out.printf("Média: %.2f%n", media);

		scan.close();
	}
}