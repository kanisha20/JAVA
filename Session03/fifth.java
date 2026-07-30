package Session03;

import java.util.Scanner;

public class fifth 
{
	public static void main(String[] args) {
		
	int min_rating = 2;
	
	int [] ratings = new int[5];
	Scanner sc=new Scanner(System.in);
	
	for(int i=0;i<5;i++)
	{
		System.out.println("Enter ratings : ");
		ratings[i]=sc.nextInt();
	}
	
	for(int i=0;i<5;i++)
	{
		if(ratings[i]>=min_rating)
		{
			System.out.println("Ratings are : "+ratings[i]);
		}
	}
}
}