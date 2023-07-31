package numeric;

import java.util.Scanner;

public class ReverseNumber {
		public static void main(String[] args) {
			
			Scanner s = new Scanner(System.in);
			System.out.print("Enter the number --->");
			int number = s.nextInt();
			
			int rev = 0;
			
			while(number>0)
			{
				int reminder = number%10;
				rev = rev*10 +reminder;
				number = number/10;
			}
			
	        System.out.println("Reverse Number of Entered Number ---->>"+rev);	
	        
	        s.close();
		}

	}


