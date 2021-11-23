package application;

import java.util.Stack;

public class Main {

	public static void main(String[] args) {

		Stack<Carro> stackCarros= new Stack<>();
		stackCarros.push(new Carro("Ford"));
		stackCarros.push(new Carro("Citroen"));
		stackCarros.push(new Carro("MiniCoopper"));
		
		System.out.println(stackCarros);
		System.out.println(stackCarros.pop()); //retira da pilha
		System.out.println(stackCarros);
		
		System.out.println(stackCarros.peek()); //nao retira da pilha
		System.out.println(stackCarros);
		
		System.out.println(stackCarros.empty()); //diz se esta vazia
		

	}

}
