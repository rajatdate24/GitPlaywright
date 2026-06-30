package module1;

public class LocalVsGlobalVariable {
	
	int b = 20; // global variable
	
	public static void main(String[] args) {
		
		int a = 10; // local variable
		
		System.out.println("Local variable a: " + a);
		
		LocalVsGlobalVariable obj = new LocalVsGlobalVariable();
        System.out.println("Global variable b: " + obj.b);
        
       
	}

}
