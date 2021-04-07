package test1;

interface Test1{
	default void display() {
		System.out.println("Hello, to DisplayTest something");
	}
}
interface Show1{
	public static void scan1(String s1, String s2) {                    //No need implements in main claass
		System.out.println(s1.concat(s2) + "Hello, to ScanTest something");
	}
}
public class InterfaceMethodEg1 implements Test1 {
	
	public static void main(String[] args) {
		InterfaceMethodEg1 obj1 = new InterfaceMethodEg1();
		obj1.display();
	    Show1.scan1("Yogeshwari ", "Karnan ");             ////No need to create object for Static
	}
}
