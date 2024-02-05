package Collection;
import java.util.*;

public class ComparableInterface {

	
		public static void main(String[] args) {
			ArrayList<Emp> emp = new ArrayList<>();
			emp.add(new Emp(6,"sp","22334812"));
			emp.add(new Emp(46,"up","1334812"));
			emp.add(new Emp(16,"ab","22334866"));
			System.out.println(emp);
			Collections.sort(emp);
			System.out.println("Sorted by id: "+emp);
			Collections.sort(emp,new ComparatorInterface());
			System.out.println("Sorted by name: "+emp);
			
			
		}
}
