package labaratuvar4;

import java.util.Scanner;

public class Soru4 {

	public static void main(String[] args) {
		
		double speed;
		int maxHour;
		int period;
		
		Scanner giri� = new Scanner(System.in);
		
		System.out.println("Arac�n h�z�n� girin: ");
		speed=giri�.nextDouble();
		
		while (speed<0) {
			System.out.println("H�z i�in 0 veya daha b�y�k de�er girin : ");
			speed=giri�.nextDouble();
		}
		
		System.out.println("Arac�n hareket halinde oldu�u saat s�resini girin: ");
		maxHour=giri�.nextInt();
		
		while (maxHour<1) {
			System.out.println("Saat s�resi i�in 1 veya daha b�y�k de�er girin: ");
			maxHour=giri�.nextInt();
		}
		
		System.out.println("Saat\tGidilen Mesafe");
		System.out.println("----------------------------");
		
		period=1;
		
		while (period<=maxHour) {
			System.out.println(period+ "\t\t"+period*speed);
			period++;
		}

	}

}
