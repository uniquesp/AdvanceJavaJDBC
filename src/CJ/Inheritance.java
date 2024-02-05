package CJ;


class parent{
//	int salary=20;
	
	void display(){
		System.out.println("Parent");
		}
}

class child extends parent{
	
	int salary=200;
	
	void display(){
	System.out.println("Child");
	}
	
}




public class Inheritance {
	public static void main(String args[]) {
		
		child obj = new child();
		System.out.println(obj.salary);
		
		parent obj1 = new child();
		obj1.display();
		//System.out.println(obj1.salary);
	
	
	}
		
}
