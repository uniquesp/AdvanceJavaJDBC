package CJ;


class Outer{
	int n = 20;
	
	public void display() {
		System.out.println(" Outer Class - Display Method");
	}
	
	class Inner{
		
		int a = 10;
		public void display() {
			System.out.println(" Inner Class - Display Method");
		}
	}
}



public class InnerClass {
	public static void main(String[] args) {
		
		Outer obj = new Outer(); //object of outer class
		obj.display();
		System.out.println(obj.n);
		//System.out.println(obj.a); //error
		System.out.println();
		
		//Inner obj1 = new Inner();
		//Outer.Inner obj1 = new Inner();
		//above both statement gives error
		
		Outer.Inner obj2 = obj.new Inner();
		obj2.display();
		System.out.println(obj2.a);
		//System.out.println(obj2.n); error
		System.out.println();
		
		
		//Outer obj3 = new Inner();
	}
}
