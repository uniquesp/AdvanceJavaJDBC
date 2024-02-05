package RegularExpression;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Emailvalidations{
	
	private Pattern pt;
	private Matcher mc;
	private static final String Email_Pattern = "^[_A-Za-z0-9-\\+]+(\\.[A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
	
	
	public Emailvalidations() {
		pt = Pattern.compile(Email_Pattern);
	}
	
	public boolean validate (final String hex) {
		mc = pt.matcher(hex);
		return mc.matches();	
	}
}


public class EmailValidator {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your mail to validate: ");
		String email = sc.nextLine();
		
		Emailvalidations obj = new Emailvalidations();
		boolean isValid = obj.validate(email);

        if (isValid) {
            System.out.println("Email is valid.");
        } else {
            System.out.println("Email is not valid.");
        }
		
		
		
		
	}
}
