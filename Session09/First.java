package Session09;

class Song 
{
    String title;
    String artist;
    Song(String title, String artist) 
    {
        this.title = title;
        this.artist = artist;
    }
    void displaySong() 
    {
        System.out.println("Song Title: " + title);
        System.out.println("Artist: " + artist);
    }
}
class PremiumSong extends Song 
{
    boolean lyricsAccess;
    PremiumSong(String title, String artist, boolean lyricsAccess) 
    {
        super(title, artist);
        this.lyricsAccess = lyricsAccess;
    }
    void displayPremiumSong() 
    {
        displaySong();
        System.out.println("Lyrics Access: " + lyricsAccess);
    }
}
public class First 
{
	public static void main(String[] args) 
	{
		PremiumSong song = new PremiumSong("Perfect","Ed Sheeran",true);
        song.displayPremiumSong();	
	}
}
