package sarmalama;

public class Uygulama3 {

	public static void main(String[] args) {
		
		Personel personel1=new Personel("Hakan Kara", 8000, 103, 45);
		
		personel1.setMaa�(12000);
		System.out.println(personel1.toString());
		personel1.setMaa�(6000);
		System.out.println(personel1.toString());
		System.out.println(personel1.getMaa�());

	}

}
