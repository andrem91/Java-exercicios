/*
 * Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo.
 */

package estruturaDeDecisao;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe um número: ");
		int numero = scan.nextInt();
		
		if(numero < 0) {
			System.out.println("O número " + numero + " é negativo.");
		} else {
			System.out.println("O número " + numero + " é positivo.");
		}
		scan.close();
	}
}
