/*
 * Faça um programa que receba dois números inteiros e gere os números
 * inteiros que estão no intervalo compreendido por eles.
 */

package estruturaDeRepeticao;

import java.util.Scanner;

public class exercicio10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("informe um número: ");
		int num1 = scan.nextInt();
		System.out.print("Informe outro número: ");
		int num2 = scan.nextInt();
		
		if(num1 < num2) {
			num1++;
			for(int i = num1 ; i < num2 ; i++) {
				System.out.print(i + " ");
			}
		} else {
			num1--;
			for(int i = num1 ; i > num2 ; i--) {
				System.out.print(i + " ");
			}
		}
		scan.close();
	}
}
