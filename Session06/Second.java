package Session06;

class Playlist {

    String playlistName;
    int totalSongs;

    Playlist(String playlistName, int totalSongs) 
    {
        this.playlistName = playlistName;
        this.totalSongs = totalSongs;
    }

    void displayInfo() 
    {
        System.out.println("Playlist Name: " + playlistName);
        System.out.println("Total Songs: " + totalSongs);
    }
}

public class Second {

    public static void main(String[] args) {

        Playlist p = new Playlist("My Spotify Playlist", 25);

        p.displayInfo();
    }
}