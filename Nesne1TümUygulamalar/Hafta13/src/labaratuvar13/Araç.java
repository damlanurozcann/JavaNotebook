package labaratuvar13;

public abstract class Ara� {
	
	String plaka;
	
	private int motorserino;

	public Ara�(String plaka, int motorserino) {
		super();
		this.plaka = plaka;
		this.motorserino = motorserino;
	}
	
	
	public abstract void ilerle();
	
	public abstract void geriGit();
	
	public abstract void dur();
	
	public abstract void ilerle(int km); //method overloading


	public int getMotorserino() {
		return motorserino;
	}


	public void setMotorserino(int motorserino) {
		this.motorserino = motorserino;
	}
	
}
