package exemplo;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class OrdenacaoMap {

	public static void main(String[] args) {

		Map<String, Livro> meusLivros = new HashMap<>() {
			{

				put("Hawking, Stephen", new Livro("Uma breve historia do tempo", 256));
				put("Duhigg, Charles", new Livro("O poder do hábito", 408));
				put("Harari, Yuval Noah", new Livro("21 liçoes para o século 21", 432));

			}
		};

		System.out.println("------ Ordem aleatoria -----");
		for (Map.Entry<String, Livro> livro : meusLivros.entrySet()) {
			System.out.println(livro.getKey() + " --> " + livro.getValue().getNome());
		}

		System.out.println("------ Ordem de inserção -----");
		Map<String, Livro> meusLivros1 = new LinkedHashMap<>() {
			{

				put("Hawking, Stephen", new Livro("Uma breve historia do tempo", 256));
				put("Duhigg, Charles", new Livro("O poder do hábito", 408));
				put("Harari, Yuval Noah", new Livro("21 liçoes para o século 21", 432));

			}
		};
		for (Map.Entry<String, Livro> livro : meusLivros1.entrySet()) {
			System.out.println(livro.getKey() + " --> " + livro.getValue().getNome());
		}

		System.out.println("------ Ordem dos autores -----");
		Map<String, Livro> meusLivros2 = new TreeMap<>(meusLivros);
		for (Map.Entry<String, Livro> livro : meusLivros2.entrySet()) {
			System.out.println(livro.getKey() + " --> " + livro.getValue().getNome());
		}

		System.out.println("------ Ordem dos livros -----");
		Set<Map.Entry<String, Livro>> meuslivros3 = new TreeSet<>(new ComparatorNome());
		meuslivros3.addAll(meusLivros.entrySet());
		for (Map.Entry<String, Livro> livro : meuslivros3) {
			System.out.println(livro.getKey() + " --> " + livro.getValue().getNome());
		}
		
		System.out.println("------ Ordem numero de pagina -----");
		Set<Map.Entry<String, Livro>> meuslivros4 = new TreeSet<>(new ComparatorPagina());
		meuslivros4.addAll(meusLivros.entrySet());
		for (Map.Entry<String, Livro> livro : meuslivros4) {
			System.out.println(livro.getKey() + " --> " + livro.getValue().getNome());
		}
	}

}

class Livro {
	private String nome;
	private Integer paginas;

	public Livro(String nome, Integer paginas) {
		this.nome = nome;
		this.paginas = paginas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getPaginas() {
		return paginas;
	}

	public void setPaginas(Integer paginas) {
		this.paginas = paginas;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome, paginas);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livro other = (Livro) obj;
		return Objects.equals(nome, other.nome) && Objects.equals(paginas, other.paginas);
	}

	@Override
	public String toString() {
		return "Livros [nome=" + nome + ", paginas=" + paginas + "]";
	}

}

class ComparatorNome implements Comparator<Map.Entry<String, Livro>> {

	@Override
	public int compare(Entry<String, Livro> l1, Entry<String, Livro> l2) {
		return l1.getValue().getNome().compareTo(l2.getValue().getNome());
	}

}

class ComparatorPagina implements Comparator<Map.Entry<String, Livro>> {

	@Override
	public int compare(Entry<String, Livro> o1, Entry<String, Livro> o2) {
		return o1.getValue().getPaginas().compareTo(o2.getValue().getPaginas());
	}

}


