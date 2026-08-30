package Session05;

public class Second 
{
	public static void main(String[] args) 
	{
		int[][] matchScores = {{180, 165, 195},{150, 175, 160},{200, 185, 170},{145, 155, 180},{175, 190, 165}};
	        System.out.println("Team\tMatch 1\tMatch 2\tMatch 3");

	        for (int team = 0; team < matchScores.length; team++) 
	        {
	            System.out.print("Team " + (team + 1) + "\t");

	            for (int match = 0; match < matchScores[team].length; match++) 
	            {
	                System.out.print(matchScores[team][match] + "\t\t");
	            }

	            System.out.println();
	        }
	}
}
