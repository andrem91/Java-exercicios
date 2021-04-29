/*
 * Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso o valor seja inválido e continue
 * pedindo até que o usuário informe um valor válido.
 */
package estruturaDeRepeticao;

import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Informe uma nota entre 0 e 10: ");
		int nota = scan.nextInt();
		while (nota < 0 || nota > 10) {
			System.out.print("Nota inválida, digite novamente: ");
			nota = scan.nextInt();
		}
		System.out.println("Nota informada foi " + nota);
		scan.close();
	}
}
