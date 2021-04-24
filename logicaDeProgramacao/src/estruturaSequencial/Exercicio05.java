/*
 * Faça um Programa que converta metros para centímetros.
 */

package estruturaSequencial;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Conversão de metros para centimetros");
		System.out.print("Digite o comprimento em metros: ");
		double metros = scan.nextDouble();
		
		double centimetros = metros * 100;
		System.out.println(metros + "m = " + centimetros + "cm");
		
		scan.close();
	}

}
