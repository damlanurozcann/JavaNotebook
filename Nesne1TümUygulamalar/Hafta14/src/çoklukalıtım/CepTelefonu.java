package �oklukal�t�m;

public class CepTelefonu extends Foto�rafMakinesi implements Bilgisayar, VideoOynat�c�, HesapMakinesi {

	@Override
	public void hesapla() {
		
		System.out.println("Cep telefonu hesaplama yapt�...");

	}

	@Override
	public void videoOynat() {
		
		System.out.println("Cep telefonu video oynatt�...");

	}

	@Override
	public void oyunOyna() {
		
		System.out.println("Cep telefonu ile oyun oynand�...");

	}

	@Override
	public void interneteBa�lan() {
		
		System.out.println("Cep telefonu ile internete ba�land�...");

	}

	@Override
	public void fotoKaydet() {
		
		System.out.println("Cep telefonu foto�raf� kaydetti...");
		
	}

}
