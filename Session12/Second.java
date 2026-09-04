package Session12;

import java.util.Scanner;

public class Second
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first song title: ");
        String song1 = sc.nextLine();
        System.out.print("Enter second song title: ");
        String song2 = sc.nextLine();
        if (song1.equals(song2))
        {
            System.out.println("Both song titles are exactly same.");
        }
        else
        {
            System.out.println("Both song titles are different.");
        }
        int result = song1.compareTo(song2);
        if (result == 0)
        {
            System.out.println("Both titles are equal in lexicographical order.");
        }
        else if (result < 0)
        {
            System.out.println("First song title comes before second song title.");
        }
        else
        {
            System.out.println("First song title comes after second song title.");
        }
        sc.close();
    }
}