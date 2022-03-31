package FinallyBlock;

public class finallyBlock {

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
	
		finally
		{
			System.out.println("Delete Cookies");
		}
		
	}

}
