package creatingMethods;

public class MyUtils {
	public static void stringMethod() {
		System.out.println("snsdndflijgxlvs");
	}
	
	public static void stringMethod(String str) {
		System.out.println("snsdndflijgxlvs");
	}
	
	public void add10(int i) {
		System.out.println("added value " +(i+10) );
	}
	// method overrding is the concept this is to use the properties of super call in its base classes. 
	 static int stringMethod1(int j) {
		System.out.println("It is an integer method");
		return j;
	}
	public static int sum2numbers(int i, int j) {
		return i+j;
	}
}
