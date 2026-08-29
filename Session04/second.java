package Session04;

import java.util.Scanner;

public class second 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int order[] =new int[3];
		for(int i=0;i<3;i++)
		{
			System.out.println("Enter order value : ");
			order[i]=sc.nextInt();
		}
	
			System.out.println("order 1 value : "+order[0]);
			System.out.println("order 2 value : "+order[1]);
			System.out.println("order 3 value : "+order[2]);
		
			System.out.println("sum of order 1 , 2 & 3 : "+(order[0]+order[1]+order[2]));
	}
}
