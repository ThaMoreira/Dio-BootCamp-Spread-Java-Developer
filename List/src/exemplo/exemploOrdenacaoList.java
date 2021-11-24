package exemplo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class exemploOrdenacaoList {

	public static void main(String[] args) {

		List<Gato> meuGatos = new ArrayList<>() {
			{
				add(new Gato("Jon", 18, "preto"));
				add(new Gato("Simba", 6, "tigrado"));
				add(new Gato("Jon", 12, "amarelo"));
			}
		};

		System.out.println("**ordem de insercao**");
		System.out.println(meuGatos);

		System.out.println("**ordem aleatoria**");
		Collections.shuffle(meuGatos);
		System.out.println(meuGatos);

		System.out.println("**ordem natural**");
		Collections.sort(meuGatos);
		System.out.println(meuGatos);
		
		System.out.println("**ordem idade**");
		//Collections.sort(meuGatos, new ComparatorIdade());
		meuGatos.sort(new ComparatorIdade());
		System.out.println(meuGatos);
		
		System.out.println("**ordem cor**");
		//Collections.sort(meuGatos, new ComparatorIdade());
		meuGatos.sort(new ComparatorCor());
		System.out.println(meuGatos);
		
		System.out.println("**ordem Nome/cor/idade**");
		//Collections.sort(meuGatos, new ComparatorNomeCorIdade());
		meuGatos.sort(new ComparatorNomeCorIdade());
		System.out.println(meuGatos);
	
	}

}

class Gato implements Comparable<Gato> {
	private String nome;
	private Integer idade;
	private String cor;

	public Gato(String nome, Integer idade, String cor) {
		this.nome = nome;
		this.idade = idade;
		this.cor = cor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	@Override
	public String toString() {
		return "[nome=" + nome + ", idade=" + idade + ", cor=" + cor + "]";
	}

	@Override
	public int compareTo(Gato gato) {
		return this.getNome().compareToIgnoreCase(gato.getNome());
	}

}

class ComparatorIdade implements Comparator<Gato>{

	@Override
	public int compare(Gato g1, Gato g2) {
		return Integer.compare(g1.getIdade(), g2.getIdade());
	}
	
}

class ComparatorCor implements Comparator<Gato>{

	@Override
	public int compare(Gato g1, Gato g2) {
		return g1.getCor().compareToIgnoreCase(g2.getCor());
	}
	
}

class ComparatorNomeCorIdade implements Comparator<Gato>{
	@Override
	public int compare(Gato g1, Gato g2) {
		int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
		if (nome!=0) return nome;
		
		int cor=g1.getCor().compareToIgnoreCase(g2.getCor());
		if (cor!=0) return cor;
		
		return Integer.compare(g1.getIdade(), g2.getIdade());
		
	}
	
}