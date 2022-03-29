package ThisKeyword;

public class thisDemo {

	int a=2;  // Global Varibale
	
	public void getData()
	{
		int a=3; // Local Variable
		int b=a+this.a;
		int c=a-this.a;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(b);
		System.out.println(c);
	}
	
	public static void main(String[] args) {

		thisDemo td = new thisDemo();
		td.getData();
		
	}

}
