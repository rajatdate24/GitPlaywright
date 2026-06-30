package module1;

public class NonStaticMethodAccessFromDiffClass {

	public static void main(String[] args) {
		
		AccessNonStaticMethod r1	= new AccessNonStaticMethod();	// Object Creation
		r1.Login();		// Calling Non Static Method
		r1.Logout();	// Calling Non Static Method
		
		
	}
}
