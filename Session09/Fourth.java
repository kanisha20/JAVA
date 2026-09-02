package Session09;

class AppUser 
{
    String name;
    AppUser(String name) 
    {
        this.name = name;
        System.out.println("AppUser constructor called");
    }
}
class VerifiedUser extends AppUser 
{
    VerifiedUser(String name) 
    {
        super(name);
        System.out.println("VerifiedUser constructor called");
    }
}
class CelebrityUser extends VerifiedUser 
{
    CelebrityUser(String name) 
    {
        super(name);
        System.out.println("Welcome Celebrity User: " + name);
    }
}
public class Fourth 
{
	public static void main(String[] args) 
	{
		CelebrityUser user = new CelebrityUser("Kanisha");
	}
}
