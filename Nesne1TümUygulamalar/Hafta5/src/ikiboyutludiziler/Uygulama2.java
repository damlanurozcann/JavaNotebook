package ikiboyutludiziler;

public class Uygulama2 {

	public static void main(String[] args) {
		/*
		   1 0 0 0 0 i=0
           0 1 0 0 0 i=1   		  
		   0 0 1 0 0 i=2
		   0 0 0 1 0 i=3
		   0 0 0 0 1 i=4
		 
		j= 0 1 2 3 4
		*/

		byte[][] ikiboyutlu=new byte[5][5];
		
		for (int i = 0; i < ikiboyutlu.length; i++) { //sat�r
			for (int j = 0; j < ikiboyutlu.length; j++) { //s�tunlar
				if (i==j) {
					ikiboyutlu[i][j]=1;
				}
				System.out.print(ikiboyutlu[i][j]+"\t");
			}
			System.out.println();
		}
		
	}
}
