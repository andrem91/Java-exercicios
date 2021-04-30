/*
 * Numa eleição existem três candidatos. Faça um programa que peça o número total de eleitores.
 * Peça para cada eleitor votar e ao final mostrar o número de votos de cada candidato.
 */

package estruturaDeRepeticao;

import java.util.Scanner;

public class exercicio25 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Quantidade de eleitores? ");
		int eleitores = scan.nextInt();
		int voto = 0;
		int candidato1 = 0;
		int candidato2 = 0;
		int candidato3 = 0;
		for (int i = 1; i <= eleitores; i++) {
			System.out.print("Vote no candidato 1, 2 ou 3: ");
			voto = scan.nextInt();
			if (voto == 1) {
				candidato1++;
			} else if (voto == 2) {
				candidato2++;
			} else if (voto == 3) {
				candidato3++;
			}
		}
		System.out.println("Candidato 1 recebeu " + candidato1 + " votos.");
		System.out.println("Candidato 2 recebeu " + candidato2 + " votos.");
		System.out.println("Candidato 3 recebeu " + candidato3 + " votos.");
		scan.close();
	}
}