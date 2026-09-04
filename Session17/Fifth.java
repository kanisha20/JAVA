package Session17;

import java.util.HashMap;

public class Fifth 
{
    public static void main(String[] args) 
    {
        HashMap<String, String> orders = new HashMap<>();
        orders.put("ORD101", "Pizza - ₹450");
        orders.put("ORD102", "Burger - ₹250");
        orders.put("ORD103", "Biryani - ₹300");
        orders.put("ORD104", "Pasta - ₹350");
        System.out.println("Zomato Order History:");
        for (String orderId : orders.keySet()) 
        {
            System.out.println(orderId + " : " + orders.get(orderId));
        }
        System.out.println("\nDetails of ORD102:");
        System.out.println(orders.get("ORD102"));
    }
}