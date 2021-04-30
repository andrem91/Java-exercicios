/*
 * Faça um programa que calcule o número médio de alunos por turma. Para isto, peça a quantidade
 * de turmas e a quantidade de alunos para cada turma. As turmas não podem ter mais de 40 alunos.
 */

package estruturaDeRepeticao;

import java.util.Scanner;

public class exercicio26 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Qual a quantidade de turmas: ");
		int turmas = scan.nextInt();
		int alunos = 0;
		boolean quantidadeInvalida = true;
		int soma = 0;
		int media = 0;
		for (int i = 1; i <= turmas; i++) {
			quantidadeInvalida = true;
			while (quantidadeInvalida) {
				System.out.print("Quantidade de alunos da turma " + i + ": ");
				alunos = scan.nextInt();
				if (alunos > 0 && alunos <= 40) {
					quantidadeInvalida = false;
				} else {
					System.out.println("Quantidade de alunos não pode ser maior que 40.");
				}
			}
			soma += alunos;
		}
		media = soma / turmas;
		System.out.println("A média de alunos por turma é de " + media + " alunos.");
		scan.close();
	}
}