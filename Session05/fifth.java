package Session05;

public class fifth 
{
	public static void main(String[] args) 
	{
		 String[][] playlist = {{"Shape of You", "Ed Sheeran", "4:24"},{"Blinding Lights", "The Weeknd", "3:20"},{"Perfect", "Ed Sheeran", "4:23"}};
		        System.out.println("Song Name\t\tArtist\t\tDuration");
		        for (int i = 0; i < playlist.length; i++) {
		            System.out.println(playlist[i][0] + "\t\t" +playlist[i][1] + "\t\t" +playlist[i][2] );
		        }
	}
}
