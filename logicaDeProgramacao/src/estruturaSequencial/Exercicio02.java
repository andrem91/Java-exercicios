/*
 * Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número].
 */
package estruturaSequencial;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("informe um número: ");
		int numero = scan.nextInt();
		System.out.println("O número informado foi " + numero);
		
		scan.close();
	}

}
