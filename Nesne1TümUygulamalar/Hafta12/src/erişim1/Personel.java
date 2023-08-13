package eri�im1;

public class Personel {
	
	public String adsoyad;
	private double maa�;
	protected int sicilno;
	int ya�; //default (packet)
	
	public Personel(String adsoyad, double maa�, int sicilno, int ya�) {
		super();
		this.adsoyad = adsoyad;
		this.maa� = maa�;
		this.sicilno = sicilno;
		this.ya� = ya�;
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
