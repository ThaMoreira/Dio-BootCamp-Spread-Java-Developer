package application;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {

		Set<Carro> hashSetCarros = new HashSet<>();
		
		hashSetCarros.add(new Carro("Citroen"));
		hashSetCarros.add(new Carro("Peugeot"));
		hashSetCarros.add(new Carro("MiniCooper"));
		hashSetCarros.add(new Carro("Ford"));
		hashSetCarros.add(new Carro("Zip"));
		hashSetCarros.add(new Carro("Alfa Romeo"));
		
		System.out.println(hashSetCarros); //nao segue ordem de adicao
		
		Set<Carro> treeSetCarro = new TreeSet<>();
		treeSetCarro.add(new Carro("Citroen"));
		treeSetCarro.add(new Carro("Peugeot"));
		treeSetCarro.add(new Carro("MiniCooper"));
		treeSetCarro.add(new Carro("Ford"));
		treeSetCarro.add(new Carro("Zip"));
		treeSetCarro.add(new Carro("Alfa Romeo"));
		
		System.out.println(treeSetCarro);
		
		
		

	}

}
