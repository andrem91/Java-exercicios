/*
 * Altere o programa anterior permitindo ao usuário informar as populações e as
 * taxas de crescimento iniciais. Valide a entrada e permita repetir a operação.
 */

package estruturaDeRepeticao;

import java.util.Scanner;

public class exercicio05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double populacaoA = 0;
		double crescimentoAnualA = 0;

		double populacaoB = 0;
		double crescimentoAnualB = 0;

		boolean valido = false;

		do {
			System.out.print("Entre com a população A: ");
			populacaoA = scan.nextDouble();

			if (populacaoA > 0) {
				valido = true;
			} else {
				System.out.println("População A precisa ser maior do que zero.");
			}
		} while (!valido);

		valido = false;
		do {
			System.out.print("Entre com a população B: ");
			populacaoB = scan.nextDouble();

			if (populacaoB > 0) {
				valido = true;
			} else {
				System.out.println("População B precisa ser maior do que zero.");
			}
		} while (!valido);

		valido = false;
		do {
			System.out.print("Entre com a taxa de crescimento da populção A: ");
			crescimentoAnualA = scan.nextDouble();

			if (crescimentoAnualA > 0) {
				valido = true;
			} else {
				System.out.println("A taxa de crescimento A precisa ser maior do que zero.");
			}
		} while (!valido);

		valido = false;
		do {
			System.out.print("Entre com a taxa de crescimento da populção B: ");
			crescimentoAnualB = scan.nextDouble();

			if (crescimentoAnualB > 0) {
				valido = true;
			} else {
				System.out.println("A taxa de crescimento B precisa ser maior do que zero.");
			}
		} while (!valido);

		int ano = 0;
		while (populacaoA <= populacaoB) {
			populacaoA += (populacaoA * crescimentoAnualA / 100);
			populacaoB += (populacaoB * crescimentoAnualB / 100);

			ano++;
		}
		System.out.println("o número de anos necessários para que a população do país A ultrapasse ou iguale a\r\n"
				+ "população do país B é: " + ano + " anos.");
		System.out.println("População A: " + populacaoA);
		System.out.println("População B: " + populacaoB);
		scan.close();
	}
}
