package Exception;

public class exceptionDemo {
	
// 3 lines of code - Not Sure this lines through an error or not. I need to catch them, and print a message without failing.	
// try - catch mechanism	
	
	public static void main(String[] args) {
	
		int b=7;
		int c=0;
		
		try
		{
			int k=b/c;
			System.out.println(k);
		}	

		catch(Exception e)

		{
			System.out.println("I catched the error/exception");
		}
		
	}

}