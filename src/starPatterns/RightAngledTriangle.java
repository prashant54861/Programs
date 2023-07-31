package starPatterns;

public class RightAngledTriangle {
	
	public static void main(String[] args) {
		
		int a,b;
		int row = 5;
		
		for(a = 1; a<=row; a++)
		{
			//for printing stars
			for(b=1; b<=a; b++)
			{
				System.out.print("*");
			}
			
			System.out.println("");
		}
	}

}
