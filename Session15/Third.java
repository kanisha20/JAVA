package Session15;

import java.io.FileOutputStream;
import java.io.IOException;

public class Third
{
    static void addToCart(String productName, int price)
    {
        try
        {
            FileOutputStream fos = new FileOutputStream("cartlog.txt", true);
            String message = "Added: " + productName + " - Rs. " + price + "\n";
            fos.write(message.getBytes());
            fos.close();
            System.out.println("Product added to cart!");
        }
        catch (IOException e)
        {
            System.out.println("Error: " + e.getMessage());
        }
    }
    public static void main(String[] args)
    {
        addToCart("Redmi Note 12", 12999);
        addToCart("Boat Headphones", 1999);
        addToCart("Wireless Mouse", 799);
    }
}