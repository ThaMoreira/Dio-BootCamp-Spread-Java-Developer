package application;

public class Program {

	public static void main(String[] args) {
		
		/* Programa para treinar declaração de tipos de daos */
		
		byte b1 = 10;
		byte b2 = 20;
		
		short s1 = 20000;
		//short s2 = 40000; ultrapassa o limite
		
		//int i1 = -10000000000; ultrapassa limite inferior
		int i2 = 28500;
		
		//long l1 = 20040050000000000; Precisa do L no final
		long l2 = 20040050000000000L;
		
		// float f1 = 4.5; Precisa do f no final
		float f2 = 4.5f;
		
		double d1 = 85.69;
		double d2 = 85.69d; //pode usar o d ou não no final
		
		char c1 = 'c';
		//char c2 = 'c2'; so pode usar um caractere
		
		String st1 = "Fulano";
		String st2 = "teste de dar espaço";
		
		boolean bol1 = true;
		boolean bol2 = false;
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(s1);
		System.out.println(i2);
		System.out.println(l2);
		System.out.println(f2);
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(c1);
		System.out.println(st1);
		System.out.println(st2);
		System.out.println(bol1);
		System.out.println(bol2);

	}

}
