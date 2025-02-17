package arrayList;
import java.util.ArrayList;
import java.util.Collections;
public class ListaEjemplosInteger {
	public static void main(String[] args) {
		ArrayList <Integer> numeros = new ArrayList<Integer>();
		numeros.add(8);
		numeros.add(7);
		numeros.add(21);
		numeros.add(1);
		Collections.sort(numeros);
		for (int i: numeros) {
			System.out.println(i);
		}
		Collections.reverse(numeros);
		for (int i: numeros) {
			System.out.println(i);
		}
	}
}
