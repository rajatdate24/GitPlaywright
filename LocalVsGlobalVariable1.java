package module1;

public class LocalVsGlobalVariable1 
{
	static int a = 10; // instance variable
	int b = 20;
	
	public static void main(String[] args) {
		
		int a= 100;
		System.out.println(a); // local variable);
		
		System.out.println(LocalVsGlobalVariable1.a); // instance variable);
		System.out.println(new LocalVsGlobalVariable1().b); // instance variable);
	}

}
