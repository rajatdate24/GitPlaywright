package module1;

public class AccessNonStaticMethod {
	
	
	void Login()
	{
		System.out.println("Login Method");
	}
	
	void Logout() 
	{
		System.out.println("Logout Method");
	}
	
	static void registration()
	{
		System.out.println("Registration Method");
	}
	
	public static void main(String[] args) {
		
		AccessNonStaticMethod m1 = new AccessNonStaticMethod();	// Object Creation
		m1.Login();		// Calling Non Static Method
		m1.Logout();	// Calling Non Static Method
		
		registration();	// Calling Static Method
			
	}

}
