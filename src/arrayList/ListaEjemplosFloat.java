package arrayList;

import java.util.ArrayList;

public class ListaEjemplosFloat {
	public static void main(String[] args) {
		ArrayList <Float> floats = new ArrayList<Float>();
		floats.add(1.4f);
		floats.add(6.8f);
		floats.add(22.5f);
		floats.add(0.0333f);
		float suma = 0;
		for (float i: floats) {
			suma+=i;
		}
		System.out.println(suma);
		/*for (int i = 0; i < floats.size(); i++) {
			suma+=floats.get(i);
		}*/
		int[] numeros = new int[3];
		numeros[0] = 2;
		numeros[1] = 2;
		numeros[2] = 3;
		int sumaInt = 0;
		for (int i: numeros) {
			sumaInt+=i;
		}
		System.out.println(sumaInt);
	}
}
