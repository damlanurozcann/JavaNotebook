package soyutlama;

public class Uygulama1 {

	public static void main(String[] args) {
		
		CepTelefonu ceptelefonu=new CepTelefonu("Android");
		Masa�st� masa�st�=new Masa�st�("Windows");
		Latop laptop=new Latop("Linux");
		
		ceptelefonu.interneteBa�lan();
		masa�st�.interneteBa�lan();
		laptop.interneteBa�lan();
		

	}

}
