package application;

import java.util.Scanner;

public class Nota {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int nota;
		System.out.print("Digite uma nota: ");
		nota = sc.nextInt();
		while (nota < 0 || nota > 10) {
			System.out.print("Nota inválida! Digite novamente: ");
			nota = sc.nextInt();
		}
		sc.close();
	}

}
