package StaticNonStatic;

public class StaticVar {

	static String prefix = "Mr";
	String name; // INSTANCE VARIBALE
	String address;
	static String city = "Pune";  // CLASS VARIBALE, all static varibale is a class variable
	static int i=0; // If remove static, not incremented value in colsole as not sharing
	
	static {  			// STATIC BLOCK, no need to write line by line
		
		city = "Pune";
		i=0;
	}

	StaticVar(String name, String address)  // LOCAL VARIBALE
	{
		this.name=name;  // this operator is used to assign instance variable
		this.address=address;
	}
	
	public void getDetails()
	{
		i++;
		System.out.println(i + " " + prefix + " " + name + " " + address + " " + city);
	}
	
	public static void getPrefix() // STATIC KEYWORD and METHOD
	{
		System.out.println(prefix);
	}
	
	public static void main(String[] args) {
		
		StaticVar obj = new StaticVar("Ajay","Wagholi"); // Create common varibale for city if it is common. it is taking unnecessary memory.
		StaticVar obj1 = new StaticVar("Aarav","Kharadi");
		obj.getDetails();
		obj1.getDetails();
//		StaticVar.getPrefix();  // static method call using class name 
		StaticVar.i=4;
	}

}
