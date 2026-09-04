package Session13;

import java.util.Scanner;

public class Second 
{
    @SuppressWarnings("resource")
	public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter wallet balance: ₹");
        int balance = sc.nextInt();
        System.out.print("Enter purchase amount: ₹");
        int purchase = sc.nextInt();
        try 
        {
            if (purchase > balance) 
            {
                throw new Exception("Insufficient wallet balance!");
            }
            balance = balance - purchase;
            System.out.println("Purchase successful!");
            System.out.println("Remaining wallet balance: ₹" + balance);
        } 
        catch (Exception e) 
        {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}