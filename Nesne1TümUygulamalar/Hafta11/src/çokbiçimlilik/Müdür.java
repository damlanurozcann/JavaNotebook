package �okbi�imlilik;

public class M�d�r extends Personel {

	public M�d�r(String adsoyad, double maa�, int sicilno, int ya�) {
		super(adsoyad, maa�, sicilno, ya�);
		// TODO Auto-generated constructor stub
	}
	
	public void �al��() { //Methot Overriding
		System.out.println("M�d�r �al��t�...");
	}

	@Override
	public String toString() {
		return "M�d�r [adsoyad=" + adsoyad + ", maa�=" + maa� 
				+ ", sicilno=" + sicilno + ", ya�=" + ya� + "]";
	} 
	
}
