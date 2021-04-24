/*
 * Tendo como dados de entrada a altura de uma pessoa, construa um
 * algoritmo que calcule seu peso ideal, usando a seguinte fórmula:
 * (72.7*altura) - 58
 */

package estruturaSequencial;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe sua altura: ");
		double altura = scan.nextDouble();
		
		double pesoIdeal = (72.7 * altura) - 58;
		System.out.printf("Seu peso ideal é %.2fkg%n", pesoIdeal);
		
		scan.close();
	}

}
