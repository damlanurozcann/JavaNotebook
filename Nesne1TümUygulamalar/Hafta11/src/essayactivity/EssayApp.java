package essayactivity;

public class EssayApp {

	public static void main(String[] args) {
		
		Essay termPaper= new Essay();
		
		termPaper.setScore(25.0, 18.0, 20.0, 25.0);
		
		System.out.println("D�nem �devi: ");
		System.out.println("Gramer Puan�: "+termPaper.getGrammer());
		System.out.println("Heceleme Puan�: "+termPaper.getSpelling());
		System.out.println("Do�ru yaz�m uzunluk Puan�: "+ termPaper.getCorrectLength());
		System.out.println("��erik Puan�: "+termPaper.getContent());
		System.out.println("Toplam Puan: "+termPaper.getScore());
		System.out.println("Harfli Ba�ar� Not:"+termPaper.getGrade());
	
	}
}
