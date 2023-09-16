package string;

import java.util.Random;

public class AutoGenerateString {
	
	        public static String generateRandomString() 
	    {
	        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
	        Random random = new Random();
	        StringBuilder sb = new StringBuilder();
	        
	        for (int i = 0; i < 8; i++) 
	        {
	            sb.append(characters.charAt(random.nextInt(characters.length())));
	        }
	       
	        return sb.toString();
	    }
	        public static String generateRandomNumber() 
		    {
		        String characters = "1234567890";
		        Random random = new Random();
		        StringBuilder sb = new StringBuilder();
		        
		        for (int i = 0; i < 9; i++) 
		        {
		            sb.append(characters.charAt(random.nextInt(characters.length())));
		        }
		       
		        return sb.toString();
		    }
	        
	        

	         public static void main(String[] args) 
	      {
	        System.out.println(generateRandomString());
	        System.out.println("9"+generateRandomNumber());
	      }
	}


