/*
 * As Organizações Tabajara resolveram dar um aumento de salário aos seus colaboradores e
 * lhe contraram para desenvolver o programa que calculará os reajustes.
 * Faça um programa que recebe o salário de um colaborador e o reajuste segundo o seguinte
 * critério, baseado no salário atual:
 *   * salários até R$ 280,00 (incluindo) : aumento de 20%
 *   * salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
 *   * salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
 *   * salários de R$ 1500,00 em diante : aumento de 5% Após o aumento ser realizado, informe na tela:
 *   * o salário antes do reajuste;
 *   * o percentual de aumento aplicado;
 *   * o valor do aumento;
 *   * o novo salário, após o aumento.
 */

package estruturaDeDecisao;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {		
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe o salário do colaborador: R$");
		double antigoSalario = scan.nextDouble();
		int percentAumento;
		if(antigoSalario <= 280.00) {
			percentAumento = 20;
		} else if(antigoSalario <= 700.00) {
			percentAumento = 15;
		} else if(antigoSalario <= 1500.00) {
			percentAumento = 10;
		} else {
			percentAumento = 5;
		}
		
		double valorAumento = antigoSalario * percentAumento / 100;
		double novoSalario = valorAumento + antigoSalario;
		
		System.out.printf("Salário antes do reajuste: R$%.2f%n", antigoSalario);
		System.out.println("Percentual de aumento aplicado: " + percentAumento + "%");
		System.out.printf("Valor do aumento: R$%.2f%n", valorAumento);
		System.out.printf("Novo salário: R$%.2f%n", novoSalario);
		
		scan.close();
	}
}
