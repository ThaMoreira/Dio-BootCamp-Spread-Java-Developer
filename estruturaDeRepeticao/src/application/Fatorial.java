package application;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int fat = 1;
		System.out.print("Digite um número: ");
		int x = sc.nextInt();
		for (int i = x; i >= 1; i--) {
			fat *= i;
		}
		System.out.println(x + "! = " + fat);
		sc.close();
	}

}
