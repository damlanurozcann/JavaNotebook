package kararyap�lar�;

import java.util.Scanner;

public class Uygulama2 {

	public static void main(String[] args) {
		
		Scanner giri� = new Scanner(System.in);
		
		System.out.println("Kilonuzu kg cinsinden giriniz:");
		
		double kg=giri�.nextDouble();
		
		System.out.println("Boyunuzu metre cinsinden giriniz:");
		
		double boy=giri�.nextDouble();
		
		double bki=kg/(boy*boy); 
		
		if (bki<18.5) {
			System.out.println("Zay�f");
		}else if (bki>=18.5 && bki<=24.9) {
			System.out.println("Normal");
		}else if (bki>=25 && bki<=29.9) {
			System.out.println("Kilolu");
		}else {
			System.out.println("Obez");
		}
		
		giri�.close();

	}

}
