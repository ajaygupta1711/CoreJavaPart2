package AccessModifiers;

public class AccMod {

// Default, public, private and protected access modifiers	
	
	// // Default (Varibale/Method) - access method anywhere in package only 
	
	int i=5; // Default Variable
	
	void modifier()
	{
		System.out.println("Package Test");
	}
	
	// Public (Varibale/Method) - we will have access across all 
	
	public void modifier1() 
	{
		System.out.println("Package Test1");
	}
	
	// Protected (Varibale/Method) - we can access this method only in the same class and not in others class even in the same package.
	
	private void modifier2()
	{
		System.out.println("Package Test2");
	}
	
	// Protected (Varibale/Method) - Access those in sub classes only (it applied on other packages only)  (Default + 1 extra feature).
	// It can be used in other packgae classes using extends the class. 
	
	protected void modifier3()
	{
		System.out.println("Package Test3");
	}
	
	public static void main(String[] args) {
		
		AccMod am = new AccMod();
		am.modifier();
		am.modifier1();
		am.modifier2();
		am.modifier3();

	}

}
