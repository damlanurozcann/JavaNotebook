package labaratuvar7;

public class Personel {
	
	int sicilno;
	double maa�; 
	int ya�; 
	String adsoyad;
	
	public Personel() { //Default constructor
		
	}
		
	public Personel(int sicilno, double maa�, int ya�, String adsoyad) {
		super();
		this.sicilno = sicilno;
		this.maa� = maa�;
		this.ya� = ya�;
		this.adsoyad = adsoyad;
	}

	public void �al��() {
		System.out.println("Personel �al���yor...");
	}
	
	public void �al��(int mesai) {
		System.out.println("Personel "+mesai+" saat mesai yapacak...");
	}

	@Override
	public String toString() {
		return "Personel [sicilno=" + sicilno + ", maa�=" + maa� + ", ya�=" + ya� + 
				", adsoyad=" + adsoyad + "]";
	}
}
