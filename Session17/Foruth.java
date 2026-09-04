package Session17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Foruth 
{
    static void printTop3(HashMap<String, Integer> users) 
    {
        ArrayList<Map.Entry<String, Integer>> list =new ArrayList<>(users.entrySet());
        Collections.sort(list, (entry1, entry2) ->entry2.getValue() - entry1.getValue());
        System.out.println("Top 3 Instagram Users:");
        int count = 0;
        for (Map.Entry<String, Integer> entry : list) 
        {
            System.out.println(entry.getKey() + " - " + entry.getValue() + " followers");
            count++;
            if (count == 3)
            {
                break;
            }
        }
    }
    public static void main(String[] args) 
    {
        HashMap<String, Integer> users = new HashMap<>();
        users.put("virat", 270000000);
        users.put("cristiano", 650000000);
        users.put("selenagomez", 420000000);
        users.put("therock", 395000000);
        users.put("leomessi", 510000000);
        printTop3(users);
    }
}