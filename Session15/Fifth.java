package Session15;

import java.io.FileWriter;
import java.io.FileOutputStream;
import java.io.IOException;

public class Fifth
{
    static void addProduct(String productName, int price)
    {
        try
        {
            FileWriter writer = new FileWriter("shoppingcart.txt", true);
            writer.write(productName + " - Rs. " + price + "\n");
            writer.close();
            System.out.println("Product saved using FileWriter.");
        }
        catch (IOException e)
        {
            System.out.println("Error: " + e.getMessage());
        }
    }
    static void addProductUsingStream(String productName, int price)
    {
        try
        {
            FileOutputStream fos = new FileOutputStream("shoppingcart.txt", true);
            String data = productName + " - Rs. " + price + "\n";
            fos.write(data.getBytes());
            fos.close();
            System.out.println("Product saved using FileOutputStream.");
        }
        catch (IOException e)
        {
            System.out.println("Error: " + e.getMessage());
        }
    }
    public static void main(String[] args)
    {
        addProduct("Redmi Note 12", 12999);
        addProductUsingStream("Boat Headphones", 1999);
        addProduct("Wireless Mouse", 799);
        System.out.println();
        System.out.println("Data saved successfully.");
        System.out.println("In real apps like Zomato or Myntra,");
        System.out.println("this type of data is stored in a database.");
    }
}