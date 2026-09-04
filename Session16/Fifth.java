package Session16;

import java.util.ArrayList;

class song
{
    String title;
    String artist;
    song(String title, String artist)
    {
        this.title = title;
        this.artist = artist;
    }
    void display()
    {
        System.out.println("Song: " + title);
        System.out.println("Artist: " + artist);
    }
}
public class Fifth
{
    public static void main(String[] args)
    {
        ArrayList<song> playlist = new ArrayList<>();
        playlist.add(new song("Perfect", "Ed Sheeran"));
        playlist.add(new song("Kesariya", "Arijit Singh"));
        playlist.add(new song("Blinding Lights", "The Weeknd"));
        System.out.println("Spotify Playlist:");
        System.out.println("----------------------");
        for (song song : playlist)
        {
            song.display();
            System.out.println();
        }
        System.out.println("Songs are stored in memory using ArrayList.");
        System.out.println("They can later be saved into a database.");
    }
}