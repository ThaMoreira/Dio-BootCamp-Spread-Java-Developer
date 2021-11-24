package exemplo;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class exemploMap {

	public static void main(String[] args) {
		System.out.println("Crie um dicionário que relacione os modelos e seus respectivos consumos");
		Map<String, Double> carrosPopulares = new HashMap<>() { // armazena da forma aleatoria
			{

				put("Gol", 14.4);
				put("Uno", 15.6);
				put("Mobi", 16.1);
				put("Hb20", 14.5);
				put("Kwid", 15.6);
			}
		};
		System.out.println(carrosPopulares);
		System.out.println("Substitua o consumo do gol para 15,2 km/h");
		carrosPopulares.put("Gol", 15.2);
		System.out.println(carrosPopulares);

		System.out.println("Confira se tem tucson: " + carrosPopulares.containsKey("tucson"));

		System.out.println("Exiba o consumo do Uno: " + carrosPopulares.get("Uno"));
		System.out.println("Exiba o terceiro modelo adicionado: ");// nao da

		System.out.println("Exiba os modelos: " + carrosPopulares.keySet());

		System.out.println("Exiba os consumos: " + carrosPopulares.values());

		System.out.println("Exiba o mais economico e seu consumo: ");
		Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
		Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
		String modeloMaisEficiente = "";
		for (Map.Entry<String, Double> entry : entries) {
			if (entry.getValue().equals(consumoMaisEficiente)) {
				modeloMaisEficiente = entry.getKey();
				System.out
						.println("Modelo Mais Eficiente: " + modeloMaisEficiente + " Consumo: " + consumoMaisEficiente);

			}
		}

		System.out.println("Exiba o menos economico: ");
		Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
		String modeloMenosEficiente = "";
		for (Map.Entry<String, Double> entry : carrosPopulares.entrySet()) {
			if (entry.getValue().equals(consumoMenosEficiente)) {
				modeloMenosEficiente = entry.getKey();
				System.out.println("Modelo menos eficiente: " + modeloMenosEficiente + " " + consumoMenosEficiente);
			}
		}
		
		System.out.println("Exiba a soma dos consumos: ");
		Iterator<Double> iterator = carrosPopulares.values().iterator();
		Double soma = 0d;
		while(iterator.hasNext()) {
			soma+=iterator.next();
		}
		System.out.println(soma);
		
		System.out.println("Exima a média do consumo: " + soma/carrosPopulares.size());
		
		System.out.println("Remova os modelos com consumo igual a 15,6");
		Iterator<Double> iterator1 = carrosPopulares.values().iterator();
		while(iterator1.hasNext()) {
			if(iterator1.next().equals(15.6)) {
				iterator1.remove();
			}
		}
		System.out.println(carrosPopulares);
		
		System.out.println("Exiba os carros na ordem:");
		Map<String, Double> carrosPopulares1 = new LinkedHashMap<>() { 
			{
				put("Gol", 14.4);
				put("Uno", 15.6);
				put("Mobi", 16.1);
				put("Hb20", 14.5);
				put("Kwid", 15.6);
			}
		};
		System.out.println(carrosPopulares1);
		
		System.out.println("Exiba ordenando pelo modelo");
		Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1);
		System.out.println(carrosPopulares2);
		
		
		carrosPopulares.clear();
		System.out.println("Apague o conteudo: " + carrosPopulares );
				
		System.out.println("Verifique se esta vazio: "+ carrosPopulares.isEmpty());
	}
}
