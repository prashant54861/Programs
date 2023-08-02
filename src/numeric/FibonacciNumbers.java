package numeric;



public class FibonacciNumbers {
	
	public void method1(int a, int b, int c)
	{
	   System.out.print(a);
	   System.out.print(" ");
	   System.out.print(b);
	   System.out.print(" ");
	   
		for(int i = 1; i<=c; i++)
		{
			int e = a+b;
			System.out.print(e);
			System.out.print(" ");
			a=b;
			b=e;	
		}
		
    }
	
	public static void main(String[]args)
	{
		FibonacciNumbers fn = new FibonacciNumbers();
		
		fn.method1(0, 1, 20);
	}
	}


