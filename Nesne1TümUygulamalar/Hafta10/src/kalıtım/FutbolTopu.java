package kal�t�m;

import java.awt.Color;

public class FutbolTopu extends Top  {

	double havabas�nc�;
	
	public FutbolTopu(String hammadde, double �ap, Color renk, int elastikiyet) {
		super(hammadde, �ap, renk, elastikiyet);
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public String toString() { //Method Overriding. Metot Ezme. 
		return "FutbolTopu [havabas�nc�=" + havabas�nc� + ", hammadde=" 
			+ hammadde + ", �ap=" + �ap + ", renk=" + renk
				+ ", elastikiyet=" + elastikiyet + "]";
	}

	public void z�pla() {
		System.out.println("Futbol Topu z�plad�...");
	}
	
	public void yuvarlan() {
		System.out.println("Futbol Topu yuvarland�...");
	}
	
	public void gol() {
		System.out.println("Futbol topu gol oldu...");
	}
	
}
