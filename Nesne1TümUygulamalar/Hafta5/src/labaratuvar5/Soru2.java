package labaratuvar5;

import java.util.Random;
import java.util.Scanner;

public class Soru2 {

	public static void main(String[] args) {
		
		final int MAX_NUMBER=10;
		
		int guess; //Kullan�c�n�n tahminini tutacak
		int randNum; //rasgele bir say� tutacak
		
		Scanner giri� = new Scanner(System.in);
		
		Random rand= new Random();
		
		randNum = rand.nextInt(MAX_NUMBER);
		
		System.out.println("(0-9) aras�nda bir say� d���n�yorum.");
		System.out.print("Ne oldu�unu tahmin et: ");
		guess=giri�.nextInt();
		
		while (guess!=randNum) {
			
			if (guess<randNum) {
				System.out.println("Hay�r, bu �ok d���k.");
			}else if (guess>randNum) {
				System.out.println("�zg�n�m, bu �ok y�ksek.");
			}
			
			System.out.print("Tekrar tahmin et: ");
			guess=giri�.nextInt();
		}
		
		System.out.println("Tebrikler! Tahmin ettin!");
		System.out.println(randNum+ " say�s�n� d���n�yordum.");
		
	}
}
