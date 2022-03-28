
public class ParameterizedConstructor {

	// Default
	public ParameterizedConstructor()  // Access Modifer
	{
		System.out.println("I am the constructor");
		System.out.println("I am the constructor lecture");
	}
	
	// Parameterized Constructor
	public ParameterizedConstructor(int a, int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	
	public ParameterizedConstructor(String str)
	{
		System.out.println(str);
	}
	
	public void getData()
	{
		System.out.println("I am the method");
	}
	
	public static void main(String[] args) {
		
		ParameterizedConstructor c = new ParameterizedConstructor(4,5);
		ParameterizedConstructor pc = new ParameterizedConstructor("Hello");
	}

}