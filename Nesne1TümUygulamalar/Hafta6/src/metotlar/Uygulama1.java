package metotlar;

public class Uygulama1 {

	public static void main(String[] args) {
		
		/*eri�im_belirleyici (static) d�n��_tipi(veritipi parametre(ler)){
			
			Metot G�vdesi (Method Body)
		}*/
		
		//merhabaMetodu();
		
		merhabaMetodu("ali");
		
	}

	private static void merhabaMetodu(String isim) {
		
		System.out.println("Merhaba ben: "+ isim);
		
		//metotlar�n eri�im belirleyicileri: public, private, protected, default(package)
		//Static bir metotdan ancak static bir metot �a�r�labilir
		//Main metotdan �a�r�lacak her metot staric olmak zorundad�r.
		//��nk� main metodu static dir.
		
	}
	
	/*public static void merhabaMetodu() {
		
		System.out.println("Merhaba ben metot...");
	}*/ 

}
