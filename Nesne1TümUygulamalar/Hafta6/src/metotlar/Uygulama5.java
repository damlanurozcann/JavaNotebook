package metotlar;

import java.util.Random;
import java.util.Scanner;

public class Uygulama5 {

	public static void main(String[] args) {
	
		//Kullan�c�dan dizinin eleman say�s�n� ve i�indeki en k���k say�y�,
		// en b�y�k say�y� girmesini isteyelim. 
		
		Scanner giri� = new Scanner(System.in);
		
		System.out.println("Dizinin eleman say�s�n� girin: ");
		int elemansay�s�=giri�.nextInt();
		
		System.out.println("Dizinin en k���k olas� say�s�n� girin: ");
		int ek=giri�.nextInt();
		
		System.out.println("Dizinin en b�y�k olas� say�s�n� girin: ");
		int eb=giri�.nextInt();
		
		int [] dizi=diziOlu�tur(ek, eb, elemansay�s�);
		
		for (int i = 0; i < dizi.length; i++) {
			System.out.print(dizi[i]+"\t");
		}
		giri�.close();
	}

	private static int[] diziOlu�tur(int ek, int eb, int elemansay�s�) {
		
		Random rasgelesay��retici= new Random();
		
		int[] dizi= new int[elemansay�s�];
		
		for (int i = 0; i < dizi.length; i++) {
			dizi[i]=rasgelesay��retici.nextInt(eb-ek)+ek;
		}
		return dizi;
	}
	
	
	
}
