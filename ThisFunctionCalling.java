package module1;

public class ThisFunctionCalling {
	
	ThisFunctionCalling(String a)
	{
		this(0, 0, 0, a, a);
		System.out.println("This is 1st Constructor");
	}
	
	ThisFunctionCalling(int a, String b)
	{
		this("String a");
		System.out.println("This is 2nd Constructor");
	}
	
	ThisFunctionCalling(int e, int c, double d, String a, String b )
	{
		System.out.println("This is 3rd Constructor");
	}

	public static void main(String[] args) {
		
		ThisFunctionCalling obj = new ThisFunctionCalling(10, "String b");
		
		
	}

}
