package application;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {

		Queue<Carro> queueCarros = new LinkedList<>();
		
		queueCarros.add(new Carro("Ford"));
		queueCarros.add(new Carro("Citroen"));
		queueCarros.add(new Carro("MiniCooper"));
		
		System.out.println(queueCarros.add(new Carro("Peugeot")));
		System.out.println(queueCarros);
		
		System.out.println(queueCarros.offer(new Carro("Renault"))); // parecido com add, porem se nao add nao retorna erro retorna false
		System.out.println(queueCarros);
		
		System.out.println(queueCarros.peek()); //pega o primeiro da fila e nao remove
		System.out.println(queueCarros);
		
		System.out.println(queueCarros.poll());//pega o primeiro e remove
		System.out.println(queueCarros);
		
		System.out.println(queueCarros.isEmpty());
		System.out.println(queueCarros.size());

	}

}
