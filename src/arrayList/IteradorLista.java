package arrayList;

import java.util.ArrayList;
import java.util.Iterator;
public class IteradorLista {
	public static void main(String[] args) {
		ArrayList <String> elementos = new ArrayList<>();
		for (int i = 0; i<= 20; i++) {
			elementos.add("Elemento " + i);
		}
		Iterator <String> elementosIterator = elementos.iterator();
		System.out.print("[");
		while(elementosIterator.hasNext()) {
			String elemento = elementosIterator.next();
			if (elemento != elementos.getLast()) {
				System.out.print(elemento + ", ");
			} else System.out.println(elemento + "]");
			
		}
	}	
}
