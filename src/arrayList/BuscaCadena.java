package arrayList;
import java.util.ArrayList;
import java.util.Scanner;

public class BuscaCadena {
	public static void main(String[] args) {
		ArrayList<String> nombres = new ArrayList<String>();
		nombres.add("Andres");
		nombres.add("Carlos");
		nombres.add("Juanita");
		nombres.add("Pepe");
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Inserta el nombre a buscar");
			String buscar = sc.next();
			
			if (nombres.contains(buscar)) {
				System.out.println("Nombre encontrado!");
			} else System.out.println("Nombre no encontrado.");
		} while (true);
		
	}
}
