/*
 * O Departamento Estadual de Meteorologia lhe contratou para desenvolver um programa que
 * leia as um conjunto indeterminado de temperaturas, e informe ao final a menor e a maior
 * temperaturas informadas, bem como a média das temperaturas.
 */

package estruturaDeRepeticao;

import java.util.Scanner;

public class exercicio32 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean continuar = true;
		String confirma = null;
		double temperatura;
		double soma = 0;
		double menor = Double.MAX_VALUE;
		double maior = Double.MIN_VALUE;
		double media = 0;
		int qtdTemperatura = 0;
		while (continuar) {
			System.out.print("Deseja informar tereratura (S/N)? ");
			confirma = scan.next();
			if (confirma.equalsIgnoreCase("s")) {
				qtdTemperatura++;
				System.out.print("Informe uma temperatura: ");
				temperatura = scan.nextDouble();
				soma += temperatura;
				if (menor > temperatura) {
					menor = temperatura;
				}
				if (maior < temperatura) {
					maior = temperatura;
				}
			} else if (confirma.equalsIgnoreCase("n")) {
				continuar = false;
			}
		}
		System.out.println("A menor temperatura foi: " + menor);
		System.out.println("A maior temperatura foi: " + maior);
		media = soma / qtdTemperatura;
		System.out.println("A media das temperaturas foi: " + media);
		scan.close();
	}
}
