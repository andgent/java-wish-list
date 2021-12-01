import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> lista;
		lista = new ArrayList<String>();
		
		String s = "s";
		String answer = "s";
		while (s.equals(answer)) {
			System.out.println("Aggiungi elemento alla lista dei desideri: ");
			lista.add(scanner.nextLine());
			System.out.println("Aggiunto elemento");
			System.out.println("La tua lista contiene " + lista.size() + " elemento/i");
			System.out.println("Continuare? (s/n): ");
			answer = scanner.nextLine();
		}
		
		if (!answer.equals(s)) {
		System.out.println("La tua lista contiene questi elementi: ");
		System.out.print(lista);
		}
	}
}

