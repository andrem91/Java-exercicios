/*
 * Faça um Programa que peça dois números e imprima a soma.
 */

package estruturaSequencial;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe um número: ");
		int num1 = scan.nextInt();
		System.out.print("Informe outro número: ");
		int num2 = scan.nextInt();
		
		int soma = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + soma );
		
		scan.close();
	}

}
