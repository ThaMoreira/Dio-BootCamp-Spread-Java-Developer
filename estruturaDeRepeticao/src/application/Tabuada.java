package application;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int mult = 0;
		System.out.print("Digite um número: ");
		int x = sc.nextInt();
		System.out.println("Tabuada do " + x);
		for (int i = 1; i < 11; i++) {
			mult = x * i;
			System.out.println(x + " x " + i + " = " + mult);
		}

		sc.close();
	}

}
