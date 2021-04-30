/*
 * Altere o programa de cálculo dos números primos, informando, caso
 * o número não seja primo, por quais número ele é divisível.
 */

package estruturaDeRepeticao;

import java.util.Scanner;

public class exercicio22 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Digite um número: ");
		int numero = scan.nextInt();
		boolean primo = true;
		for (int i = 2; i < numero; i++) {
			if (numero % i == 0) {
				primo = false;
			}
		}
		if (primo) {
			System.out.println("O número " + numero + " é primo.");
		} else {
			System.out.println("O número " + numero + " não é primo.");
			System.out.print("Ele é divisível por: ");
			for (int i = 2; i < numero; i++) {
				if (numero % i == 0) {
					System.out.print(i + " ");
				}
			}
		}
		scan.close();
	}
}