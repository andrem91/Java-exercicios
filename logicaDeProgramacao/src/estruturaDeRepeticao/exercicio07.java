/*
 * Faça um programa que leia 5 números e informe o maior número.
 */

package estruturaDeRepeticao;

import java.util.Scanner;

public class exercicio07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int maior = Integer.MIN_VALUE;
		int num;
		for (int i = 1; i <= 5; i++) {
			System.out.print("Digite o " + i + "° número: ");
			num = scan.nextInt();
			if (maior < num) {
				maior = num;
			}
		}
		System.out.println("Maior número foi: " + maior);
		scan.close();
	}
}
