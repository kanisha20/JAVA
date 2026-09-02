package Session09;

class UserProfile 
{
    String name;
    UserProfile(String name) 
    {
        this.name = name;
    }
    void displayProfile() 
    {
        System.out.println("User Name: " + name);
    }
}
class InfluencerProfile extends UserProfile 
{
    int followers;
    InfluencerProfile(String name, int followers) 
    {
        super(name);
        this.followers = followers;
    }
    void displayInfluencer() 
    {
        displayProfile();
        System.out.println("Followers: " + followers);
    }
}
class BrandProfile extends UserProfile 
{
    String brandName;
    BrandProfile(String name, String brandName) 
    {
        super(name);
        this.brandName = brandName;
    }
    void displayBrand() 
    {
        displayProfile();
        System.out.println("Brand Name: " + brandName);
    }
}
public class Third 
{
	public static void main(String[] args) 
	{
		 InfluencerProfile influencer =new InfluencerProfile("Z", 50000);
	        BrandProfile brand =new BrandProfile("A", "B");
	        System.out.println("Influencer Profile:");
	        influencer.displayProfile();
	        System.out.println("Followers: " + influencer.followers);
	        System.out.println("Brand Profile:");
	        brand.displayProfile();
	        System.out.println("Brand Name: " + brand.brandName);
	}
}
