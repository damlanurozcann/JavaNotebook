package labaratuvar13;

public class Uygulama1 {

	public static void main(String[] args) {
		
		Taksi taksi=new Taksi("34NZ632", 25621);
		
		Kep�e kep�e=new Kep�e("63HN125", 12362);
		
		taksi.ilerle();
		taksi.ilerle(100);
		
		System.out.println("-----------------------");
		System.out.println();
		
		kep�e.geriGit();
		kep�e.�al��(5);
		

	}
}
