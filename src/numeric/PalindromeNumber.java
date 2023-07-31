package numeric;

import java.util.Scanner;

public class PalindromeNumber {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number --->");
		int number = s.nextInt();
		int oriNumber = number;
		int rev = 0;
		
		while(number>0)
		{
			int reminder = number%10;
			rev = rev*10 +reminder;
			number = number/10;
		}
		
		if(oriNumber==rev)
		{
			System.out.println("Given Number is Palindrome Number");
		}
		else
		{
			System.out.println("Given Number is not Palindrome Number");
		}
		
		s.close();
	}

}
