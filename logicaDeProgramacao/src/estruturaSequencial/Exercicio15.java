/*
 * Faça um programa que peça o tamanho de um arquivo para download
 * (em MB) e a velocidade de um link de Internet (em Mbps), calcule e
 * informe o tempo aproximado de download do arquivo usando este link
 * (em minutos).
 */
package estruturaSequencial;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe o tamanho do arquivo: ");
		double tamanhoArquivo = scan.nextDouble();
		System.out.println("Informe a velocidade da internet: ");
		double velocidadeInternet = scan.nextDouble();
		double tempoDownload = tamanhoArquivo / velocidadeInternet;
		System.out.printf("O tempo de download é de %.2f%n", tempoDownload);
		
		scan.close();
	}

}
