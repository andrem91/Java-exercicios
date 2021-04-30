/*
 * Faça um programa que peça 10 números inteiros, calcule e mostre a quantidade de números pares e a quantidade de números impares.
 */

package estruturaDeRepeticao;

import java.util.Scanner;

public class exercicio14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numero;
		int impar = 0;
		int par = 0;
		for (int i = 0; i <= 10; i++) {
			System.out.print("Informe o " + i + "° número: ");
			numero = scan.nextInt();
			if (numero % 2 == 0) {
				par++;
			} else {
				impar++;
			}
		}
		System.out.println("Quantidade de números pares: " + par);
		System.out.println("Quantidade de números impares: " + impar);

		scan.close();
	}
}
