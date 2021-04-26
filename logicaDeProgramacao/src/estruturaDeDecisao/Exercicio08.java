/*
 * Faça um programa que pergunte o preço de três produtos e informe qual
 * produto você deve comprar, sabendo que a decisão é sempre pelo mais barato.
 */

package estruturaDeDecisao;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe o preço do primeiro produto: ");
		double produto1 = scan.nextDouble();
		System.out.println("Informe o preço do segundo produto: ");
		double produto2 = scan.nextDouble();
		System.out.println("Informe o preço do terceiro produto: ");
		double produto3 = scan.nextDouble();
		
		if(produto1 <= produto2 || produto1 <= produto3) {
			System.out.println("O primero produto é o mais barato.");
		} else if(produto2 <= produto3) {
			System.out.println("O segundo produto é o mais barato");
		} else {
			System.out.println("O terceiro produto é o mais barato");
		}
		
		scan.close();
	}
}
