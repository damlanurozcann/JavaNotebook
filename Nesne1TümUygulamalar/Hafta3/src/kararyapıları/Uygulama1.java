package kararyap�lar�;

import java.util.Scanner;

public class Uygulama1 {

	public static void main(String[] args) {
		
		Scanner giri� = new Scanner(System.in);
		
		System.out.println("Bir not giriniz:");
		
		double not=giri�.nextDouble();
		
		if (not>=0 && not<=100) {
			System.out.println("Girilen not do�ru aral�kta...");
			
		} else {
			System.out.println("Girilen not do�ru aral�kta de�ildir... ");

		}
		giri�.close();

	}

}
