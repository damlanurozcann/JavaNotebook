package d�ng�ler;

import java.util.Scanner;

public class Uygulama7 {

	public static void main(String[] args) {
		
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
			
			for (int j = 0; j < sat�rsay�s�; j++) {
				
				if (i+j>=sat�rsay�s�-1) {
					System.out.print("*");
				} else {
					System.out.print(" ");	
				}
			}
			System.out.println();
		}
		
	}

}
