package sahiplik;

public class Adres {
	
	String il, il�e, mahalle;
	int kap�no;
	
	public Adres(String il, String il�e, String mahalle, int kap�no) {
		super();
		this.il = il;
		this.il�e = il�e;
		this.mahalle = mahalle;
		this.kap�no = kap�no;
	}

	@Override
	public String toString() {
		return "Adres [il=" + il + ", il�e=" + il�e + 
				", mahalle=" + mahalle + ", kap�no=" + kap�no + "]";
	}
}
