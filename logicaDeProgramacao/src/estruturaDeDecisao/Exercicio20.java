/*
 * Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são: Resolução
 * a. "Telefonou para a vítima?"
 * b. "Esteve no local do crime?"
 * c. "Mora perto da vítima?"
 * d. "Devia para a vítima?"
 * e. "Já trabalhou com a vítima?"
 * O programa deve no final emitir uma classificação sobre a participação da pessoa no crime.
 * Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita",
 * entre 3 e 4 como "Cúmplice" e 5 como "Assassino". Caso contrário, ele será classificado como "Inocente".
 */
package estruturaDeDecisao;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Responde S para sim ou N para não.");
		System.out.print("Telefonou para a vítima?");
		String pergunta1 = scan.next();
		System.out.print("Esteve no local do crime?");
		String pergunta2 = scan.next();
		System.out.print("Mora perto da vítima?");
		String pergunta3 = scan.next();
		System.out.print("Devia para a vítima?");
		String pergunta4 = scan.next();
		System.out.print("Já trabalhou com a vítima?");
		String pergunta5 = scan.next();
		
		int count = 0;
		if(pergunta1.equalsIgnoreCase("S")) count++;
		if(pergunta2.equalsIgnoreCase("S")) count++;
		if(pergunta3.equalsIgnoreCase("S")) count++;
		if(pergunta4.equalsIgnoreCase("S")) count++;
		if(pergunta5.equalsIgnoreCase("S")) count++;
		
		String classificacao;
		if(count == 2) {
			classificacao = "Suspeito";
		} else if(count == 3 || count == 4) {
			classificacao = "Cúmplice";
		} else if(count == 5) {
			classificacao = "Assassino";
		} else {
			classificacao = "Inocente";
		}
		
		
		System.out.println("Respondeu positivamente a " + count + " Questões. Sua classicicação é " + classificacao + ".");
		scan.close();
	}
}
