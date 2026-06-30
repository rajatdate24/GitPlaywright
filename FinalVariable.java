package module1;

public class FinalVariable 
{
	
	static int a = 10; // instance variable

	
	public static void main(String[] args) 
	{
		final int a = 100;
		System.out.println(a); // local variable
		
		
		FinalVariable.a = 20; // instance variable
		System.out.println(FinalVariable.a); // instance variable
				
	}

}
