package Session17;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Third 
{
    public static void main(String[] args) 
    {
        HashMap<String, Integer> products = new HashMap<>();
        products.put("Mobile", 15000);
        products.put("Headphones", 800);
        products.put("Laptop", 55000);
        products.put("Keyboard", 1200);
        products.put("Mouse", 600);
        Iterator<Map.Entry<String, Integer>> itr =products.entrySet().iterator();
        System.out.println("Products above ₹1000:");
        while (itr.hasNext()) 
        {
            Map.Entry<String, Integer> entry = itr.next();
            if (entry.getValue() > 1000) 
            {
                System.out.println(entry.getKey() + " - ₹" + entry.getValue());
            }
        }
    }
}