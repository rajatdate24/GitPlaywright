package module1;

public class TypesOfVariables 
{
	static double pi = 3.14; // static variable
	int a = 10; // instance variable
	
	public static void main(String[] args) 
	{
		System.out.println("Static variable a: " + pi);
		TypesOfVariables obj = new TypesOfVariables();	
		System.out.println("Instance variable a: " + obj.a);
	
	}

}
