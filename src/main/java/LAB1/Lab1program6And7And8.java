package lab1package;

public class Lab1program6And7And8
{
	enum Gen{
		M,F
	}
	String firstName;
	String lastName;
	Gen Gender;
	String phonenumber;
	
	
	Lab1program6And7And8(String firstName,String lastName,Gen Gender,String phonenumber)
	{
		this.firstName=firstName;
		this.lastName=lastName;
		this.Gender=Gender;
		this.phonenumber=phonenumber;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Gen getGender() {
		return Gender;
	}
	public void setGender(Gen Gender) {
		this.Gender = Gender;
	}
	void display()
	{
		System.out.println("First Name:"+getFirstName());
		System.out.println("last Name:"+getLastName());
		System.out.println("Gender:"+getGender());
		System.out.println("Phonenjumber:"+getPhonenumber());
	}
	public static void main(String[] args)
	{
		Lab1program6And7And8 obj =new Lab1program6And7And8("pavan","kancharla",Gen.M,"9392690658");
		obj.display();
	}
}
