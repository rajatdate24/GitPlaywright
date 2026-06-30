package module1;

public class ThisCallingStatement {
	
	ThisCallingStatement(int a)
	{
		System.out.println("Constructor with one parameter: " + a);
	}
	
	ThisCallingStatement(int a, String b) 
	{
		this(a); // Calling constructor with one parameter);
		System.out.println("Constructor with two parameters: " + a + ", " + b);
	}	

	ThisCallingStatement(int a, String b, double c) 
	{
		this(a, b); // Calling constructor with one parameter);
		System.out.println("Constructor with three parameters: " + a + ", " + b + ", " + c);
	}
	
	public static void main(String[] args) 
	{
		
//		ThisCallingStatement obj1 = new ThisCallingStatement(10);
//		ThisCallingStatement obj2 = new ThisCallingStatement(20, "Hello");
//		ThisCallingStatement obj3 = new ThisCallingStatement(30, "World", 3.14);

		// or we can call constructor by below
//		new ThisCallingStatement(40);
//		new ThisCallingStatement(40, "Java");
		new ThisCallingStatement(40, "Programming", 2.71);
		
		
	}

}
