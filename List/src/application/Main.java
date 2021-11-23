package application;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Carro> listCarros = new ArrayList<>();
		
		listCarros.add(new Carro("Ford"));
		listCarros.add(new Carro("Citroen"));
		listCarros.add(new Carro("Peugeot"));
		listCarros.add(new Carro("MiniCooper"));
		
		System.out.println(listCarros.contains(new Carro("Ford")));
		System.out.println(listCarros.get(2));
		
		System.out.println(listCarros.indexOf(new Carro("Citroen")));
		
		System.out.println(listCarros.remove(2));
		System.out.println(listCarros);

	}

}
