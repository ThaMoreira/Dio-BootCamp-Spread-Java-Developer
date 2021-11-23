package exemplo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class exemploList {

	public static void main(String[] args) {

		List<Double> notas = new ArrayList<>();

		notas.add(7d);
		notas.add(8.5);
		notas.add(9.3);
		notas.add(5.0);
		notas.add(7.0);
		notas.add(0d);
		notas.add(3.6);
		System.out.println(notas);

		// qual a posicao da nota 5
		System.out.println(notas.indexOf(5d));
		// adicione nota 8 na posição 4
		notas.add(4, 8d);
		System.out.println(notas);
		// altera a nota 5 para 6
		notas.set(notas.indexOf(5d), 6.0);
		System.out.println(notas);
		// confira se nota 5 esta na lista
		System.out.println(notas.contains(5));

		// exiba notas na ordem que foram informadas
		// for(Double nota: notas) {
		// System.out.println(nota);
		// }

		// exiba a tereceira nota adicionada
		System.out.println(notas.get(2));

		// exiba a menor nota
		System.out.println(Collections.min(notas));

		// exiba a maior nota
		System.out.println(Collections.max(notas));

		// exiba a soma dos valores
		Iterator<Double> iterator = notas.iterator();
		double sum = 0d;
		while (iterator.hasNext()) {
			Double next = iterator.next();
			sum += next;
		}
		System.out.println(sum);

		// exiba a media
		System.out.println((sum / notas.size()));

		// remova a nota 0
		notas.remove(0d);
		System.out.println(notas);

		// remova nota na posiçao zero
		notas.remove(0);
		System.out.println(notas);

		// remova nota menor que 7
		Iterator<Double> iterator1 = notas.iterator();
		while (iterator1.hasNext()) {
			Double next = iterator1.next();
			if (next < 7)
				iterator1.remove();
		}
		System.out.println(notas);
		
		//apague a lista
		notas.clear();
		System.out.println(notas);
		
		//verifique que esta limpa
		System.out.println(notas.isEmpty());

	}

}
