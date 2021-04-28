/*
 * Faça um Programa que peça um número inteiro e determine se ele é par ou impar.
 * Dica: utilize o operador módulo (resto da divisão).
 */

package estruturaDeDecisao;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int numero = scan.nextInt();
		
		if(numero%2 == 0) {
			System.out.println("O número " + numero + " é par.");
		} else {
			System.out.println("O número " + numero + " é impar.");
		}
		scan.close();
	}
}
