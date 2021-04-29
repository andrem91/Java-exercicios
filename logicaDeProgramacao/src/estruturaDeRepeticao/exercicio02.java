/*
 * Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual ao nome do usuário,
 * mostrando uma mensagem de erro e voltando a pedir as informações.
 */
package estruturaDeRepeticao;

import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean infoValida = false;
		String userName;
		String password;
		while (!infoValida) {
			System.out.print("Digite o nome de usuário: ");
			userName = scan.next();
			System.out.print("Digite a senha: ");
			password = scan.next();

			if (userName.equals(password)) {
				System.out.println("Nome e senha não podem ser iguais. Tente novamente.");
			} else {
				infoValida = true;
				System.out.println("Nome de usuário e senha salvas com sucesso.");
			}
		}
		scan.close();
	}
}
