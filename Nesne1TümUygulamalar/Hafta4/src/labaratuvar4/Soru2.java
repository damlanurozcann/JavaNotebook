package labaratuvar4;

import java.util.Scanner;

public class Soru2 {

	public static void main(String[] args) {
		
		int num, largest, smallest;
		
		Scanner giri� = new Scanner(System.in);
		
		System.out.println("Bir tamsay� girin veya ��kmak i�in -99 :");
		num=giri�.nextInt();
		
		largest=num;
		smallest=num;
		
		while (num!=-99) {
			
			System.out.println("Bir tamsay� girin veya ��kmak i�in -99 :");
			num=giri�.nextInt();
			
			if (num!=-99 && num>largest) {
				largest=num;
			}
			
			if (num!=-99 && num<smallest) {
				smallest=num;
			}
			
		}
		
		if (largest==-99) {
			System.out.println("Herhangi bir say� girmediniz...  ");
		} else {
			System.out.println("En b�y�k: "+largest);
			System.out.println("En k���k: "+smallest);
		}
	}
}
