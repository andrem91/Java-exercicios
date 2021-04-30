/*
 * Um funcionário de uma empresa recebe aumento salarial anualmente: Sabe-se que:
 * 	a. Esse funcionário foi contratado em 1995, com salário inicial de R$ 1.000,00;
 * 	b. Em 1996 recebeu aumento de 1,5% sobre seu salário inicial;
 * 	c. A partir de 1997 (inclusive), os aumentos salariais sempre correspondem ao dobro do percentual do ano anterior.
 * Faça um programa que determine o salário atual desse funcionário. Após concluir isto, altere o programa permitindo
 * que o usuário digite o salário inicial do funcionário.
 */

package estruturaDeRepeticao;

import java.text.DecimalFormat;

public class exercicio34 {

	public static void main(String[] args) {
		double salario = 1000;
		double aumento = 1.5;
		DecimalFormat format = new DecimalFormat("###,###.##");
		for (int i = 1996 ; i <= 2015 ; i++) {
			salario = salario + salario*aumento/100;
			System.out.println(i + " = " +  format.format(salario) + " - " + aumento + "%");
			aumento *= 2;
		}
	}
}
