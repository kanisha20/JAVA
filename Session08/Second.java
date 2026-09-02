package Session08;

class Movie 
{
    String movieTitle;
    Movie(String movieTitle)
    {
        this.movieTitle = movieTitle;
    }
    void addReview(int rating) 
    {
        System.out.println("Movie: " + movieTitle);
        System.out.println("Rating: " + rating + "/5");
    }
    void addReview(int rating, String comment) 
    {
        System.out.println("Movie: " + movieTitle);
        System.out.println("Rating: " + rating + "/5");
        System.out.println("Review: " + comment);
    }
}
public class Second 
{
	public static void main(String[] args) 
	{
		Movie movie = new Movie("Avengers: Endgame");
        movie.addReview(5);
        System.out.println();
        movie.addReview(4, "Amazing movie with great action!");
	}
}
