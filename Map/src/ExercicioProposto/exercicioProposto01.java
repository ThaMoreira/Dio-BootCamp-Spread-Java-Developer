package ExercicioProposto;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class exercicioProposto01 {

	public static void main(String[] args) {
		Map<String, Integer> populacao = new HashMap<>() {
			{
				put("PE", 9616621);
				put("AL", 3351543);
				put("CE", 9187103);
				put("RN", 3534265);

			}
		};

		System.out.println(populacao);
		populacao.put("RN", 3534165);
		System.out.println(populacao);
		System.out.println("Contem PB?: "+ populacao.containsKey("PB"));
		System.out.println("Adicionando...");
		populacao.put("PB", 4039277);
		System.out.println(populacao);
		System.out.println("A população de PE é: "+ populacao.get("PE"));
		
		Map<String, Integer> populacao1 = new LinkedHashMap<>() {
			{
				put("PE", 9616621);
				put("AL", 3351543);
				put("CE", 9187103);
				put("RN", 3534265);

			}
		};
		System.out.println(populacao1);
		
		Map<String, Integer> populacao2 = new TreeMap<>(populacao1); 
		System.out.println(populacao2);
		
		System.out.println("Exiba o estado com menor população: ");
		Integer menorPop = Collections.min(populacao.values());
		Set<Map.Entry<String, Integer>> entries = populacao.entrySet();
		String estadoMenosPopuloso = "";
		for (Map.Entry<String, Integer> entry : entries) {
			if (entry.getValue().equals(menorPop)) {
				estadoMenosPopuloso = entry.getKey();
				System.out
						.println("Estado menos populoso: " + estadoMenosPopuloso + " Pop.: " + menorPop);

			}
		}
		
		System.out.println("Exiba o estado com menor população: ");
		Integer maiorPop = Collections.max(populacao.values());
		Set<Map.Entry<String, Integer>> entri = populacao.entrySet();
		String estadoMaisPopuloso = "";
		for (Map.Entry<String, Integer> entry : entries) {
			if (entry.getValue().equals(maiorPop)) {
				estadoMaisPopuloso = entry.getKey();
				System.out
						.println("Estado mais populoso: " + estadoMaisPopuloso + " Pop.: " + maiorPop);

			}
		}
		Iterator<Integer> iterator = populacao.values().iterator();
		Integer soma=0;
		while(iterator.hasNext()) {
			soma+=iterator.next();
		}		
		System.out.println("A soma das populacoes é: " + soma);
		
		System.out.println("A media da populaçoa é: "+ soma/populacao.size());
		
		Iterator<Integer> iterator1 = populacao.values().iterator();
		while(iterator1.hasNext()) {
			if(iterator1.next()<(4000000)) {
				iterator1.remove();
			}
		}
		System.out.println(populacao);
		
		
		System.out.println("Apague o dicionario: ");
		populacao.clear();
		System.out.println(populacao);
		System.out.println("Está vazio: " + populacao.isEmpty());
		
		
	}
}
