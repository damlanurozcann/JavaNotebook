package ikiboyutludiziler;

import java.util.Random;

public class Uygulama1 {

	public static void main(String[] args) {
		
		// �ki boyutlu diziler tek boyutlu dizilerin �st �ste dizilmi� halidir.
		// veritipi[][] diziad�=new veritipi[sat�r say�s�][s�tun say�s�];
		
		// �rnek: int [][] ikiboyutlu= new int[4][5];
		// 4 sat�ri 5 s�tuna sahip iki boyutlu bir dizi tan�mlanm��t�r...
		
		//�ki boyutlu diziye 10 ile 30 aras�nda rasgele say�lar�n yerle�tirilmesi
		
		
		Random rasgelesay��retici=new Random();
		
		int [][] ikiboyutlu=new int[4][5];
		
		for (int i = 0; i < ikiboyutlu.length; i++) { //sat�r uzunlu�u
			for (int j = 0; j < ikiboyutlu[i].length; j++) {//her sat�rdaki dizi uzunlu�u
				ikiboyutlu[i][j]=rasgelesay��retici.nextInt(20)+10;
				System.out.print(ikiboyutlu[i][j]+"\t");
			}	
			System.out.println();
		}
	}

}
