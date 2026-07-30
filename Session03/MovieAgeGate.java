package Session03;

public class MovieAgeGate 
{
	public static void main(String[] args) 
	{
		int age = 18;
		if(age<13)
		{
			System.out.println("Kids Section..");
		}
		else if(age>=13 && age <=17)
		{
			System.out.println("Teen Section..");
		}
		else 
		{
			System.out.println("Adult Section..");
		}
	}
}
