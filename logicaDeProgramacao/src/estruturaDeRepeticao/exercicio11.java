/*
 * Altere o programa anterior para mostrar no final a soma dos números.
 */

package estruturaDeRepeticao;

import java.util.Scanner;

public class exercicio11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("informe um número: ");
		int num1 = scan.nextInt();
		System.out.print("Informe outro número: ");
		int num2 = scan.nextInt();
		int soma = 0;
		if (num1 < num2) {
			num1++;
			for (int i = num1; i < num2; i++) {
				System.out.print(i + " ");
				soma += i;
			}
		} else {
			num1--;
			for (int i = num1; i > num2; i--) {
				System.out.print(i + " ");
				soma += i;
			}
		}
		System.out.println("SOMA: " + soma);
		scan.close();
	}
}
