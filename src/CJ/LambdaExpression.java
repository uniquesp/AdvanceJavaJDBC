package CJ;

interface ABC{
	void show();
	
}


public class LambdaExpression {
	public static void main(String[] args) {
		
		ABC obj = () -> System.out.println("Interface without using class for printing method void show");
		obj.show();
	}
}
