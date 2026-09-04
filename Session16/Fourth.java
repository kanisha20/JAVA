package Session16;

import java.util.HashMap;
import java.util.Map;

public class Fourth
{
    public static void main(String[] args)
    {
        HashMap<String, Integer> followers = new HashMap<>();
        followers.put("user1", 5000);
        followers.put("user2", 12000);
        followers.put("user3", 8000);
        followers.put("user4", 12000);
        followers.put("user5", 7000);
        int maxFollowers = 0;
        for (Map.Entry<String, Integer> entry : followers.entrySet())
        {
            if (entry.getValue() > maxFollowers)
            {
                maxFollowers = entry.getValue();
            }
        }
        System.out.println("Highest Follower Count: " + maxFollowers);
        System.out.println("Username(s) with highest followers:");
        for (Map.Entry<String, Integer> entry : followers.entrySet())
        {
            if (entry.getValue() == maxFollowers)
            {
                System.out.println(entry.getKey());
            }
        }
    }
}