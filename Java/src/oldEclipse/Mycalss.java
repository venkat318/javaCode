package oldEclipse;

public class Mycalss implements MyInterface{

	
	   public void accept(){
		     System.out.println("This Method by name accept is from interface");
		 }
		  public void Show(){
		     System.out.println("This Method by name show is from interface");
		 }
	public static void main(String[] args)
	{
		Mycalss c = new Mycalss();
		c.accept();
		
		
	}
}
