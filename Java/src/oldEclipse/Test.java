package oldEclipse;
class Personal 
{
	private String name,gender;
	private int age;
	public Personal(String n,String g,int a){
		name=n;
		gender=g;
		age=a;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	protected String getGender() {
		return gender;
	}
	public void setGender(String g) {
		this.gender = g;
	}
	public int getAge() {
		return age;
	}
}
//Child Class
//Here Academic class created as sub class/derived class/child class 

class Academic extends Personal

//super class (Personal),Derived class(Academic)
{
	private String standard,university;
	
	public Academic(String a,String u,String name,String g,int ag){
		super(name,g,ag);
		standard=a;
		university=u;
	}

	public String getStandard() {
		return standard;
	}

	public String getUniversity() {
		return university;
	}

}
public class Test
{
	 public static void main(String args[]) {
	    	Academic a=new Academic("B.tech","JNTU","rakesh","male",21);
	    	System.out.println(a.getName());
	    	System.out.println(a.getStandard());
	    	System.out.println(a.getUniversity());
	    	a.setName("ravi");
	    	System.out.println(a.getName());
	    	a.setGender("woman");
	    	System.out.println(a.getGender());
	    	
	    	System.out.println(a.getAge());
	 }
}

	
	
	
	
	
