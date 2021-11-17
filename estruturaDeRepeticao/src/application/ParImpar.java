package application;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("Digite a quantidade de numeros: ");
		n = sc.nextInt();
		int par = 0, impar = 0;

		do {
			System.out.print("Numero: ");
			int num = sc.nextInt();
			if (num % 2 == 0) {
				par++;
			} else {
				impar++;
			}
			n--;
		} while (n > 0);

		System.out.println("Pares: " + par);
		System.out.println("Impares: " + impar);

		sc.close();
	}

}
