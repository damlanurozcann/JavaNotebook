package kararyap�lar�;

import java.util.Scanner;

public class Uygulama3 {

	public static void main(String[] args) {
		
		Scanner giri� = new Scanner(System.in);
		
		System.out.println("Haftan�n g�nleri i�in 1-7 aras� bir say� girin:");
		
		byte say�=giri�.nextByte();
		
		switch (say�) {
		case 1:
			System.out.println("Pazartesi");
			break;
		case 2:
			System.out.println("Sal�");
			break;
		case 3:
			System.out.println("�ar�amba");
			break;
		case 4:
			System.out.println("Per�embe");
			break;
		case 5:
			System.out.println("Cuma");
			break;
		case 6:
			System.out.println("Cumartesi");
			break;
		case 7:
			System.out.println("Pazar");
			break;
			
		default:
			System.out.println("Yanl�� giri� yapt�n�z...");
			break;
		}
		
		giri�.close();

	}
}
