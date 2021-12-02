import java.util.Iterator;
import java.util.TreeSet;

public class exercicioFinaal {

    public static void main(String[] args) {
        TreeSet<Integer> numeros = new TreeSet<>();
        numeros.add(3);
        numeros.add(88);
        numeros.add(20);
        numeros.add(44);
        numeros.add(3);
        System.out.println(numeros);
        Iterator<Integer> iterator = numeros.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        numeros.pollFirst(); //remover um numero
        System.out.println(numeros);
        numeros.add(23);
        System.out.println(numeros);
        System.out.println(numeros.size());
        System.out.println(numeros.isEmpty());


    }
}
