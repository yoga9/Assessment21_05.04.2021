package test1;

public interface InterfaceMethodEg3 {
      public static void main(String[] args) {
    	  
		System.out.println("Hello, This is Interface Main Method");
	    A1.show(5,5);
}
}

interface A1
{
	public static void show(int a, int b) {
		System.out.println("Static Method " +(a+b));
	}
}
