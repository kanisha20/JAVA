package Session04;

import java.util.Random;

public class Fourth 
{

	public static void main(String[] args) 
	{
		Random random=new Random();
		
		for (int w=1;w<=4;w++)
		{
			System.out.println("week "+w);
			for(int d=1;d<=7;d++)
			{
				int likes=random.nextInt(500)+1;
				System.out.println("day "+d+" : "+likes+" likes");
			}
			System.out.println();
		}
	}
}
