package labaratuvar4;

import java.util.Scanner;

public class Soru1 {

	public static void main(String[] args) {
		
		int maxNum, num, total=0;
	
		Scanner giri� = new Scanner(System.in);
	
		System.out.println("S�f�rdan farkl� pozitif bir say� girin: ");
		maxNum=giri�.nextInt();
		
		while (maxNum<=0) {
			
			System.out.println("Ge�ersiz de�er. S�f�rdan farkl� pozitif bir say� girin: ");
			maxNum=giri�.nextInt();
		}
		
		num=1;
		
		while (num<=maxNum) {
			
			total +=num;
			num++;
		}
		
		System.out.println("1 ile "+ maxNum +" aras�ndaki t�m tam say�lar�n toplam� "+total+ " d�r.");
		
	}
}
