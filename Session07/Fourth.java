package Session07;

class InstaProfile 
{
    String username;
    int followers;
    InstaProfile(String username, int followers) 
    {
        this.username = username;
        this.followers = followers;
    }
    void increaseFollowers(int count) 
    {
        followers = followers + count;
        System.out.println("Updated Followers: " + followers);
    }
}
public class Fourth 
{
	public static void main(String[] args) 
	{
		InstaProfile profile = new InstaProfile("Kanisha", 1000);
        profile.increaseFollowers(500);
        profile.increaseFollowers(200);
	}
}
