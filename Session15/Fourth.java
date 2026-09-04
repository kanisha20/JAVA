package Session15;

import java.io.FileInputStream;
import java.io.IOException;

public class Fourth
{
    public static void main(String[] args)
    {
        try
        {
            FileInputStream fis = new FileInputStream("cartlog.txt");
            int data;
            int itemCount = 0;
            while ((data = fis.read()) != -1)
            {
                char ch = (char) data;
                if (ch == '\n')
                {
                    itemCount++;
                }
            }
            fis.close();
            System.out.println("Total items added to cart: " + itemCount);
        }
        catch (IOException e)
        {
            System.out.println("Error: " + e.getMessage());
        }
    }
}