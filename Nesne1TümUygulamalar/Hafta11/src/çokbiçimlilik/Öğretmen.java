package �okbi�imlilik;

public class ��retmen extends Personel {

	String bran�;
	
	public ��retmen(String adsoyad, double maa�, int sicilno, int ya�) {
		super(adsoyad, maa�, sicilno, ya�);
		// TODO Auto-generated constructor stub
	}
	
	
	public void �al��() {
		System.out.println("��retmen �al��t�...");
	}


	@Override
	public String toString() {
		return "��retmen [bran�=" + bran� + ", adsoyad=" + adsoyad + 
				", maa�=" + maa� + ", sicilno=" + sicilno
				+ ", ya�=" + ya� + "]";
	}
	
	public void dersVer(String bran�) {
		System.out.println("��retmen "+bran�+ " dersi verdi...");
	}

}
