/*
 * A série de Fibonacci é formada pela seqüência 1,1,2,3,5,8,13,21,34,55,... Faça um programa capaz de gerar a série até o n-ésimo termo.
 */

package estruturaDeRepeticao;

import java.util.Scanner;

public class exercicio15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Entre com o n termo da série de Fibonacci: ");
		int n = scan.nextInt();
		int num1 = 1;
		int num2 = 1;
		int proximo = 0;
		for (int i = 3; i <= n; i++) {
			System.out.print(num1 + " ");
			proximo = num1 + num2;
			num1 = num2;
			num2 = proximo;
		}

		scan.close();
	}
}
