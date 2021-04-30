/*
 * Desenvolva um programa que faça a tabuada de um número qualquer inteiro que será digitado pelo usuário,
 * mas a tabuada não deve necessariamente iniciar em 1 e terminar em 10, o valor inicial e final devem ser
 * informados também pelo usuário, conforme exemplo abaixo:
 * 	Montar a tabuada de: 5
 * 	Começar por: 4
 * 	Terminar em: 7
 * 
 * 	Vou montar a tabuada de 5 começando em 4 e terminando em 7:
 * 	5 X 4 = 20
 * 	5 X 5 = 25
 * 	5 X 6 = 30
 * 	5 X 7 = 35
 */

package estruturaDeRepeticao;

import java.util.Scanner;

public class exercicio33 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Montar a tabuada de: ");
		int tabuadaDe = scan.nextInt();
		boolean valida = false;
		int comeca = 0;
		int termina = 0;
		int resultado = 0;

		while (!valida) {
			System.out.print("Começa por: ");
			comeca = scan.nextInt();
			System.out.print("Termina em: ");
			termina = scan.nextInt();
			if (comeca > termina) {
				System.out.println("ERRO! O número que começa tem que ser maior que o número que termina.");
			} else {
				valida = true;
			}
		}
		System.out.println(
				"Vou montar a tabuada de " + tabuadaDe + " começando em " + comeca + " e termina em " + termina + ":");
		for (int i = comeca; i <= termina; i++) {
			resultado = i * tabuadaDe;
			System.out.println(tabuadaDe + " x " + i + " = " + resultado);
		}
		scan.close();
	}
}
