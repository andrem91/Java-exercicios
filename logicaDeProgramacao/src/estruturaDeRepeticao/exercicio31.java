/*
 * Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
 * Ex.: 5!=5.4.3.2.1=120. A saída deve ser conforme o exemplo abaixo:
 * 	Fatorial de: 5
 * 	5! =  5 . 4 . 3 . 2 . 1 = 120
 */

package estruturaDeRepeticao;

import java.util.Scanner;

public class exercicio31 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Fatorial de: ");
		int numero = scan.nextInt();
		int fat = numero;
		int sub = numero;
		System.out.print(fat + "! = ");
		for(int i = 1 ; i < numero ; i++) {
			System.out.print(sub + " . ");
			sub = numero - i;
			fat = fat * (sub);
		}
		System.out.print("1 = " + fat );
		scan.close();
	}
}
