/*
 * Faça um programa que peça um número inteiro e determine se ele é ou não um número primo.
 * Um número primo é aquele que é divisível somente por ele mesmo e por 1.
 */

package estruturaDeRepeticao;

import java.util.Scanner;

public class exercicio21 {

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
		}
		scan.close();
	}
}