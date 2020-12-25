
public class Hanoi
{
	public static void main(String[] args)
	{
		int n = 6; // number of disks
		// declare the poles
		String origin = "origin";
		String temp = "temp";
		String target = "target";
		moveDisks(n, origin, target, temp);
	}
	
	// recursive method to solve the power of Hanoi problem
	public static void moveDisks(int n, String origin, String target, String temp)
	{
		if(n <= 0)
			return;
		if(n == 1)
		{
			System.out.println("Move disk 1 from pole " + origin + " to pole " + target);
			return;
		}
		
		moveDisks(n-1, origin, temp, target);
		System.out.println("Move disk " + n + " from pole " + origin +  " to pole " + target);
		
		moveDisks(n-1, temp, target, origin);
		
	}
	
			
    
}
