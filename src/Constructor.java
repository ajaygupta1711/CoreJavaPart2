
public class Constructor {

	
	public Constructor()  // Access Modifer
	{
		System.out.println("I am the constructor");
		System.out.println("I am the constructor lecture");
	}
	
	public void getData()
	{
		System.out.println("I am the method");
	}
	
	public static void main(String[] args) {
		
		Constructor c = new Constructor();
	}

}