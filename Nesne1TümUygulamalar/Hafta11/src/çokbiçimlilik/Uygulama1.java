package �okbi�imlilik;

public class Uygulama1 {

	public static void main(String[] args) {
		
		Personel personel1=new Personel("S�leyman ��nar", 5000, 101, 40);
		Personel personel2=new ��retmen("Murat Kazan�", 7000, 102, 38);
		System.out.println(personel1.toString());
		System.out.println("---------------------------");
		System.out.println(personel2.toString());
		System.out.println("---------------------------");
		
		//personel2 nesnesi �u ana kadar bir personel nesnesidir.
		//ancak ��retmeni refarans g�sterdi�i i�in override edilen 
		//metotlar i�in referans g�sterildi�i alt s�n�ftaki metodu
		//kullanmay� tercih eder.
		
		
		��retmen yeni��retmen=(��retmen) personel2; // A�a�� �evrim (Down casting)
		System.out.println("Yeni ��retmenin �zellikleri-------------------------");
		System.out.println(yeni��retmen.toString());
		yeni��retmen.dersVer("Web Programlama");
		System.out.println("---------------------------");
		
		Personel yenipersonel=yeni��retmen; //Yukar� �evrim (Up casting)
		System.out.println(yenipersonel.toString());
		
		yenipersonel.izinHakk�n�Kullan(10);
		

	}

}
