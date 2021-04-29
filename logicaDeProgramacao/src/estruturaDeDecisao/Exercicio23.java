/*
 * O Hipermercado Tabajara está com uma promoção de carnes que é imperdível. Confira:
 * 
 *                       Até 5 Kg           Acima de 5 Kg
 *                       File Duplo      R$ 4,90 por Kg          R$ 5,80 por Kg
 *                       Alcatra         R$ 5,90 por Kg          R$ 6,80 por Kg
 *                       Picanha         R$ 6,90 por Kg          R$ 7,80 por Kg
 * Para atender a todos os clientes, cada cliente poderá levar apenas um dos tipos de carne da promoção,
 * porém não há limites para a quantidade de carne por cliente. Se compra for feita no cartão Tabajara
 * o cliente receberá ainda um desconto de 5% sobre o total da compra. Escreva um programa que peça o
 * tipo e a quantidade de carne comprada pelo usuário e gere um cupom fiscal, contendo as informações da
 * compra: tipo e quantidade de carne, preço total, tipo de pagamento, valor do desconto e valor a pagar.
 */

package estruturaDeDecisao;

import java.util.Scanner;

public class Exercicio23 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe a carne (File duplo, Alcatra, Picanha): ");
		String carne = scan.nextLine();
		System.out.print("Informe a quantidade em kilos: ");
		double kilo = scan.nextDouble();

		double precoKilo = 0;
		switch (carne) {
		case "File duplo":
			if (kilo <= 5) {
				precoKilo = 5.8;
			} else {
				precoKilo = 4.9;
			}
			break;
		case "Alcatra":
			if (kilo <= 5) {
				precoKilo = 6.8;
			} else {
				precoKilo = 5.9;
			}
			break;
		case "Picanha":
			if (kilo <= 5) {
				precoKilo = 7.8;
			} else {
				precoKilo = 6.9;
			}
			break;
		}

		double precoTotal = kilo * precoKilo;
		System.out.print("Vai pagar com o Tabajara Card (S-N)?");
		String tabajaraCard = scan.next();

		double valorDesconto = 0;
		if (tabajaraCard.equals("S")) {
			valorDesconto = (precoTotal * 0.1);
		}
		double totalComDesconto = precoTotal - valorDesconto;

		System.out.println("Produto: " + carne);
		System.out.println("Quantidade: " + kilo + "kg");
		System.out.println("Preço por kilo: R$" + precoKilo);
		System.out.println("Preço total: R$" + precoTotal);
		System.out.println("Pagou com o Tabajara Card? " + tabajaraCard);
		System.out.println("Valor desconto: " + valorDesconto);
		System.out.println("Valor a pagar: " + totalComDesconto);

		scan.close();
	}
}
