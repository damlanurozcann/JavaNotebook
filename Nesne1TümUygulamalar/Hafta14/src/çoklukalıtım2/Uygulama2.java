package �oklukal�t�m2;

public class Uygulama2 {

	public static void main(String[] args) {
		
		CepTelefonu ceptelefonu=new CepTelefonu();
		
		System.out.println("50 + 10 = "+ceptelefonu.toplamaYap(50, 10));
		System.out.println("50 - 10 = "+ceptelefonu.��karmaYap(50, 10));
		System.out.println("50 / 10 = "+ceptelefonu.b�lmeYap(50, 10));
		System.out.println("50 * 10 = "+ceptelefonu.�arpmaYap(50, 10));
		
		System.out.println();
		
		ceptelefonu.aramaYap();
		ceptelefonu.dosyaA�();
		ceptelefonu.dosyaD�zenle();
		ceptelefonu.dosyaKaydet();
		ceptelefonu.foto�raf�ek();
		ceptelefonu.mesajG�nder();
		ceptelefonu.video�ek();
		ceptelefonu.interneteBa�lan();
		

	}
}
