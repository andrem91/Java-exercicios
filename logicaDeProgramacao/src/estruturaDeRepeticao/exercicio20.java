/*
 * Altere o programa de cálculo do fatorial, permitindo ao usuário calcular o fatorial
 * várias vezes e limitando o fatorial a números inteiros positivos e menores que 16.
 */

package estruturaDeRepeticao;

import java.util.Scanner;

public class exercicio20 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numero = 0;

		boolean valida = false;
		while (!valida) {
			while (!valida) {
				System.out.print("Digite um número para descobrir seu fatorial: ");
				numero = scan.nextInt();
				if (numero >= 16) {
					System.out.println("Número inválido. Você deve digitar um número menor que 16.");
				} else {
					valida = true;
				}
			}
			valida = false;
			int fat = 1;
			int numero2 = numero;
			while (numero > 0) {
				fat *= numero;
				numero--;
			}
			System.out.println(numero2 + "! = " + fat);
			boolean opcaoValida = false;
			while (!opcaoValida) {
				System.out.print("Deseja calcular outro fatorial (S-N)?");
				String repetir = scan.next();
				if (repetir.equalsIgnoreCase("n")) {
					System.out.println("Fim!");
					valida = true;
					opcaoValida = true;
				} else if (repetir.equalsIgnoreCase("s")) {
					opcaoValida = true;
				} else {
					System.out.println("Opção inválida. Digire S para sim e N para não.");
				}
			}
		}
		scan.close();
	}
}