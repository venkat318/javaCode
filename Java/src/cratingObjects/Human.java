package cratingObjects;

public class Human {

		String name;
		int age;
		int heightininc;
		String eyecolor;
	

	public Human(String name, int age, int heightininc, String eyecolor) {
			super();
			this.name = name;
			this.age = age;
			this.heightininc = heightininc;
			this.eyecolor = eyecolor;
		}
	public void speak() {
		System.out.println("My name is "+ name);
		System.out.println("age in yrs"+ age);
		System.out.println("height in inches " +heightininc);
		System.out.println("eyecolor" + eyecolor);
	}
	public void eat() {
		System.out.println("eating...");
	}
	
	public void walk() {
		System.out.println("walking...");
	}
	public void work() {
		System.out.println("working....");
	}

}
