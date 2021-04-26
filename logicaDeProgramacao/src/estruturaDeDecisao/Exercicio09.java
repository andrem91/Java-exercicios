/*
 * Faça um Programa que leia três números e mostre-os em ordem decrescente.
 */

package estruturaDeDecisao;

import java.util.Scanner;

public class Exercicio09 {

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
		
		if(num1 <= num2 ^ num1 <= num3) {
			System.out.println(num1);
		} else if(num2 <= num1 ^ num2 <= num3) {
			System.out.println(num2);
		} else if(num3 <= num1 ^ num3 <= num2) {
			System.out.println(num3);
		}
		
		if(num1 <= num2 && num1 <= num3) {
			System.out.println(num1);
		} else if (num2 <= num3) {
			System.out.println(num2);
		} else {
			System.out.println(num3);
		}
		
		
		scan.close();
	}
}
