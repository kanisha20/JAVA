package Session04;

import java.util.Scanner;

public class First 
{
	public static void main(String[] args) 
	{
		int steps[]=new int[7];
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<7;i++)
		{
			System.out.println("Enter Steps for weekdays: " );
			steps[i]=sc.nextInt();
		}
		
		System.out.println("Step of Sunday : "+steps[0]);
		System.out.println("Step of Monday : "+steps[1]);
		System.out.println("Step of Tuesday : "+steps[2]);
		System.out.println("Step of Wednesday : "+steps[3]);
		System.out.println("Step of Thruesday : "+steps[4]);
		System.out.println("Step of Friday : "+steps[5]);
		System.out.println("Step of Saturday : "+steps[6]);
	}
}
