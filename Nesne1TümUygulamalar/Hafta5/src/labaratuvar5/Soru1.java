package labaratuvar5;

import java.util.Scanner;

public class Soru1 {

	public static void main(String[] args) {
		
		int number;
		
		Scanner giri� = new Scanner(System.in);
		
		System.out.println("1-15 arl���nda bir tamsay� girin: ");
		number=giri�.nextInt();
		
		while (number<1 || number>15) {
			System.out.println("�zg�n�m, bu ge�ersiz bir say�."); 
			System.out.println("1-15 arl���nda bir tamsay� girin: ");
			number=giri�.nextInt();
		}
		
		for (int row = 0; row < number; row++) {
			
			for (int column = 0; column < number; column++) {
				
				System.out.print("X");
			}
			
			System.out.println();
		}
	}
}
