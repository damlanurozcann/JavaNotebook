package labaratuvar4;

import java.util.Scanner;

public class Soru5�dev {

	public static void main(String[] args) {
		
		
		
		Scanner giri� = new Scanner(System.in);
		
		System.out.println("Sat�r Say�s�..: ");
		int sat�rsay�s�=giri�.nextInt();
		
		for (int i = 1; i <=sat�rsay�s�; i++) {
			for (int j = 1; j <= sat�rsay�s�-i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= (i*2-1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
