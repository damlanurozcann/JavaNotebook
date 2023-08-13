package �okbi�imlilik;

public class Memur extends Personel {

	public Memur(String adsoyad, double maa�, int sicilno, int ya�) {
		super(adsoyad, maa�, sicilno, ya�);
		// TODO Auto-generated constructor stub
	}
	
	public void �al��() { //Methot Overriding
		System.out.println("Memur �al��t�...");
	}
	
	public void �al��(int saat) { //Method Overloading
		System.out.println("Memur "+saat+" saat �al��t�...");
	}

	@Override
	public String toString() {
		return "Memur [adsoyad=" + adsoyad + ", maa�=" + maa� 
				+ ", sicilno=" + sicilno + ", ya�=" + ya� + "]";
	}
	
}
