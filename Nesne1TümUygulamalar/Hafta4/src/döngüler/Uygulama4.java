package d�ng�ler;

import java.util.Scanner;

public class Uygulama4 {

	public static void main(String[] args) {
		
		Scanner giri� = new Scanner(System.in);
		
		int toplam=0;
		
		do {
			
			System.out.println("Eklenecek say�y� girin: ");
			int ekleneceksay�=giri�.nextInt();
			
			toplam +=ekleneceksay�;
			
			System.out.println("Toplam: "+toplam);
			
			
		} while (toplam<=100);
		
		System.out.println("Program sonland� toplam:" + toplam);
		giri�.close();
	}
}
