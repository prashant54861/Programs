package starPatterns;

public class MirrorRightAngledTriangle {
	
	public static void main(String[] args) 
	{
		int a,b,c;
		int row = 5;
		
		for(a=1; a<=row; a++)
		{
			//printing space
			for(b=1; b<=row-a; b++)
			{
				System.out.print(" ");
			}
			
			//printing star
			for(c=1; c<=a; c++)
			{
				System.out.print("*");
			}
			
			System.out.println("");
		}
	}

}
