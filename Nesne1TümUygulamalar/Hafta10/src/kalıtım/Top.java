package kal�t�m;

import java.awt.Color;

public class Top {
	
	String hammadde;
	double �ap;
	Color renk;
	int elastikiyet;
	
	public Top(String hammadde, double �ap, Color renk, int elastikiyet) {
		this.hammadde = hammadde;
		this.�ap = �ap;
		this.renk = renk;
		this.elastikiyet = elastikiyet;
	}

	@Override
	public String toString() {
		return "Top [hammadde=" + hammadde + ", �ap=" + �ap + ", renk=" + 
				renk + ", elastikiyet=" + elastikiyet + "]";
	}
	
	public void z�pla() {
		System.out.println("Top z�plad�...");
	}
	
	public void yuvarlan() {
		System.out.println("Top yuvarland�...");
	}

}
