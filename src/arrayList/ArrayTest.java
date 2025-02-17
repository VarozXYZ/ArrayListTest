package arrayList;
import java.util.ArrayList;
public class ArrayTest {
	public static void main(String[] args) {
		ArrayList <String> coches = new ArrayList<String>();
		ArrayList <Integer> numeros = new ArrayList<Integer>();
		coches.add("Audi");
		coches.add("Porsche");
		coches.add("Seat");
		coches.set(2, "Mitsubishi");
		System.out.println(coches);
		System.out.println(coches.size());
		for(int i = 0; i < coches.size(); i++) {
			System.out.println(coches.get(i));
		}
		for(String i: coches) {
			System.out.println(i);
		}
		coches.remove(2);
		coches.clear();
		System.out.println(coches);
		
	}
}
