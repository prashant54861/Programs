package starPatterns;

public class Pyramid {
	
	public static void main(String[] args) {
		
		int a,b,c;
		int row = 5;
		
		for(a=1; a<=row; a++)
		{
			// for printing spaces
			for(b=1; b<=row-a; b++)
			{
				System.out.print(" ");
			}
			
			// for printing stars
			
			for(c=1; c<=(2*a-1); c++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		
	}

}
