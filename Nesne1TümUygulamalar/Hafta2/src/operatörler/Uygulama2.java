package operat�rler;

import java.util.Scanner;

public class Uygulama2 {

	public static void main(String[] args) {
		
		Scanner giri� = new Scanner(System.in);
		
		System.out.println("Ba�lang� say�s�n� giriniz:");
		
		double say�=giri�.nextDouble();
		
		System.out.println(say� + " say�s�na ka� eklemek istersiniz:");
		
		double ekleneceksay�=giri�.nextDouble();
		
		say�+=ekleneceksay�;
		
		System.out.println("��lem sonucu:"+say�);
		
		System.out.println(say�+ " say�s�ndan ka� ��karmak istersiniz");
		
		double ��kar�lacaksay�=giri�.nextDouble();
		
		say�-=��kar�lacaksay�;
		
		System.out.println("i�lem sonucu:"+say�);
		
		System.out.println(say�+" say�s�n� ka� ile �arpmak istersiniz:");
		
		double �arp�lacaksay�=giri�.nextDouble();
		
		say�*=�arp�lacaksay�;
		
		System.out.println("��lem sonucu:"+say�);
		
		System.out.println(say�+" say�s�n� ka� ile b�lmek istersiniz:");
		
		double b�l�neceksay�=giri�.nextDouble();
		
		say�/=b�l�neceksay�;
		
		System.out.println("��lem sonucu:"+say�);
		
		giri�.close();

	}

}
