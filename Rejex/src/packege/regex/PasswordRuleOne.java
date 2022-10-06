package packege.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//UC5 - UC8
//Rule1 - As a User need to follow pre-defined Password rules.
//Rule2 – Should have at least 1 Upper Case - NOTE – All rules must be
//Rule3 – Should have at least 1 numeric number in the password - NOTE – All rules must be passed
//Rule4 – Has exactly 1 Special Character
public class PasswordRuleOne {

    public static void main(String[] args) {
        Pattern p = Pattern.compile("^(?=.*[A-Z])(?=.*[0-9])(?=.*[@$!%*?&]{1})[A-Za-z0-9@$!%*?&]{8,}");
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
