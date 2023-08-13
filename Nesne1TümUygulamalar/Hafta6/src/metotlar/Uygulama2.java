package metotlar;

import java.util.Scanner;

public class Uygulama2 {

	public static void main(String[] args) {
		
		//Bir metot olu�turulup metoda bir say� g�nderelim.
		//Metot bize say�n�n asal olup olmad���n� s�ylesin.
		
		Scanner giri� = new Scanner(System.in);
		System.out.println("Bir say� giriniz: ");
		int say�=giri�.nextInt();
		
		if (asalM�(say�)) {
			System.out.println("Say� asald�r...");
		} else {
			System.out.println("Say� asal de�ildir...");	
		}
		giri�.close();

	}

	private static boolean asalM�(int asal) {
		
		for (int i = asal-1; i >= 2; i--) {
			
			if (asal%i==0) {
				return false;
			}
		}
		return true;
	}
}
