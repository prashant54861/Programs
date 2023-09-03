package string;

public class DuplicateCharString {
	
	public static void main(String[] args) {
		
		String s = "beautiful beach";
		char [] c = s.toCharArray();
		
		for(int i = 0; i<c.length-1; i++)
		{
			for(int j = i+1; j<c.length-1; j++)
			{
				if(c[i]==c[j])
				{
					System.out.print(c[j]+" ");
					break;
				}
			}
		}
	}
}
