package string;

public class DuplicateWordsString {
	
	public static void main(String[] args) {
		
		String s = "My name is prashant my name not";
				
		String [] s1 = s.split(" ");
		
		for(int i = 0; i<s1.length-1; i++)
		{
			for(int j = i+1; j<s1.length-1; j++)
			{
				if(s1[i].equalsIgnoreCase(s1[j]))
				{
					System.out.println(s1[i]);
				}
			}
		}
		
	}

}
