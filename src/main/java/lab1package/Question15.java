package lab1package;
import java.time.LocalDate;
import java.time.Period;
public class Question15 {

	public void calculateAge(String DOB)
	{
		LocalDate date_of_birth=LocalDate.parse(DOB);
		LocalDate currentdate=LocalDate.now();
		Period age=Period.between(date_of_birth,currentdate) ;
		System.out.println("age of person is"+age.getYears());
	}
	
	public void getFullName(String firstName,String lastName)
	{
		System.out.println("Full name is:"+firstName+" "+lastName);
	}
	
	public static void main(String[] args) 
	{
		Question15 obj=new Question15();
		obj.calculateAge("2002-07-15");
		obj.getFullName("Pavan","Kancharla");
		
	}

}
