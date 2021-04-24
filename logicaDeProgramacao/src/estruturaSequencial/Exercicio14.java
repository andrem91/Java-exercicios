/* Faça um programa para uma loja de tintas. O programa deverá pedir o
tamanho em metros quadrados da área a ser pintada. Considere que a
cobertura da tinta é de 1 litro para cada 3 metros quadrados e que a
tinta é vendida em latas de 18 litros, que custam R$ 80,00. Informe ao
usuário a quantidades de latas de tinta a serem compradas e o preço
total. */

package estruturaSequencial;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Tamanho em m² da área a ser pintada: ");
		double metrosQuadrados = scan.nextDouble();
		
		double litrosDeTinta = metrosQuadrados / 3;
		
		//System.out.println(litrosDeTinta);
		
		double latasDeTinta = Math.ceil(litrosDeTinta / 18);
		
		System.out.println("Quantdade de latas de tinta a serem compradas é: " + latasDeTinta);
		
		double precoTotal = latasDeTinta * 80;
		
		System.out.println("Valor total será: R$" + precoTotal);
		
		scan.close();
	}
}
