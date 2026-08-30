package Session05;

public class third 
{
	public static void main(String[] args) 
	{
		double[] orders = {250.50, 180.00, 320.75, 150.25, 450.00,275.50, 199.99, 350.00, 120.50, 500.25};
	        double total = 0;
	        double minimum = orders[0];
	        double maximum = orders[0];
	        for (int i = 0; i < orders.length; i++) 
	        {
	            total = total + orders[i];
	            if (orders[i] < minimum) 
	            {
	                minimum = orders[i];
	            }
	            if (orders[i] > maximum) 
	            {
	                maximum = orders[i];
	            }
	        }
	        System.out.println("Total Spent: ₹" + total);
	        System.out.println("Minimum Order: ₹" + minimum);
	        System.out.println("Maximum Order: ₹" + maximum);
	}
}
