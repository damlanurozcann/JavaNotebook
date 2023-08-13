package sarmalama;

public class Personel {
	
	String adsoyad;
	private double maa�;
	int sicilno;
	int ya�;
	
	public Personel(String adsoyad, double maa�, int sicilno, int ya�) {
		super();
		this.adsoyad = adsoyad;
		this.maa� = maa�;
		this.sicilno = sicilno;
		this.ya� = ya�;
	}
	
	
	public double getMaa�() {
		return maa�;
	}

	public void setMaa�(double maa�) {
		
		if (maa�>=2200 && maa�<=10000) {
			this.maa� = maa�;
		} else {
			System.out.println("Hatal� maa� belirleme i�leme yap�ld�...");
		}
		
	}

	public void �al��() {
		System.out.println("Personel �al��t�...");
	}

	@Override
	public String toString() {
		return "Personel [adsoyad=" + adsoyad + ", maa�=" + maa� 
				+ ", sicilno=" + sicilno + ", ya�=" + ya� + "]";
	}
	
	public void izinHakk�n�Kullan(int g�n) {
		System.out.println("Personel "+g�n+" g�n izin kulland�...");
	}
}
