/*
 * Faça um programa que peça para n pessoas a sua idade, ao final o programa devera verificar
 * se a média de idade da turma varia entre 0 e 25,26 e 60 e maior que 60; e então, dizer se
 * a turma é jovem, adulta ou idosa, conforme a média calculada.
 */

package estruturaDeRepeticao;

import java.util.Scanner;

public class exercicio24 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Numero de pessoas na turma: ");
		int n = scan.nextInt();
		int idade = 0;
		int soma = 0;
		int media;
		for (int i = 1; i <= n; i++) {
			System.out.println("Informe a idade da " + i + "ª pessoa: ");
			idade = scan.nextInt();

			soma += idade;
		}
		media = soma / n;
		System.out.println("Média de idade: " + media);
		if (media >= 0 && media <= 25) {
			System.out.println("A turma é jovem.");
		} else if (media >= 26 && media <= 60) {
			System.out.println("A turma é Adulta.");
		} else if (media > 60) {
			System.out.println("A turma é idosa.");
		}
		scan.close();
	}
}