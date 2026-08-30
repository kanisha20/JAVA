package Session05;

public class fourth 
{
	public static void main(String[] args) 
	{
		 char[][] seats = {
		            {'A', 'B', 'A', 'A', 'B', 'A'},
		            {'B', 'A', 'A', 'B', 'A', 'A'},
		            {'A', 'A', 'B', 'B', 'A', 'B'},
		            {'A', 'B', 'A', 'A', 'A', 'B'},
		            {'B', 'A', 'A', 'B', 'A', 'A'}
		        };
		        int availableSeats = 0;
		        for (int row = 0; row < seats.length; row++) 
		        {
		            for (int col = 0; col < seats[row].length; col++) 
		            {

		                if (seats[row][col] == 'A') {
		                    availableSeats++;
		                }
		            }
		        }
		        System.out.println("Number of available seats: " + availableSeats);
	}
}
