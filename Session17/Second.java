package Session17;

import java.util.LinkedHashMap;
import java.util.Map;

public class Second 
{
    public static void main(String[] args) 
    {
        LinkedHashMap<String, String> songs = new LinkedHashMap<>();
        songs.put("Blinding Lights", "The Weeknd");
        songs.put("Perfect", "Ed Sheeran");
        songs.put("Kesariya", "Arijit Singh");
        songs.put("Shape of You", "Ed Sheeran");
        for (Map.Entry<String, String> entry : songs.entrySet()) 
        {
            System.out.println("Song: " + entry.getKey() + " | Artist: " + entry.getValue());
        }
    }
}