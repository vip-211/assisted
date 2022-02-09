package demo;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class EmailValidation {
	
	
		    public static boolean isValidEmail(String mail) {
			   String regex = "^(.+)@(.+)$";
			
		       Pattern pattern = Pattern.compile(regex);
		       Matcher matcher = pattern.matcher(mail);
		       return matcher.matches();

		       
		   }

		   public static void main(String[] args) {
		       List<String> emails = new ArrayList<String>();
		       // valid email addresses
		       emails.add("Bbhushanw@example.com");
		       emails.add("nileshm@example.com");
		       emails.add("nil@example.me.org");
		       //invalid email addresses
		       emails.add("tejas.example.com");
		       emails.add("lokesh.bob@example.com");
		       emails.add("ronak@example.com");

		       for (String value : emails) {
		           System.out.println("The Pre-Email address " + value + " is " + (isValidEmail(value) ? "valid" : "invalid"));
		       }
		       
		       System.out.println("Enter any email address to check");
		       Scanner sr1 = new Scanner(System.in);
		       String input = sr1.nextLine();
		       System.out.println("The Email address " + input + " is " + (isValidEmail(input) ? "valid" : "invalid"));
		       
		   }
		   
}
