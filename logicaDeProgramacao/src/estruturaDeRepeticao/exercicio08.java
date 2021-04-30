/*
 * Faça um programa que leia 5 números e informe a soma e a média dos números.
 */

package estruturaDeRepeticao;

import java.util.Scanner;

public class exercicio08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num;
		int soma = 0;
		for (int i = 1; i <= 5; i++) {
			System.out.print("Digite o " + i + "° número: ");
			num = scan.nextInt();
			soma += num;
		}
		double media = (double) soma / 5;
		System.out.println("SOMA: " + soma);
		System.out.println("MÉDIA: " + media);
		scan.close();
	}
}
