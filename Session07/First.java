package Session07;

class Playlist 
{
    int songCount = 0;
    void addSong() 
    {
        songCount++;
        System.out.println("Song added to playlist");
    }
    void checkSongCount() 
    {
        System.out.println("Total number of songs: " + songCount);
    }
}
public class First 
{
	public static void main(String[] args) 
	{
		Playlist p = new Playlist();
        p.addSong();
        p.addSong();
        p.addSong();
        p.addSong();
        p.addSong();
        p.checkSongCount();
	}
}
