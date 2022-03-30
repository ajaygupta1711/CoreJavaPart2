package Package;

import AccessModifiers.AccMod;

public class Demo extends AccMod {
	
	public void abc()
	{
		System.out.println("Package Test");
	}

	public static void main(String[] args) {

		Demo d = new Demo();
		d.abc();
	}

}