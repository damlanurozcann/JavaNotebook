package s�n�fvenesne;

import java.awt.Color;

public class Top {
	
	double �ap;
	int elastikiyet;
	Color renk;
	String hammadde;
	
	//Yap�land�r�c� metotlar (Constructor methods) 
	
    public Top() {//Default Constructor
		
	}

	public Top(double �ap, int elastikiyet, Color renk, String hammadde) {
		super();
		this.�ap = �ap;
		this.elastikiyet = elastikiyet;
		this.renk = renk;
		this.hammadde = hammadde;
	}
	
	//Bir s�n�f�n i�erisinde bir metoton ayn� isimle birden fazla tekrarlanmas�na
	//method overloading (metot a��r� y�kleme) denir.
	//E�er a��r� y�klenen metot yap�land�r�c� metot ise buna constructor overloading denir.
	//Yap�land�r�c�n�n a��r� y�klenmesi denir.

	public void z�pla() {
		System.out.println("Top z�plad�...");
	}	
	
	public void z�pla(int metre) {//Method overloading
		System.out.println("Top "+metre+" metre z�plad�...");
	}
	
	public void yuvarlan() {
		System.out.println("Top yuvarland�...");
	}

	@Override
	public String toString() {
		return "Top [�ap=" + �ap + ", elastikiyet=" + elastikiyet + 
				", renk=" + renk + ", hammadde=" + hammadde + "]";
	}
}
