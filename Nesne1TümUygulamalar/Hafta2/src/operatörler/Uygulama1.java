package operat�rler;

import java.util.Scanner;

public class Uygulama1 {

	public static void main(String[] args) {
		
		Scanner giri� = new Scanner(System.in); 
		
		System.out.println("Birinci say�y� giriniz:");
		
		double say�1=giri�.nextDouble();
		
		System.out.println("�kinci say�y� giriniz:");
		
		double say�2=giri�.nextDouble();
		
		System.out.println("Say�lar�n toplam�: "+(say�1+say�2)+" say�s�");
		
		System.out.println("Say�lar�n fark�: "+(say�1-say�2));
		
		System.out.println("Say�lar�n �arp�m�: "+say�1*say�2);
		
		System.out.println("Say�lar�n b�l�m�: "+say�1/say�2);
		
		System.out.println("Say�lar�n modu: "+say�1%say�2);
		
		giri�.close();
		

	}

}
