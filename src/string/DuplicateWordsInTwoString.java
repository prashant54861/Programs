package string;

public class DuplicateWordsInTwoString {
	
	public static void main(String[] args) {
		
		String s1 = "My name is prashant not";
		String s2 = "My name is prashant ";
		
		String [] s3 = s1.split(" ");
		String [] s4 = s2.split(" ");
		
		for(int i = 0; i <=s3.length-1; i++)
		{
			for(int j = 0; j<=s4.length-1; j++)
			{
				if(s3[i].equalsIgnoreCase(s4[j]))
				{
					System.out.print(s3[i]+ " ");
				}
			}
		}
	}

}
