package Session12;

import java.util.Random;

public class Third
{
    public static void main(String[] args)
    {
        Random random = new Random();
        int number = 100000 + random.nextInt(900000);
        StringBuilder orderId = new StringBuilder();
        orderId.append("ORD");
        orderId.append(number);
        System.out.println("Generated Order ID: " + orderId);
    }
}