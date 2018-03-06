package creatingMethods;
import saibersysJava.CreatingVariables;

public class LearningMethods {

	public static void main(String[] args) {
		
		MyUtils method = new MyUtils();
		System.out.println("sfasgdgdgdgd");
		MyUtils.stringMethod();
		MyUtils.stringMethod("My name is venkat");
		
		method.add10(5);
		
			
		int i = MyUtils.sum2numbers(10, 20);
		System.out.println("sum of 2 numbers "+ i);
		CreatingVariables.someMethod();
	}

}
