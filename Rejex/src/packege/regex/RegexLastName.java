package packege.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexLastName {
	public static void main(String[] args) {
//		- Last name starts with Cap and has
//		minimum 3 characters
		Pattern p = Pattern.compile("^[A-Z][a-z]{2,}");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Last Name : ");
		String input = sc.next();
		Matcher matcher = p.matcher(input);
		boolean matchFound = matcher.find();
		if(matchFound)
		{
			System.out.println("This is Valid Entry");
		}
		else
		{
			System.out.println("Please Enter Valid Last Name!!");
		}
	}
}
