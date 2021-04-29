/*
 * Uma fruteira está vendendo frutas com a seguinte tabela de preços:
 *                       Até 5 Kg           Acima de 5 Kg
 *                       Morango         R$ 2,50 por Kg          R$ 2,20 por Kg
 *                       Maçã            R$ 1,80 por Kg          R$ 1,50 por Kg
 * Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar R$ 25,00,
 * receberá ainda um desconto de 10% sobre este total. Escreva um algoritmo para ler a quantidade (em Kg)
 * de morangos e a quantidade (em Kg) de maças adquiridas e escreva o valor a ser pago pelo cliente.
 */

package estruturaDeDecisao;

import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Quantidade de morango: ");
		double morango = scan.nextDouble();
		System.out.print("Quantidade de Maçã: ");
		double maca = scan.nextDouble();
		
		double precoMorango = 2.5;
		double precoMaca = 1.8;
		if (morango > 5) {
			precoMorango = 2.2;
		}
		if (maca > 5) {
			precoMaca = 1.5;
		}
		double totalMorango = morango * precoMorango;
		double totalMaca = maca * precoMaca;
		double total = totalMorango + totalMaca;
		double desconto = 0;
		if(morango + maca > 8 || total > 25) {
			desconto = 10;
		}
		double totalComDesconto = total - (total * desconto / 100);
		
		
		System.out.println("Quantidade de morango: " + morango + "kg");
		System.out.println("Preço morango por kg: R$" + precoMorango);
		System.out.println("Total morango: R$" + totalMorango);
		System.out.println("Quantidade de maçã: " + maca + "kg");
		System.out.println("Preço maçã por kg: R$" + precoMaca);
		System.out.println("Total maçã: R$" + totalMaca);
		System.out.println("----------------------------");
		System.out.println("Total: R$" + total);
		System.out.println("Desconto: " + desconto + "%");
		System.out.println("Total com desconto: R$" + totalComDesconto);
		
		scan.close();
	}
}
