package numeric;

public class DuplicateNumberInArray {
	
	public static void main(String[] args) {
		 
		int [] numbers = {10,20,10,3,0,54,30,44,20,44};
		
		for(int i = 0; i<=numbers.length-1; i++)
		{
			for(int j = i+1; j<=numbers.length-1; j++)
			{
				if(numbers[i]==numbers[j])
				{
					System.out.println("Duplicate number ---->>"+numbers[i]);
				}
			}
		}
}
}
