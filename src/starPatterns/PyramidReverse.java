package starPatterns;

public class PyramidReverse {
	public static void main(String[] args) {
		
		int a,b,c;
		int row = 5;
		
		for(a=row; a>=1; a--)
		{
            //for printing spaces
			for(c=a; c<row; c++)
			{
				System.out.print(" ");
			}
			
			// for printing stars
			for(b=1; b<=(a*2-1); b++)
			{
				System.out.print("*");
			}
			
			System.out.println("");
		}
	}
}
