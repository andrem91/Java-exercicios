/*
 * Faça um programa que mostre os n termos da Série a seguir:
 * 	S = 1/1 + 2/3 + 3/5 + 4/7 + 5/9 + ... + n/m. 
 */

package estruturaDeRepeticao;

import java.util.Scanner;

public class exercicio35 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite o n termo: ");
		int numero = scan.nextInt();
		int n = 1;
		int m = 1;
		int somaN = 0;
		int somaM = 0;
		for(int i = 1 ; i < numero ; i++) {
			somaN += n;
			somaM += m;
			System.out.print(n + "/" + m + " + ");
			m+=2;
			n++;
		}
		somaN += n;
		somaM += m;
		System.out.print(n + "/" + m + " = " + somaN + "/" + somaM);
		scan.close();
	}
}
