package module1;

public class Static_NonStatic_Constrctor {
	
	static void add() {
        System.out.println("Static Method");
    }
	
	void sub () {
        add();
        System.out.println("Non Static Method");
    }
	
	Static_NonStatic_Constrctor()
	{
		System.out.println("Constructor");	
	}
	
	
	public static void main(String[] args) {
		
		Static_NonStatic_Constrctor a1 = new Static_NonStatic_Constrctor (); // Object Creation
		a1.sub(); // Calling Non Static Method
		
	
	}

}
