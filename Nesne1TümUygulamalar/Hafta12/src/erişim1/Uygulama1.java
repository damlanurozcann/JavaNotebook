package eri�im1;

public class Uygulama1 {

	public static void main(String[] args) {
		
		//Paket i�i eri�im
		
		Personel personel1=new Personel("Murat Kazan�", 7000, 100, 35);
		
		//public --> Ye�il
		//protected --> Sar�
		//default --> Mavi
		//Private --> K�rm�z�
		//personel1 nesnesi public, protected ve default eri�ime sahip
		//�zelliklere eri�ebilir, fakat private olan maa� �zelli�ine eri�emez.
		
		System.out.println(personel1.toString());
		
	}
}
