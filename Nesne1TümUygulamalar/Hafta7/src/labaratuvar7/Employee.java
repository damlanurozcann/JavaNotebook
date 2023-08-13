package labaratuvar7;

public class Employee {
	
	   // Alanlar
	   private String name;       // �al��an�n ismi
	   private int idNumber;      // kimlik Numaras�
	   private String department; // �al��an departman�
	   private String position;   // �� ismi
	   
	   /*
	      Bu yap�c�, ad, departman ve konum alanlar�n� bo� 
	      bir dizeyle ve idNum alan�n� 0 ile ba�lat�r.
	   */
	   
	   public Employee()
	   {
	      name = "";
	      idNumber = 0;
	      department = "";
	      position = "";
	   }

	   /**
	      Bu yap�c�, ad, idNum departman� ve konum alanlar�n� ba�lat�r.
	      @param n �al��an�n ad�.
	      @param id �al��an�n kimlik numaras�.
	      @param dept �al��an�n b�l�m�.
	      @param pos �al��an�n konumu.
	   */
	   
	   public Employee(String n, int id,
	                   String dept, String pos)
	   {
	      name = n;
	      idNumber = id;
	      department = dept;
	      position = pos;
	   }

	   /**
	      Bu yap�c�, ad ve idNum alanlar�n� ba�lat�r.
          Departman ve pozisyon alanlar� bo� bir dize ile ba�lat�l�r.
	      @param n �al��an�n ad�.
	      @param id �al��an�n kimlik numaras�.
	   */
	   
	   public Employee(String n, int id)
	   {
	      name = n;
	      idNumber = id;
	      department = "";
	      position = "";
	   }

	   /**
	      setName metodu, ad alan�nda depolanan 
	      bir ba��ms�z de�i�keni kabul eder.
	      @param n �al��an�n ad�.
	   */

	   public void setName(String n)
	   {
	      name = n;
	   }

	   /**
	      The setIdNumber method accepts an argument
	      which is stored in the idNumber field.
	      @param num The employee's ID number.
	   */

	   public void setIdNumber(int num)
	   {
	      idNumber = num;
	   }  

	   /**
	      The setDepartment method accepts an argument
	      which is stored in the department field.
	      @param d The employee's department.
	   */

	   public void setDepartment(String d)
	   {
	      department = d;
	   }
	   
	   /**
	      The setPosition method accepts an argument
	      which is stored in the position field
	      @param p The employee's position.
	   */

	   public void setPosition(String p)
	   {
	      position = p;
	   }
	   
	   /**
	      The getName method returns the value in
	      the name field.
	      @return the employee's name.
	   */

	   public String getName()
	   {
	      return name;
	   }

	   /**
	      The getIdNumber method returns the value in
	      the idNumber field.
	      @return The employee's ID number.
	   */

	   public int getIdNumber()
	   {
	      return idNumber;
	   }

	   /**
	      The getDepartment method returns the value in
	      the department field.
	      @return The employee's department.
	   */

	   public String getDepartment()
	   {
	      return department;
	   }
	   
	   /**
	      The getPosition method returns the value in
	      the position field.
	      @return The employee's position.
	   */

	   public String getPosition()
	   {
	      return position;
	   }   
}
