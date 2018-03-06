package oldEclipse;

public class Objects {


	
	public static void main(String[] args) {
		
		
		Callingmethods data = new Callingmethods();
		data.S = "new Non premetive";
		data.s = 2;
		int x = data.s;//reading data.s property 
		String str = data.S;////we are reading "S" property value and store into variable "str".
		
//		calling method with void and no parameter
		data.draw();

		//		calling method with void and parameter
		data.draw1(4);
		data.AddShape(4, "4");

		//		calling method with return type and no parameter
		int var = data.drawShape();
		var = data.drawShape2();

		 //		calling method with return type and parameter
		 var = data.drawShape4(4, "4nonprimitive");
		 var = data.drawShape3(4);
		 
		 
		 
		
	}
	
	 


	
}

