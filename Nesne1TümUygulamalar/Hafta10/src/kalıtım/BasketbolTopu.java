package kal�t�m;

import java.awt.Color;

public class BasketbolTopu extends Top {

	public BasketbolTopu(String hammadde, double �ap, Color renk, int elastikiyet) {
		super(hammadde, �ap, renk, elastikiyet);
		// TODO Auto-generated constructor stub
	}
	
	
	
	@Override
	public String toString() {
		return "BasketbolTopu [hammadde=" + hammadde + ", �ap=" + �ap + ", renk=" + renk + ", elastikiyet="
				+ elastikiyet + "]";
	}



	public void basket() {
		System.out.println("Basketbol topu basket oldu...");
	}

	
}
