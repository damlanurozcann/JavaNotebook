package soyutlama;

public abstract class Bilgisayar {
	
	String i�letimsistemi;

	public Bilgisayar(String i�letimsistemi) {
		super();
		this.i�letimsistemi = i�letimsistemi;
	}
	
	public abstract void videoOynat();
	
	public abstract void oyunOynat();
	
	public abstract void interneteBa�lan();
	


}
