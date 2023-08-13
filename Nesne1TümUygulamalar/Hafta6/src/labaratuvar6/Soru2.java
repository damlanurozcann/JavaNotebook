package labaratuvar6;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Soru2 {

	public static void main(String[] args) {
		
		String input;
		double wholesale; // toptan maliyet
		double markup; // kar marj� y�zdesi
		
		input=JOptionPane.showInputDialog("�r�n�n toptan sat�� mmaliyetini girin: ");
		wholesale=Double.parseDouble(input);
		
		input=JOptionPane.showInputDialog("�r�n�n kar marj� y�zdesini girin: ");
		markup=Double.parseDouble(input);
		
		DecimalFormat dollar= new DecimalFormat("#,##0.00");
		
		JOptionPane.showMessageDialog(null, "�r�n�n perakende fiyat� $. " + 
		                       dollar.format(perakendeHesapla(wholesale,markup)) +" d�r.");
		
		System.exit(0);

	}

	private static double perakendeHesapla(double wholesale, double markup) {
		
		return wholesale +(wholesale*(markup/100.0));
	}
}
