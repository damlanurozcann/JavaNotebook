package d�ng�ler;

import java.util.Scanner;

public class Uygulama2 {

	public static void main(String[] args) {
		
		Scanner giri� = new Scanner(System.in);
		
		System.out.println("Ba�lang�� say�s�n� giriniz: ");
		int ba�lang��say�s�=giri�.nextInt();
		
		System.out.println("Biti� say�s�n� giriniz: ");
		int biti�say�s�=giri�.nextInt();
		
		if (ba�lang��say�s�<biti�say�s�) {
			
			for (int i = ba�lang��say�s�; i <=biti�say�s�; i++) {
				System.out.println(i);
			}
		} else {
			System.out.println("Biti� say�s� ba�lang�� say�s�ndan b�y�k olmal�d�r...");
		}
	}
}
