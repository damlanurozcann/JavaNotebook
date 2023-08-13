package metotlar;

import java.util.Scanner;

public class Uygulama4 {

	public static void main(String[] args) {
		
		// Kullan�c� bize dairenin yar��ap�n� versin. Biz de dairenin 
		// alan�n� ve hacmini hesaplatal�m.
		
		Scanner giri� = new Scanner(System.in);
		
		System.out.println("Yar��ap� giriniz (cm): ");
		double yar��ap=giri�.nextDouble();
		
		alanHesapla(yar��ap);
		
		�evreHesapla(yar��ap);
		
	}

	private static void �evreHesapla(double yar��ap) {
		System.out.println("Dairenin �evresi: "+Math.PI*2*yar��ap + " cm");
	}

	private static void alanHesapla(double yar��ap) {
		System.out.println("Dairenin alan�: "+Math.PI*Math.pow(yar��ap, 2)+" cm2");
	}

}
