package operat�rler;

import java.util.Scanner;

public class Uygulama2 {

	public static void main(String[] args) {
		
		//(and &&, or ||, xor ^, not ! )
		
		Scanner giri� = new Scanner(System.in);
		
		System.out.println("0 ile 100 aras�nda bir not giriniz:");
		double not=giri�.nextDouble();
		
		//System.out.println("Girilen not do�ru aral�kta m�?:"+(not>=0 && not<=100));
		
		System.out.println("Girilen not do�ru aral�kta m�?:"+ !(not<0 || not>100));
		
		giri�.close();
		

	}

}
