package labaratuvar6;

import java.util.Random;

import javax.swing.JOptionPane;

public class Soru3 {

	public static void main(String[] args) {
		
		int numEven=0; //�ift say�lar�n say�s�
		int numOdd=0; // tek say�lar�n say�s�
		
		Random randomValue= new Random();
		
		for (int i = 1; i <=100; i++) {
			
			if (isEven(randomValue.nextInt(i))) {
				numEven++;
			}else {
				numOdd++;
			}
		}
		
		JOptionPane.showMessageDialog(null, "Rasgele olu�turulmu� 100 say�dan "+
		               + numEven+"adedi �ift ve"+numOdd+" adedi tek say�d�r.");

	}

	private static boolean isEven(int num) {
			
		if ((num%2)==0) {
			return true;
		}
		return false;
	}

}
