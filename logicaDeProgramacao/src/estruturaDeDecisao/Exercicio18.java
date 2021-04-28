/*
 * Faça um Programa para leitura de três notas parciais de um aluno. O programa deve calcular
 * a média alcançada por aluno e presentar: Resolução
 * a. A mensagem "Aprovado", se a média for maior ou igual a 7, com a respectiva média alcançada;
 * b. A mensagem "Reprovado", se a média for menor do que 7, com a respectiva média alcançada;
 * c. A mensagem "Aprovado com Distinção", se a média for igual a 10.
 */

package estruturaDeDecisao;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite a primeira nota: ");
		double nota1 = scan.nextDouble();
		System.out.print("Digite a segunda nota: ");
		double nota2 = scan.nextDouble();
		System.out.print("Digite a terceira nota: ");
		double nota3 = scan.nextDouble();
		
		double media = (nota1 + nota2 + nota3) / 3;
		String mensagem;
		if(media == 10) {
			mensagem = "Aprovado com distinção";
		} else if(media >= 7 ) {
			mensagem = "APROVADO";
		} else {
			mensagem = "REPROVADO";
		}
		
		System.out.printf("Média: %.2f%n", media);
		System.out.println("Status: " + mensagem);
		
		scan.close();
		
	}

}
