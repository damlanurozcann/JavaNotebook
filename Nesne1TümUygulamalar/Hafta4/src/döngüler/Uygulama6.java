package d�ng�ler;

import java.util.Scanner;

public class Uygulama6 {

	public static void main(String[] args) {
		
		// �� i�e d�ng�ler
		
		/*
		   *
		   **
		   ***
		   ****
		   *****
		 */
		
		Scanner giri� = new Scanner(System.in);
		int sat�rsay�s�=giri�.nextInt();
		
		
		for (int i = 0; i < sat�rsay�s�; i++) {
			for (int j = 0; j < i+1 ; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		
	}
}
