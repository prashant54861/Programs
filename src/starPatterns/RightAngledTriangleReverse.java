package starPatterns;

public class RightAngledTriangleReverse {
	
	public static void main(String[] args) {
		
		int a,b;
		int row = 5;
		
		for(a=1; a<=row; a++)
		{
			//print stars
			
				for(b=a; b<=row; b++)
				{
					System.out.print("*");
				}		
			System.out.println("");
		}		
}
	
}
