package test1;

interface Test{
	public void check();
	public void hide();
	default void display() {
		System.out.println("Hello, to DisplayTest something");
	}
	public static void scan() {                   //No need implements in main claass
		System.out.println("Hello, to ScanTest something");
	}
}
interface Show{
	public void view();
	abstract void know();
	public void hide();
	default void display() {
		   System.out.println("Hello, to DisplayShow something");
		}
	public static void scan(String s1, String s2) {                    //No need implements in main claass
		System.out.println(s1.concat(s2) +"Hello, to ScanTest something");
	}
}
public class InterfaceMethods implements Test, Show {
    
	//@Override
	public void check() {
		// TODO Auto-generated method stub
		System.out.println("Hello, to Check something");
	}
	// @Override
	public void view() {
		 // TODO Auto-generated method stub
		System.out.println("Hello, to View something");
	}
	//@Override
	public void know() {
		// TODO Auto-generated method stub
		System.out.println("Hello, to know something");
	}
	// @Override
	public void hide() {
		// TODO Auto-generated method stub
		 System.out.println("Hello, to Hide something");
	}
	public void display(){
		System.out.println("Hello, to DisplayMain something");
		Test.super.display();
		Show.super.display();
		
	}
	
	public static void main(String[] args) {
		  InterfaceMethods obj = new InterfaceMethods();
		  obj.check();
		  obj.view();
		  obj.know();
		  obj.hide();
		  obj.display();
		  Test.scan();          //No need to create object for Static
		  Show.scan("Yogeshwari ", "Karnan");
		  
		}
	
}
