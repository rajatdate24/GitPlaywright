package module1;

public class CombinationofMethods {
	
	static void add() {
		System.out.println("Static Method");
	}
	
	void sub() {
		add();
		System.out.println("Non Static Method");
	}		
	
	
	public static void main(String[] args) {
		
		CombinationofMethods obj = new CombinationofMethods(); // Object Creation
		obj.sub(); // Calling Non Static Method
	}

}
