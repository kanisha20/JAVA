package Session11;

public class First 
{
    private String name;
    private String owner;
    private int totalSongs;
    public String getName() 
    {
        return name;
    }
    public void setName(String name) 
    {
        this.name = name;
    }
    public String getOwner() 
    {
        return owner;
    }
    public void setOwner(String owner)
    {
        this.owner = owner;
    }
    public int getTotalSongs() 
    {
        return totalSongs;
    }
    public void setTotalSongs(int totalSongs) 
    {
        this.totalSongs = totalSongs;
    }

    public static void main(String[] args) 
    {
        First p = new First();
        p.setName("My Favorites");
        p.setOwner("Kanisha");
        p.setTotalSongs(25);
        System.out.println("Playlist Name: " + p.getName());
        System.out.println("Owner: " + p.getOwner());
        System.out.println("Total Songs: " + p.getTotalSongs());
    }
}