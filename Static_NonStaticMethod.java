package module1;

public class Static_NonStaticMethod {
	
	static void add()					// Static Method
	{
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println(c);
		
		
	}
	
	static void sub()					// Static Method
	{
		int a = 20;
		int b = 10;
		int d = a-b;
		System.out.println(d);
	}
	
	public static void main(String[] args) {		// main method
		
		add();
		sub();
		
		
	}
	
	Static_NonStaticMethod()			// constructor 
	{
		
	}

}
