/*
 * Faça um Programa que pergunte quanto você ganha por hora e o número de horas
 * trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.
 */
package estruturaSequencial;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Quanto você ganha por hora? R$");
		double salarioHora = scan.nextDouble();
		System.out.print("Quantas horas você trabalha por mês? ");
		int horas = scan.nextInt();
		
		double salarioMes = salarioHora * horas;
		System.out.printf("Total do seu salário no mês foi R$%.2f%n ", salarioMes);
		
		scan.close();
	}

}
