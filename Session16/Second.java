package Session16;

import java.util.HashSet;

public class Second
{
    public static void main(String[] args)
    {
        HashSet<String> usernames = new HashSet<>();
        usernames.add("foodie123");
        usernames.add("kanisha");
        usernames.add("foodlover");
        usernames.add("pizza_fan");
        usernames.add("spicylover");
        usernames.add("kanisha");       
        usernames.add("foodie123");     
        System.out.println("Unique Zomato Usernames:");
        System.out.println("----------------------");
        for (String username : usernames)
        {
            System.out.println(username);
        }
    }
}