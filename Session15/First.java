package Session15;

import java.io.FileWriter;
import java.io.IOException;

public class First
{
    public static void main(String[] args)
    {
        try
        {
            FileWriter writer = new FileWriter("playlist.txt");
            writer.write("Perfect\n");
            writer.write("Kesariya\n");
            writer.write("Blinding Lights\n");
            writer.write("Shape of You\n");
            writer.write("Tum Hi Ho\n");
            writer.close();
            System.out.println("Songs written successfully to playlist.txt");
        }
        catch (IOException e)
        {
            System.out.println("Error: " + e.getMessage());
        }
    }
}