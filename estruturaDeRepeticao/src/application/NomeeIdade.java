package application;

import java.util.Scanner;

public class NomeeIdade {

	/*
	 * Faça um programa que leia conjuntos de dois valores, o primeiro é o nome e o
	 * segundo a idade, pare quando inserir 0 no nome)
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("Digite o nome ");
			String nome = sc.next();
			if (nome.equals("0")) break;
			System.out.println("Digite a idade ");
			int idade = sc.nextInt();

		}

	}
}
