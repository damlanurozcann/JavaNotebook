package operat�rler;

import java.util.Scanner;

public class Uygulama1 {

	public static void main(String[] args) {
		
		//(==, !=, <, >, <=, >=)
		
		Scanner giri� = new Scanner(System.in);
		
		System.out.println("Birinci Say�y� Girin:");
		double say�1=giri�.nextDouble();
	
		System.out.println("�kinici Say�y� Girin:");
		double say�2=giri�.nextDouble();
		
		System.out.println("Birinci say� ile ikinici say� e�itmi: "+(say�1==say�2));
		System.out.println("Birinci say� ikinici say�dan farkl� m�: "+(say�1!=say�2));
		System.out.println("Birinci say� ikinciden b�y�k m�: "+(say�1>say�2));
		System.out.println("Birinci say� ikinci say�dan k���k m�:"+(say�1<say�2));
		System.out.println("Birinci say� ikinciden b�y�k veya ikinciye e�it mi: "+(say�1>=say�2));
		System.out.println("Birinci say� ikinciden k���k veya ikiciye e�it mi: "+(say�1<=say�2));
		
		giri�.close();

	}

}
