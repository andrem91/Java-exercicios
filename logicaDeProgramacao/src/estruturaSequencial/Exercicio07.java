/*
 * Faça um Programa que calcule a área de um quadrado, em
 * seguida mostre o dobro desta área para o usuário.
 */

package estruturaSequencial;

import java.util.Scanner;

public class Exercicio07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("informe a medida do lado de um quadrado (cm): ");
		double lado = scan.nextDouble();
		
		double area = Math.pow(lado, 2);
		System.out.printf("A área do quadrado é: %.2fcm²%n", area);
		
		scan.close();
	}
}
