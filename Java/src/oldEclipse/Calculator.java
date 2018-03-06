package oldEclipse;

public class Calculator {
	
	int arr[]={12,13,14,44};  // Array Declaration
	public double add(double a, double b) {
		return (a+b);
	}	
	public double sub(double a, double b) {
		return (a-b);
	}
	public double into(double a, double b) {
		return (a*b);
	}
	public double div(double a, double b) {
		return (a/b);
	}
	int i=10;
	public void WhileLoop() {
	    while(i>1){
	            System.out.println(i);
	            i--;
	    }
	}
	int j ;
	  public void CreateForEachLoop() {
	      for(int j:arr) {  
	         System.out.println(j);  
	      } 
	      
	String name ="aidjfosjfvosoggfjoeigtoire";
	for (i=name.length()-1;i>=0; i--) {
		System.out.println("char "+ name.charAt(i));
	}
	      for(i=0;i<=100;i+=2) {
	    	  
	    		  System.out.println("Even No:" +i);
	    	  
	      }

}

}
