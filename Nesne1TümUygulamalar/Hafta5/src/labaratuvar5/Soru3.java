package labaratuvar5;

import java.util.Random;

public class Soru3 {

	public static void main(String[] args) {
		
		int compValue=0;
		int userValue=0;
		int compGames=0;
		int userGames=0;
		int tiedGames=0;
		
		Random randValue= new Random();
		
		for (int round = 1; round <= 10; round++) {
			
			compValue=randValue.nextInt(6)+1;
			
			userValue=randValue.nextInt(6)+1;
			
			if (compValue != userValue) {
				if (compValue>userValue) {
					compGames++;
				}else {
					userGames++;
				}
			}else {
				tiedGames++;
			}
		}
		
		System.out.println("Bilgisayar....."+compGames);
		System.out.println("Kullan�c�......"+userGames);
		System.out.println("Berabere......."+tiedGames);
		
		if (compGames>userGames) {
			System.out.println("En �ok kazanan Bilgisayar!");
		}else if (compGames<userGames) {
			System.out.println("En �ok kazanan Kullan�c�!");
		} else {
			System.out.println("Ma� berabere bitti!");
		}
	}
}
