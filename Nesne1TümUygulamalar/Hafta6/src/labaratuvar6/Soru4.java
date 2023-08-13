package labaratuvar6;

import java.util.Scanner;

public class Soru4 {

	public static void main(String[] args)
	   {
	      String input;        // Klavye giri�ini tutmak i�in
	      double speed;        // arac�n h�z�
	      int maxHours;        // Seyahat edilen maksimum saat say�s�
	      int period;          // Zaman dilimlerini saymak i�in
	             
	      // Klavye giri�i i�in bir Taray�c� nesnesi olu�turun.
	      Scanner keyboard = new Scanner(System.in);

	      // H�z� al.
	      System.out.print("Arac�n h�z�n� girin: ");
	      speed = keyboard.nextDouble();
	      
	      // H�z� do�rulay�n.
	      while (speed < 0)
	      {
	         System.out.print("H�z i�in 0 veya daha b�y�k girin: ");
	         speed = keyboard.nextDouble();
	      }
	      
	      // Get the number of hours.
	      System.out.print("Arac�n hareket halinde oldu�u saat say�s�n� girin: ");
	      maxHours = keyboard.nextInt();

	      // Saatleri do�rulay�n.
	      while (maxHours < 1)
	      {
	         System.out.print("Saatler i�in 1 veya daha b�y�k girin: ");
	         maxHours = keyboard.nextInt();

	      }
	      
	      // Tablo ba�l���n� g�r�nt�leyin.
	      System.out.println("Saat\tMesafe Gezilen mesafe");
	      System.out.println("----------------------------------");
	      
	      // Mesafe tablosunu g�r�nt�leyin.
	      period = 1;
	      while (period <= maxHours)
	      {
	         // Bu s�re i�in mesafeyi g�r�nt�leyin.
	         System.out.println(period + "\t\t" + distance(speed, period));
	         
	         // Zaman periyodunu art�r
	         period++;
	      }
	   }
	   
	   /**
	      Mesafe metodu, bir arac�n kat etti�i mesafeyi, 
	      h�z�yla kat etti�i s�reyi �arparak hesaplar.
	      @param speed Arac�n h�z�.
	      @param time Arac�n seyahat etti�i s�re.
	      @return Arac�n kat etti�i mesafe.
	   */
	   
	   public static double distance(double speed, double time)
	   {
	      return speed * time;
	   }
}
