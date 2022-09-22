package packege.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEmail {
	public static void main(String[] args) {
//		As a User need to
//		enter a valid email
		Pattern p = Pattern.compile("^(abc)[.]?[a-z]*@(bl.co)[.]?[a-z]{0,2}$");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your Email Address here : ");
		String input = sc.next();
		Matcher matcher = p.matcher(input);
		boolean matchFound = matcher.find();
		if(matchFound)
		{
			System.out.println("This is Valid Entry");
		}
		else
		{
			System.out.println("Please Enter Valid Email Address!!");
		}
	}
}
