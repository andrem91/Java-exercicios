/*
 * Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.
 */
package estruturaSequencial;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe o raio do círculo (cm): ");
		double raio = scan.nextDouble();
		
		double area = Math.PI * Math.pow(raio, 2);
		System.out.printf("A área do círculo é %.2fcm²%n", area);
		
		scan.close();
	}

}
