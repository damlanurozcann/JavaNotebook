package sahiplik;

public class Uygulama4 {

	public static void main(String[] args) {
		
		Adres adres1=new Adres("�stanbul", "K���k�ekmece", "Kemalpa�a", 10);
		Personel personel=new Personel("Turgut Y�lmaz", 7500, 105, 50, adres1);
		Personel personel2=new Personel("Murat Kazan�", 10000, 106, 46);
		
		System.out.println(personel.adres.toString());
		System.out.println(personel.adres.il);
		
		//Personel s�n�f� adres s�n�f�na sahiptir.
		// Adres personel e sahip de�ildir. 
		// Aralar�nda sahiplik ili�kisi vard�r denir.

	}

}
