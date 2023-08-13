package bankaccount;

import java.text.DecimalFormat;

public class Uygulama1 {

	public static void main(String[] args) {
		
		  // ��kt�y� bi�imlendirmek i�in bir Decimalformat nesnesi olu�turun.
	      DecimalFormat dollar = new DecimalFormat("#,##0.00");
	      
	      // 100 ABD dolar� bakiye, %3 faiz oran� ve 
	      // ayl�k 2,50 ABD dolar� hizmet �creti olan 
	      // bir SavingsAccount nesnesi olu�turun.
	      SavingsAccount savings = 
	                   new SavingsAccount(100.0, 0.03, 2.50);
	      
	      // Elimizde olan� g�ster.
	      System.out.println("Bakiye $" + 
	                         dollar.format(savings.getBalance()));
	      System.out.println("Mevduat (para yat�rma) say�s�: " + 
	                         savings.getNumDeposits());
	      System.out.println("Para �ekme say�s�: " + 
	                         savings.getNumWithdrawals());
	      System.out.println();
	      
	      // Biraz para yat�r�n.
	      savings.deposit(25.00);
	      savings.deposit(10.00);
	      savings.deposit(35.00);
	      
	      // Elimizde olan� g�ster.
	      System.out.println("Bakiye $" + 
	                         dollar.format(savings.getBalance()));
	      System.out.println("Mevduat (para yat�rma) say�s�: " + 
	                         savings.getNumDeposits());
	      System.out.println("Para �ekme say�s�: " + 
	                         savings.getNumWithdrawals());
	      System.out.println();
	      
	      // Birka� �ekme i�lemleri yap�n.
	      savings.withdraw(100.00);
	      savings.withdraw(50.00);
	      savings.withdraw(10.00);
	      savings.withdraw(1.00);
	      savings.withdraw(1.00);
	      
	      // Elimizde olan� g�ster.
	      System.out.println("Bakiye $" + 
	                         dollar.format(savings.getBalance()));
	      System.out.println("Mevduat (para yat�rma) say�s�: " + 
	                         savings.getNumDeposits());
	      System.out.println("Para �ekme say�s�: " + 
	                         savings.getNumWithdrawals());
	      System.out.println();

	      // Ayl�k i�lemleri yap�n.
	      savings.monthlyProcess();
	   
	      // �imdiye kadar yapt�klar�m�z� g�sterin.
	      System.out.println("Bakiye $" + 
                  dollar.format(savings.getBalance()));
	      System.out.println("Mevduat (para yat�rma) say�s�: " + 
                  savings.getNumDeposits());
	      System.out.println("Para �ekme say�s�: " + 
                  savings.getNumWithdrawals());
	      System.out.println();		

	}
}
