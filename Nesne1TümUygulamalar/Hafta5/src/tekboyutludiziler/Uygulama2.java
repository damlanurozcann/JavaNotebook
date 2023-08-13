package tekboyutludiziler;

import java.util.Arrays;
import java.util.Random;

public class Uygulama2 {

	public static void main(String[] args) {
		
		// Rasgele say� ile doldurulmu� dizinin en b�y��� 
		// en k�����n�n bulunmas�
		
		Random rasgelesay��retici= new Random();
		
		int[] dizi=new int[10];
		
		for (int i = 0; i < dizi.length; i++) {
			
			dizi[i]=rasgelesay��retici.nextInt(50)+50;   //nextInt(50) 0 ile 49 aras�nda say� �retiyor
			System.out.println((i+1)+".say�: "+dizi[i]);
		
		}
		
		int ek=dizi[0];
		int eb=dizi[0];
		
		for (int i = 1; i < dizi.length; i++) {
			
			if (dizi[i]<ek) {
				ek=dizi[i];
			}
			if (dizi[i]>eb) {
				eb=dizi[i];
			}
		}
		
		System.out.println("Dizinin en k���k eleman�:"+ek);
		System.out.println("Dizinin en b�y�k eleman�:"+eb);
		
		Arrays.sort(dizi);
		
		for (int i = 0; i < dizi.length; i++) {
			System.out.println(dizi[i]); 
		}
		
		int[] tersdizi=new int[10];
		
		for (int i = 0; i < tersdizi.length; i++) {
			tersdizi[i]=dizi[9-i];
		}
		
		System.out.println("------------------------");
		for (int i = 0; i < tersdizi.length; i++) {
			System.out.println(tersdizi[i]);
		}
		
		
	}
}
