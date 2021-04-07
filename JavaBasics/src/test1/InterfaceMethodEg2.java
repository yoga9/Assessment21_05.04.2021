package test1;

interface A{
	public void display();
}
interface B{
	public void check();
	default int display(int k, int y) {
		int b = k*y;
		return b;
	}
	
}
interface C{
		public void check();
		public int hide();
		default void display() {
			   System.out.println("Hello, to DisplayShow something");
			}
}
public class InterfaceMethodEg2 implements B, C, A  {

	@Override
	public int hide() {
		// TODO Auto-generated method stub
		System.out.println("Hello, to Hide something");
		return 0;
	}

	@Override
	public void check() {
		// TODO Auto-generated method stub
		System.out.println("Hello, to Check something");
	}
	
	public void display(){
		System.out.println("Hello, to DisplayMain something");
		System.out.println("The Class B Display " +B.super.display(5,5));
		C.super.display();
		}
     
	public static void main(String[] args) {
		InterfaceMethodEg2 obj = new InterfaceMethodEg2();
		obj.check();
		obj.display();
        obj.hide();
		
	}

}
