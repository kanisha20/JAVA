package Session04;

public class Fifth 
{
	public static void main(String[] args) 
	{
		  int[] scores = {75, 45, 120, 30, 200, 90, 150};

	        for (int i = 0; i < scores.length; i++) 
	        {
	            if (scores[i] == 200) 
	            {
	                break;
	            }
	            if (scores[i] < 50) {
	                continue;
	            }

	            System.out.println("Score: " + scores[i]);
	        }
	}
}
