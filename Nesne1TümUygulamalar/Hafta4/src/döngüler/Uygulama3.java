package d�ng�ler;

import java.util.Scanner;

public class Uygulama3 {

	public static void main(String[] args) {
		
		
		Scanner giri� = new Scanner(System.in);
		System.out.println("Bir kelime giriniz: ");
		
		String kelime=giri�.next();
		
		while (!kelime.equalsIgnoreCase("bitti")) {
			
			System.out.println("Girilen kelimesi "+kelime.length()+" karekter i�ermektedir.");
			
			System.out.println("Bir kelime giriniz: ");
			kelime=giri�.next();
		}
	}
}
