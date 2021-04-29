/*
 * Um posto está vendendo combustíveis com a seguinte tabela de descontos:
 * a. Álcool:
 * b. até 20 litros, desconto de 3% por litro
 * c. acima de 20 litros, desconto de 5% por litro
 * d. Gasolina:
 * e. até 20 litros, desconto de 4% por litro
 * f. acima de 20 litros, desconto de 6% por litro
 * Escreva um algoritmo que leia o número de litros vendidos, o tipo de combustível (codificado da
 * seguinte forma: A-álcool, G-gasolina), calcule e imprima o valor a ser pago pelo cliente
 * sabendo-se que o preço do litro da gasolina é R$ 2,50 o preço do litro do álcool é R$ 1,90.
 */

package estruturaDeDecisao;

import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe o combustível (A ou G): ");
		String combustivel = scan.next();
		System.out.print("Informe a quantidade em litros: ");
		double litros = scan.nextDouble();
		double desconto = 0;
		double valor = 0;
		if (combustivel.equalsIgnoreCase("A")) {
			valor = 1.9;
			if (litros <= 20) {
				desconto = 3;
			} else {
				desconto = 5;
			}
		} else if (combustivel.equalsIgnoreCase("G")) {
			valor = 2.5;
			if (litros <= 20) {
				desconto = 4;
			} else {
				desconto = 6;
			}
		}

		double total = (valor * litros) - (valor * litros * desconto / 100);
		System.out.println("Valor a ser pago é: " + total);

		scan.close();
	}
}
