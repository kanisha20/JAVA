package Session17;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class First 
{
    public static void main(String[] args) 
    {
        HashMap<String, Double> orders = new HashMap<>();
        orders.put("ORD101", 250.50);
        orders.put("ORD102", 499.00);
        orders.put("ORD103", 180.75);
        orders.put("ORD104", 650.00);
        orders.put("ORD105", 320.25);
        Iterator<Map.Entry<String, Double>> itr = orders.entrySet().iterator();
        while (itr.hasNext()) 
        {
            Map.Entry<String, Double> entry = itr.next();
            System.out.println("Order ID: " + entry.getKey()  + " | Amount: ₹" + entry.getValue());
        }
    }
}