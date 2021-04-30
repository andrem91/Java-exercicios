/*
 * Altere o programa anterior para que ele aceite apenas números entre 0 e 1000.
 */

package estruturaDeRepeticao;

import java.util.Scanner;

public class exercicio19 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe quantos números terá no conjunto N: ");
		int n = scan.nextInt();
		int num = 0;
		int soma = 0;
		int maior = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;
		for (int i = 1; i <= n; i++) {
			boolean valida = false;
			while (!valida) {
				System.out.print("Digite o " + i + "° número entre 0 e 1000: ");
				num = scan.nextInt();
				if (num >= 0 && num <= 1000) {
					valida = true;
				} else {
					System.out.println("Número inválido.");
				}
			}
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
