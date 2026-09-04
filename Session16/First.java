package Session16;

import java.util.ArrayList;

class Song
{
    String title;
    String artist;
    double duration;
    Song(String title, String artist, double duration)
    {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }
    void display()
    {
        System.out.println("Title: " + title);
        System.out.println("Artist: " + artist);
        System.out.println("Duration: " + duration + " minutes");
        System.out.println("----------------------");
    }
}
public class First
{
    public static void main(String[] args)
    {
        ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song("Blinding Lights", "The Weeknd", 3.20));
        songs.add(new Song("Perfect", "Ed Sheeran", 4.23));
        songs.add(new Song("Kesariya", "Arijit Singh", 4.28));
        songs.add(new Song("Shape of You", "Ed Sheeran", 3.53));
        songs.add(new Song("Tum Hi Ho", "Arijit Singh", 4.22));
        System.out.println("Song Details:");
        System.out.println("----------------------");
        for (Song song : songs)
        {
            song.display();
        }
    }
}