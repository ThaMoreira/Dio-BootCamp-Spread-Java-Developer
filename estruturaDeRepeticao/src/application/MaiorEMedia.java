package application;

import java.util.Scanner;

public class MaiorEMedia {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = 5;
		double soma=0, numero, media=0, maior=0;
		do {
			System.out.print("Numero: ");
			numero = sc.nextInt();
			soma += numero;
			if(numero > maior) {
				maior = numero;
			}
			x--;
		} while (x > 0);
		
		media=soma/5;
		System.out.println("Maior numero: " + maior);
		System.out.println("Média: "+ media);

		sc.close();
	}

}
