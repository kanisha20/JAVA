package Session11;

interface Searchable 
{
    void search(String keyword);
}
class MovieLibrary implements Searchable 
{
    String[] movies = {"Avengers","Avatar","Titanic","Inception","Avengers Endgame"};
    @Override
    public void search(String keyword) 
    {
        System.out.println("Movies containing: " + keyword);
        for (String movie : movies) 
        {
            if (movie.toLowerCase().contains(keyword.toLowerCase())) 
            {
                System.out.println(movie);
            }
        }
    }
}
public class Fourth 
{
    public static void main(String[] args) 
    {
        MovieLibrary library = new MovieLibrary();
        library.search("Avengers");
    }
}