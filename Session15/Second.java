package Session15;

import java.io.FileReader;
import java.io.IOException;

public class Second
{
    public static void main(String[] args)
    {
        try
        {
            FileReader reader = new FileReader("playlist.txt");
            int ch;
            int lineNumber = 1;
            System.out.println("Spotify Playlist:");
            System.out.println("----------------------");
            while ((ch = reader.read()) != -1)
            {
                if (ch == '\n')
                {
                    lineNumber++;
                }
                else
                {
                    System.out.print(ch);
                }
                if (ch == '\n')
                {
                    System.out.print(lineNumber + ". ");
                }
            }
            reader.close();
        }
        catch (IOException e)
        {
            System.out.println("Error: " + e.getMessage());
        }
    }
}