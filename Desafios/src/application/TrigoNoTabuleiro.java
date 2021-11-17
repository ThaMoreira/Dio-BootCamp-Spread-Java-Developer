package application;

import java.util.Scanner;

public class TrigoNoTabuleiro {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long soma = 1 / 12000;
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			long x = sc.nextInt();
			soma = (long) (Math.pow(2, x) / 12000); // calculo da quantia de graos
			System.out.println(soma + " kg"); // calculos dos kilos
		}
		sc.close();

	}

}
