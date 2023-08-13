package metotlar;

import java.util.Random;
import java.util.Scanner;

public class Uygulama3 {

	public static void main(String[] args) {
		// Kullan�c�dan bir adet k���k say� bir adet b�y�k say� al�n.
		//Metodumuz girilen bu say�lar aras�nda rasgele bir say� d�nd�rs�n.
		
		//�r: K���k� say�: 20
		//    B�y�k say�: 50
		//Metot 20 ile 50 aras�nda rasgele bir say� �retip bize d�nd�recek.
		
		Scanner giri� = new Scanner(System.in);
		
		System.out.println("K���k say�y� girin: ");
		int k���ksay�=giri�.nextInt();
		
		System.out.println("B�y�k say�y� girin: ");
		int b�y�ksay�=giri�.nextInt();
		
		if (b�y�ksay�>k���ksay�) {
			
			int rasgelesay�=rasgeleSay��ret(k���ksay�,b�y�ksay�);
			
			System.out.println("�retilen rasgele say�: "+rasgelesay�);
			
		} else {
			System.out.println("Hatal� giri�...");
		}
	}

	private static int rasgeleSay��ret(int k���ksay�, int b�y�ksay�) {
		
		Random rasgelesay��retici= new Random();

		return rasgelesay��retici.nextInt(b�y�ksay�-k���ksay�)+k���ksay�;
	}
}
