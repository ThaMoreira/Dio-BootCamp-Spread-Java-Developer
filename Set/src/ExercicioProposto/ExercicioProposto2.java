package ExercicioProposto;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

/*
Crie uma classe LinguagemFavorita que possua os atributos nome, anoDeCriacao e IDE.             ok
Em seguida, crie um conjunto com 3 linguagens e faça um programa que ordene esse conjunto por:
a) Ordem de inserção;                                                                           ok
b) Ordem natural(nome);		                                                                    ok																	
c) IDE;																							ok
d) Ano de criação e nome;																		ok
e) Nome, ano de criação e IDE;																	ok
Ao final, exiba as linguagens no console, um abaixo da outra.                                   ok
*/

public class ExercicioProposto2 {

	public static void main(String[] args) {

		Set<LinguagemFavorita> minhasLinguagensFavoritas = new HashSet<>() {
			{

				add(new LinguagemFavorita("Eclipse", 1991, "Java"));
				add(new LinguagemFavorita("InteliJ", 1996, "JavaS"));
				add(new LinguagemFavorita("Jdex", 1990, "JavaX"));

			}
		};
		for (LinguagemFavorita fav : minhasLinguagensFavoritas)
			System.out.println(fav.getNome() + " - " + fav.getAnoDeCriacao() + " - " + fav.getIde());

		System.out.println("--- Ordem de inserçao ---");
		Set<LinguagemFavorita> minhasLinguagensFavoritas2 = new LinkedHashSet<>() {
			{

				add(new LinguagemFavorita("Eclipse", 1991, "Java"));
				add(new LinguagemFavorita("InteliJ", 1996, "JavaS"));
				add(new LinguagemFavorita("Jdex", 1990, "JavaX"));
			}
		};
		for (LinguagemFavorita fav : minhasLinguagensFavoritas2)
			System.out.println(fav.getNome() + " - " + fav.getAnoDeCriacao() + " - " + fav.getIde());

		System.out.println("--- Ordem natural (nome) ---");
		Set<LinguagemFavorita> minhasLinguagensFavoritas3 = new TreeSet<>(new ComparatorNome());
		minhasLinguagensFavoritas3.addAll(minhasLinguagensFavoritas);
		for (LinguagemFavorita fav : minhasLinguagensFavoritas3)
			System.out.println(fav.getNome() + " - " + fav.getAnoDeCriacao() + " - " + fav.getIde());
		
		System.out.println("--- Ordem IDE ---");
		Set<LinguagemFavorita> minhasLinguagensFavoritas4 = new TreeSet<>(new ComparatorIde());
		minhasLinguagensFavoritas4.addAll(minhasLinguagensFavoritas);
		for (LinguagemFavorita fav : minhasLinguagensFavoritas4)
			System.out.println(fav.getNome() + " - " + fav.getAnoDeCriacao() + " - " + fav.getIde());
		
		System.out.println("--- Ordem Ano de criação ---");
		Set<LinguagemFavorita> minhasLinguagensFavoritas5 = new TreeSet<>(new ComparatorAnoDeCriacao());		
		minhasLinguagensFavoritas5.addAll(minhasLinguagensFavoritas);
		for(LinguagemFavorita fav : minhasLinguagensFavoritas5)
			System.out.println(fav.getNome() + " - " + fav.getAnoDeCriacao() + " - " + fav.getIde());

		System.out.println("--- Ordem Nome|AnoDeCriacao|IDE ---");
		Set<LinguagemFavorita> minhasLinguagensFavoritas6 = new TreeSet<>(new ComparatorNomeAnoDeCriacaoIde());		
		minhasLinguagensFavoritas6.addAll(minhasLinguagensFavoritas);
		for(LinguagemFavorita fav : minhasLinguagensFavoritas6)
			System.out.println(fav.getNome() + " - " + fav.getAnoDeCriacao() + " - " + fav.getIde());
		
	}
}

class LinguagemFavorita implements Comparable<LinguagemFavorita> {
	private String nome;
	private Integer anoDeCriacao;
	private String ide;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getAnoDeCriacao() {
		return anoDeCriacao;
	}

	public void setAnoDeCriacao(Integer anoDeCriacao) {
		this.anoDeCriacao = anoDeCriacao;
	}

	public String getIde() {
		return ide;
	}

	public void setIde(String ide) {
		this.ide = ide;
	}

	public LinguagemFavorita(String nome, Integer anoDeCriacao, String ide) {
		this.nome = nome;
		this.anoDeCriacao = anoDeCriacao;
		this.ide = ide;
	}

	@Override
	public int hashCode() {
		return Objects.hash(anoDeCriacao, ide, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LinguagemFavorita other = (LinguagemFavorita) obj;
		return Objects.equals(anoDeCriacao, other.anoDeCriacao) && Objects.equals(ide, other.ide)
				&& Objects.equals(nome, other.nome);
	}

	@Override
	public String toString() {
		return "[nome=" + nome + ", anoDeCriacao=" + anoDeCriacao + ", ide=" + ide + "]";
	}

	@Override
	public int compareTo(LinguagemFavorita fav) {
		return this.getNome().compareTo(fav.getNome());
	}

}

class ComparatorNome implements Comparator<LinguagemFavorita> {

	@Override
	public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
		int ling = l1.getNome().compareTo(l2.getNome());
		if (ling != 0)
			return ling;
		return l1.getAnoDeCriacao().compareTo(l2.getAnoDeCriacao());
	}

}

class ComparatorIde implements Comparator<LinguagemFavorita>{

	@Override
	public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
		int ide = l1.getIde().compareTo(l2.getIde());
		if(ide!=0) return ide;
		return l1.getAnoDeCriacao().compareTo(l2.getAnoDeCriacao());
	}
	
}


class ComparatorAnoDeCriacao implements Comparator<LinguagemFavorita>{

	@Override
	public int compare(LinguagemFavorita o1, LinguagemFavorita o2) {
		int ano = o1.getAnoDeCriacao().compareTo(o2.getAnoDeCriacao());
		if(ano!=0) return ano;
		return o1.getNome().compareTo(o2.getNome());
	}
	
}

class ComparatorNomeAnoDeCriacaoIde implements Comparator<LinguagemFavorita>{

	@Override
	public int compare(LinguagemFavorita o1, LinguagemFavorita o2) {
		int nome = o1.getNome().compareTo(o2.getNome());
		if(nome!=0) return nome;
		int ano = o1.getAnoDeCriacao().compareTo(o2.getAnoDeCriacao());
		if(ano!=0) return ano;
		return o1.getIde().compareTo(o2.getIde());
	}
	
}
