package packege.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPhoneNumber {

	public static void main(String[] args) {
//		As a User need to
//		follow pre defined Mobile Format
		//Pattern p = Pattern.compile("^[0-9]{2}\\\\s[0-9]{10}");
		String[] testStrings = {
		        /* Following are valid phone number examples */         
		        "(123)4567890", "1234567890", "123-456-7890", "(123)456-7890",
		        /* Following are invalid phone numbers */
		        "(1234567890)","123)4567890", "12345678901", "(1)234567890",
		        "(123)-4567890", "1", "12-3456-7890", "123-4567", "Hello world"};
		Pattern p = Pattern.compile("(?:\\(\\d{3}\\)|\\d{3}[-]*)\\d{3}[-]*\\d{4}");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your Phone Number here : ");
		String input = sc.next();
		Matcher matcher = p.matcher(input);
		//boolean matchFound = matcher.find();
		for(String str : testStrings)
		{
			if(p.matcher(str).matches())
			{
				System.out.println("This is Valid Entry");
			}
			else
			{
				System.out.println("Please Enter Valid Phone Number!!");
			}
		}
	}
}
