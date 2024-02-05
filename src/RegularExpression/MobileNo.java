package RegularExpression;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class MobileNo {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		Pattern pt = Pattern.compile("^[789][0-9]{9}");
		Matcher mc = pt.matcher(s);
		
		System.out.println("String Match for : "+s+ " "+mc.matches());
	}
}
