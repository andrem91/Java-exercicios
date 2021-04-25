/*
 * Faça um Programa que peça dois números e imprima o maior deles.
 */

package estruturaDeDecisao;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int num1 = scan.nextInt();
		System.out.print("Digite outro número: ");
		int num2 = scan.nextInt();
		
		if (num1 > num2) {
			System.out.println(num1);
		} else {
			System.out.println(num2);
		}
		scan.close();
	}
}
