package application;

public class Programm {

	public static void main(String[] args) {

		byte b1;
		short s1 = 1000;
		b1 = (byte) s1; // downcast (perde info)

		long l1;
		int i1 = 10;
		l1 = i1; // upcast

		double d1;
		float f1 = 10.56f;
		d1 = f1; // upcast

		float f2;
		double d2 = 1000.588999990000000;
		f2 = (float) d2; // downcast (perde info aqui)

		int i4;
		float f4 = 11.5697f;
		i4 = (int) f4; // downcast (trunca - retira os decimais)

		System.out.println("b1: "+ b1);
		System.out.println("s1: "+s1);
		System.out.println("l1: "+l1);
		System.out.println("i1: "+i1);
		System.out.println("d1: "+d1);
		System.out.println("f1: "+f1);
		System.out.println("f2: "+f2);
		System.out.println("d2: "+d2);
		System.out.println("i4: "+i4);
		System.out.println("f4: "+f4);

	}

}
