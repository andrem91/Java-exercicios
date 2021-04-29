/*
 * Faça um programa que leia e valide as seguintes informações:
 *	a. Nome: maior que 3 caracteres;
 * 	b. Idade: entre 0 e 150;
 *	c. Salário: maior que zero;
 *	d. Sexo: 'f' ou 'm';
 * 	e. Estado Civil: 's', 'c', 'v', 'd';
 */
package estruturaDeRepeticao;

import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean infoValida = false;
		String nome = null, sexo = null, estadoCivil = null;
		int idade = 0;
		double salario = 0;

		while (!infoValida) {
			System.out.print("Nome: ");
			nome = scan.nextLine();
			if (nome.length() <= 3) {
				System.out.println("Nome não pode ter menos que 3 caracteres.");
			} else {
				infoValida = true;
			}
		}

		infoValida = false;
		while (!infoValida) {
			System.out.print("Idade: ");
			idade = scan.nextInt();
			if (idade < 0 || idade > 150) {
				System.out.println("Idade deve estar entre 0 e 150.");
			} else {
				infoValida = true;
			}
		}

		infoValida = false;
		while (!infoValida) {
			System.out.print("Salário: ");
			salario = scan.nextDouble();
			if (salario <= 0) {
				System.out.println("Salário deve ser maior que 0.");
			} else {
				infoValida = true;
			}
		}

		infoValida = false;
		while (!infoValida) {
			System.out.print("sexo (M/F): ");
			sexo = scan.next();
			if (!sexo.equalsIgnoreCase("m") && !sexo.equalsIgnoreCase("f")) {
				System.out.println("Sexo deve ser M para masculino e F para feminino.");
			} else {
				infoValida = true;
			}
		}

		infoValida = false;
		while (!infoValida) {
			System.out.print("Estado civil (S, C, V ou D): ");
			estadoCivil = scan.next();
			if (!estadoCivil.equalsIgnoreCase("S") && !estadoCivil.equalsIgnoreCase("C")
					&& !estadoCivil.equalsIgnoreCase("V") && !estadoCivil.equalsIgnoreCase("D")) {
				System.out.println("Estado civil inválido.");
			} else {
				infoValida = true;
			}
		}

		System.out.println("-------------------------------------------");
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Salário: " + salario);
		System.out.println("Sexo: " + sexo.toUpperCase());
		System.out.println("Estado Civil: " + estadoCivil.toUpperCase());

		scan.close();
	}
}
