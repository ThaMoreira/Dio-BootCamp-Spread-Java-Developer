package exemplos;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class exemploSet {

	public static void main(String[] args) {
		
		System.out.println("Crie um conjunto e adicone notas");
		Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 3.6, 9.3,5d,7d,0d));
		
		System.out.println(notas.toString());
		
		//System.out.println("exiba a posição da nota 5");
		// nao consigo travalhar com posicao (indexOf)
		
		//System.out.println("Adicione na lista a nota 8 na pos 4");
		// nao consigo trabalhar com posicao
		
		//System.out.println("Substitua nota 5 po 6 ");
		//nao tenho como substituir
		
		System.out.println("Confira se a nota 5 esta no conjunto");
		System.out.println(notas.contains(5d));
		
		//System.out.println("exiba a terceira nota");
		//nao consigo pois nao tenho get
		
		System.out.println("exiba a menor nota");
		System.out.println(Collections.min(notas));
		
		System.out.println("exiba a maior nota");
		System.out.println(Collections.max(notas));
		
		System.out.println("exiba a soma");
		Iterator<Double> iterator = notas.iterator(); //chamei o iterator
		double soma=0;
		while(iterator.hasNext()) {
			double next = iterator.next();
			soma+=next;
		}
		System.out.println("soma: "+ soma);
		
		System.out.println("exiba a media: " + soma/notas.size() );
		
		System.out.println("remova a nota 0: "+ notas.remove(0d) + notas);
		
		//System.out.println("remova nota na posicao 0");
		//nao tenho como trabalhar com indice
		
		System.out.println("remova nota menor que 7");
		Iterator<Double> iterator1= notas.iterator();
		while(iterator1.hasNext()) {
			double next = iterator1.next();
			if(next<7) iterator1.remove();
		}
		System.out.println(notas);
		
		System.out.println("Exiba as notas na ordem de informacao");
		//para informar em ordem tenho que usar treeSet
		Set<Double> notas2 = new LinkedHashSet<>();
		notas2.add(7d);
		notas2.add(8.5);
		notas2.add(3.6);
		notas2.add(9.3);
		notas2.add(5d);
		notas2.add(7d);
		notas2.add(0d);
		System.out.println(notas2);
		
		System.out.println("Exiba nota na ordem crescente");
		Set<Double> notas3 = new TreeSet<>(notas2);
		System.out.println(notas3);
		
		System.out.println("Apague todos o conjunto");
		notas.clear();
		System.out.println(notas);
		
		System.out.println("veja se apagou: " + notas.isEmpty());
		
	}

}
