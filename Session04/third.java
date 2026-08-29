package Session04;

import java.util.Scanner;

public class third 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String artist;
		int count=0;
		
			do
			{
				System.out.println("enter fav. artist name : ");
				artist = sc.nextLine();	
				if(!artist.equalsIgnoreCase("exit"))
				{
					count++;
				}
			}
			while(!artist.equalsIgnoreCase("exit"));
			System.out.println("total count : "+count);
	}
}
