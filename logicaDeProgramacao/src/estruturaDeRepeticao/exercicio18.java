/*
 * Faça um programa que, dado um conjunto de N números, determine o menor valor, o maior valor e a soma dos valores.
 */

package estruturaDeRepeticao;

import java.util.Scanner;

public class exercicio18 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe quantos números terá no conjunto N: ");
		int n = scan.nextInt();
		int num = 0;
		int soma = 0;
		int maior = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;
		for (int i = 1; i <= n; i++) {
			System.out.print("Digite o " + i + "° número: ");
			num = scan.nextInt();
			soma += num;

			if (num > maior) {
				maior = num;
			}
			if (num < menor) {
				menor = num;
			}
		}
		System.out.println("A soma dos valores é: " + soma);
		System.out.println("O maior número é: " + maior);
		System.out.println("O menor número é: " + menor);

		scan.close();
	}
}
