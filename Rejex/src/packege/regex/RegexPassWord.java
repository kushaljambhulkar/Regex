package packege.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPassWord {
	public static void main(String[] args) {
//		- Last name starts with Cap and has
//		minimum 3 characters
		Pattern p = Pattern.compile("^[A-Z]+[0-9]+[@$&#]{1}\\w{5,}");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Password : ");
		String input = sc.next();
		Matcher matcher = p.matcher(input);
		boolean matchFound = matcher.find();
		if(matchFound)
		{
			System.out.println("This is Valid Entry");
		}
		else
		{
			System.out.println("Please Enter Valid Password!!");
		}
	}
}
