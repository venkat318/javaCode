package oldEclipse;

public class Callingmethods {
	
    public byte b = 1;
	public short s = 2;
	public int i = 4;
	public float f = 4.333F;
	public long l = 8;
	public double d = 8.45646546d;
	public char ch = '2';
	public boolean bo = true;
	public String S = "NonPremetive";
	
	public void draw() // method signature
	{
//		method body
	}
	//creating method with no return type and with parameter	
	public void draw1(int i) { // void and parameters
	       
	 }

	public void AddShape(int i, String y) {
	       
	 }
//	creating method with return type and no parameter
	  public int drawShape() { //method 1  
	      return 2;
	   }

	 public int drawShape2() { // method 2
	      int result=1;    
	      return result;
	   }
//	 creating method with return type and parameter:
	 public int drawShape3(int x) {
		    
	      return 2;
	   }
	//use variable after return keyword
	 public int drawShape4(int x, String y) {
	     int result;    
	     result = x * 2;
	       return result;
	   }
	 

}
