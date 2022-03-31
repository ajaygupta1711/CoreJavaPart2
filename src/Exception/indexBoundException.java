package Exception;


	public class indexBoundException {
		
	// 3 lines of code - Not Sure this lines through an error or not. I need to catch them, and print a message without failing.	
	// try - catch mechanism	
	// One try can be followed by multiple catch blocks
	// try and catch will not work if enter any other blockes in between
	// Catch should immediate block after try
		
		public static void main(String[] args) {

			try
			{
				int arr[] = new int[5];
				System.out.println(arr[7]);
			}
			
			catch(ArithmeticException et) // It will catch only arithmetic exceptions
			{
				System.out.println("I catched the arithmetic exception");
			}
			
			catch(IndexOutOfBoundsException ets)
			{
				System.out.println("I catched the IndexBound exception");
			}
			
			catch(Exception e)

			{
				System.out.println("I catched the error/exception");
			}
			
		}

	}
