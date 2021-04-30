/*
 * Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
 * O usuário deve informar de qual numero ele deseja ver a tabuada. A saída deve ser conforme o exemplo abaixo:
 * 	Tabuada de 5:
 * 	5 X 1 = 5
 * 	5 X 2 = 10
 * 	...
 * 	5 X 10 = 50
 */

package estruturaDeRepeticao;

import java.util.Scanner;

public class exercicio12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe um número para descobrir a tabuada: ");
		int numero = scan.nextInt();
		int resultado = 0;
		for (int i = 1; i <= 10; i++) {
			resultado = numero * i;
			System.out.println(numero + " X " + i + " = " + resultado);
		}

		scan.close();
	}
}
