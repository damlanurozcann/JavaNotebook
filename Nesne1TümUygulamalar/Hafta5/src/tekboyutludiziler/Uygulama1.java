package tekboyutludiziler;

import java.util.Random;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Uygulama1 {

	public static void main(String[] args) {
		
		//veritipi[] diziad�=new veritipi[eleman say�s�]; 
		
		//�rnek: int[] dizi=new int[10]; 

		//Dizilerin veri tipi ne ise i�erisine o tipte de�i�ken koyulmal�d�r.
		//Farkl� veri tipindeki elemanlar�n dizi i�erisine aktar�lmas� �nlenmelidir.
		
		//Dizi olu�tururken statik atama kullanm�yorsak default olarak dizinin
		//i�in veri tipinin default de�eri ile dolar
		
		//�rne�in �rnekteki dizinin 10 eleman� 0 olarak doldurulur. 
		//dizinin ilk eleman�n�n indis de�eri 0 d�r.
		//�rnekteki dizinini ilk eleman� dizi[0]
		//Dizinin son eleman�na dizinin eleman say�s�-1 �eklinde ula��l�r
		//�rnekteki kodda dizi[9]
		
		Random rasgelesay��retici= new Random();
		
		int[] dizi=new int[10];
		
		int toplam=0;
		
		for (int i = 0; i < dizi.length; i++) {
			
			dizi[i]=rasgelesay��retici.nextInt(50)+50;   //nextInt(50) 0 ile 49 aras�nda say� �retiyor
			System.out.println((i+1)+".say�: "+dizi[i]);
			toplam+=dizi[i];
			
		}
		
		System.out.println("Dizinin elemanlar� toplam�: "+ toplam);
		System.out.println("Dizinin ortalamas�: "+ (double)toplam/dizi.length); //Casting i�lemi yap�ld�
			
	}
}
