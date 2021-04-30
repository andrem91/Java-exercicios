/*
 * Faça um programa que peça dois números, base e expoente, calcule e mostre o primeiro
 * número elevado ao segundo número. Não utilize a função de potência da linguagem.
 */

package estruturaDeRepeticao;

import java.util.Scanner;

public class exercicio13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Informe a base: ");
		int base = scan.nextInt();
		System.out.print("Informe o expoente: ");
		int expoente = scan.nextInt();
		int potencia = 1;
		for (int i = 0; i < expoente; i++) {
			potencia *= base;
		}
		System.out.println(potencia);

		scan.close();
	}
}
