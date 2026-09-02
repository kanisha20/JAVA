package Session08;
class Playlist 
{
	String name;
	String description;
	Playlist() 
	{
		this("My Playlist");
	}
	Playlist(String name) 
	{
		this(name, "No description available");
	}
	Playlist(String name, String description) 
	{
		this.name = name;
		this.description = description;
	}
	void displayInfo() 
	{
		System.out.println("Playlist Name: " + name);
		System.out.println("Description: " + description);
		System.out.println();
	}
}
public class Fourth 
{
	public static void main(String[] args) 
	{
        Playlist p1 = new Playlist();
        Playlist p2 = new Playlist("Workout Playlist");
        Playlist p3 = new Playlist(
                "Chill Vibes",
                "Relaxing songs for the evening"
        );
        System.out.println("Playlist 1:");
        p1.displayInfo();
        System.out.println("Playlist 2:");
        p2.displayInfo();
        System.out.println("Playlist 3:");
        p3.displayInfo();	
	}
}
