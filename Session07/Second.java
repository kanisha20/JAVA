package Session07;

class MovieTicket 
{
    double price;
    static int totalTickets = 0;
    void bookTicket(int amount) 
    {
        price = amount;
        totalTickets++;
        System.out.println("Ticket booked. Price: " + price);
    }
    void checkTotalTickets() 
    {
        System.out.println("Total Tickets Booked: " + totalTickets);
    }
}
public class Second 
{
	public static void main(String[] args) 
	{
		 MovieTicket ticket1 = new MovieTicket();
	        MovieTicket ticket2 = new MovieTicket();
	        ticket1.bookTicket(250);
	        ticket2.bookTicket(300);
	        ticket1.checkTotalTickets();
	}
}
