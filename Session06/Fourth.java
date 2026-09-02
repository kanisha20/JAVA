package Session06;


class MovieTicket 
{
    String movieTitle;
    String seatNumber;
    MovieTicket(String movieTitle, String seatNumber) 
    {
        this.movieTitle = movieTitle;
        this.seatNumber = seatNumber;
    }
    void printTicket() 
    {
        System.out.println("Movie Title: " + movieTitle);
        System.out.println("Seat Number: " + seatNumber);
    }
}
public class Fourth 
{
	public static void main(String[] args) 
	{
        MovieTicket ticket = new MovieTicket("Avengers: Endgame", "A12");
        ticket.printTicket();
	}
}
