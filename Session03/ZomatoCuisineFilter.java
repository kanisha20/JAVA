package Session03;

public class ZomatoCuisineFilter 
{
	public static void main(String[] args) 
	{
		String s1 = "Indian";
		String s2 = "Chinese";
		String s3 = "Italian";
		String s4 = "Mexican";
		switch(s4)
		{
		case "Indian" :
			System.out.println("Chole Bhature");
			System.out.println("Pulav");
			break;
		case "Chinese":
			System.out.println("Noodles");
			System.out.println("Pasta");
			break;
		case "Italian":
			System.out.println("Cheese Garlic Bread");
			System.out.println("Pizza");
			break;
		case "Mexican":
			System.out.println("Spring Roll");
			System.out.println("Churos");
			break;
		default:
				System.out.println("Invalid..");
				break;
		}
	}
}
