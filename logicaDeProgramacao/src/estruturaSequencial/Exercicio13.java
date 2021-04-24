/*
 * Faça um Programa que pergunte quanto você ganha por hora e o
 * número de horas trabalhadas no mês. Calcule e mostre o total do seu
 * salário no referido mês, sabendo-se que são descontados 11% para o
 * Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um
 * programa que nos dê:
 * . salário bruto.
 * a. quanto pagou ao INSS.
 * b. quanto pagou ao sindicato.
 * c. o salário líquido.
 * d. calcule os descontos e o salário líquido, conforme a tabela
 * abaixo:
 * + Salário Bruto : R$ - IR (11%) : R$ - INSS
 * (8%) : R$ - Sindicato ( 5%) : R$ = Salário
 * Liquido : R$
 * Obs.: Salário Bruto - Descontos = Salário Líquido.
 */

package estruturaSequencial;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Quanto você ganha por hora? R$");
		double salarioHora = scan.nextDouble();
		System.out.print("Quantas horas você trabalha por mês? ");
		int horas = scan.nextInt();
		
		double salarioBruto = salarioHora * horas;
		System.out.printf("Salário Bruto +R$%.2f%n", salarioBruto);
		
		double descontoIR = salarioBruto * 0.11;
		System.out.printf("Desconto Imposto de Renda -R$%.2f%n", descontoIR);
		
		double descontoINSS = salarioBruto * 0.08;
		System.out.printf("Desconto INSS -R$%.2f%n", descontoINSS);
		
		double descontoSindicato = salarioBruto * 0.05;
		System.out.printf("Desconto sindicato -R$%.2f%n", descontoSindicato);
		
		double totalDescontos = descontoIR + descontoINSS + descontoSindicato;
		double salarioLiquido = salarioBruto - totalDescontos;
		System.out.printf("Salário Líquido +R$%.2f%n", salarioLiquido);
		
		scan.close();
	}

}
