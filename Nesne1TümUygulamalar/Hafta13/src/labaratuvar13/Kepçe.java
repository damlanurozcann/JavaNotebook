package labaratuvar13;

public class Kep�e extends Ara� implements ��Makinesi {

	public Kep�e(String plaka, int motorserino) {
		super(plaka, motorserino);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void �al��(int saat) {
		
		System.out.println("Kep�e i� makinesi "+ saat+ " saat �al��t�...");

	}

	@Override
	public void ilerle() {
		// TODO Auto-generated method stub

	}

	@Override
	public void geriGit() {
		
		System.out.println("Kep�e geri gitti...");

	}

	@Override
	public void dur() {
		// TODO Auto-generated method stub

	}

	@Override
	public void ilerle(int km) {
		// TODO Auto-generated method stub

	}

}
