package packege.regex;

import java.util.*;
import java.util.regex.*;

public class RegexFirstName {
//	As a User need to
//	enter a valid First
//	Name
	
	public static void main(String[] args) {
//		- First name starts with Cap and has
//		minimum 3 characters
		Pattern p = Pattern.compile("^[A-Z][a-z]{2,}");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your First Name : ");
		String input = sc.next();
		Matcher matcher = p.matcher(input);
		boolean matchFound = matcher.find();
		if(matchFound)
		{
			System.out.println("This is Valid Entry");
		}
		else
		{
			System.out.println("Please Enter Valid First Name!!");
		}
	}
	
}
