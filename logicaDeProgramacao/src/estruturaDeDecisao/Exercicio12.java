/*
 * Faça um programa para o cálculo de uma folha de pagamento, sabendo que os descontos são do
 * Imposto de Renda, que depende do salário bruto (conforme tabela abaixo) e
 * 3% para o Sindicato e que o FGTS corresponde a 11% do Salário Bruto, mas não é descontado
 * (é a empresa que deposita). O Salário Líquido corresponde ao Salário Bruto menos os descontos.
 * O programa deverá pedir ao usuário o valor da sua hora e a quantidade de horas trabalhadas no mês.
 *   Desconto do IR:
 *   * Salário Bruto até 900 (inclusive) - isento
 *   * Salário Bruto até 1500 (inclusive) - desconto de 5%
 *   * Salário Bruto até 2500 (inclusive) - desconto de 10%
 *   * Salário Bruto acima de 2500 - desconto de 20%
 *   * Imprima na tela as informações, dispostas conforme o exemplo abaixo.
 *   * No exemplo o valor da hora é 5 e a quantidade de hora é 220.
 *   ```
 *       Salário Bruto: (5 * 220)        : R$ 1100,00
 *       (-) IR (5%)                     : R$   55,00  
 *       (-) INSS ( 10%)                 : R$  110,00
 *       FGTS (11%)                      : R$  121,00
 *       Total de descontos              : R$  165,00
 *       Salário Liquido                 : R$  935,00
 *   ```
 */

package estruturaDeDecisao;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {		
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe o valor das da sua hora: ");
		int valorHora = scan.nextInt();
		System.out.print("Informe  quantidade de horas trabalhadas no mês: ");
		int horasTrabalhadas = scan.nextInt();
		double salarioBruto = (double) valorHora * (double )horasTrabalhadas;
		int percentDescontoIR;
		if(salarioBruto <= 900) {
			percentDescontoIR = 0;
		} else if(salarioBruto <= 1500) {
			percentDescontoIR = 5;
		} else if(salarioBruto <= 2500) {
			percentDescontoIR = 10;
		} else {
			percentDescontoIR = 20;
		}
		
		double descontoIR = salarioBruto * percentDescontoIR / 100;
		double descontoINSS = salarioBruto * 0.1;
		double FGTS = salarioBruto * 0.11;
		double totalDesconto = descontoINSS + descontoIR;
		double salarioLiquido = salarioBruto - totalDesconto;
		System.out.println("Salário bruto: ("+ valorHora + " * " + horasTrabalhadas + ") : R$" + salarioBruto);
		System.out.println("(-) IR (" + percentDescontoIR + "%) : R$" + descontoIR);
		System.out.println("(-) INSS (10%): R$" + descontoINSS);
		System.out.println("FGTS (11%): R$" + FGTS);
		System.out.println("Total de descontos: R$" +  totalDesconto);
		System.out.println("Salário Líquido: R$" + salarioLiquido);
		
		scan.close();
	}
}
