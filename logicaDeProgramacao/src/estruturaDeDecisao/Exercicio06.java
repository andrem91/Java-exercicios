/*
 * Faça um Programa que leia três números e mostre o maior deles.
 */

package estruturaDeDecisao;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int num1 = scan.nextInt();
		System.out.print("Digite outro número: ");
		int num2 = scan.nextInt();
		System.out.print("Digite o ultimo número: ");
		int num3 = scan.nextInt();
		
		if(num1 >= num2 && num1 >= num3) {
			System.out.println(num1);
		} else if (num2 >= num3) {
			System.out.println(num2);
		} else {
			System.out.println(num3);
		}
		
		scan.close();
	}
}
