package eg1;

import java.util.Scanner;

public class Regex {

	public static void main(String[] args) {
		
		Scanner user1 = new Scanner(System.in);
		System.out.println("Please enter your SSN number to validate in the form of (XXX-XX-XXXX): ");
		String s1 = user1.nextLine();
		
		if (s1.matches("[0-9]{3}-[0-9]{2}-[0-9]{4}")){
			System.out.println("Social Security Number Validated");
		}else {
			System.out.println("Social Security Number Invalidated");
		}
		
		
		Scanner user2 = new Scanner(System.in);
		System.out.println("\n\nPlease enter your DL number to validate in the form of (O-XXX-XXX-XXX-XXX): ");
		System.out.println("O - represents a capital letter A-Z, X - represents numbers 0-9 ");
		String s2 = user2.nextLine();
		
		if (s2.matches("[A-Z]{1}-[0-9]{3}-[0-9]{3}-[0-9]{3}-[0-9]{3}")) {
			System.out.println("Drivers License Number Validated");
		}else {
			System.out.println("Drivers License Number Invalidated");
		}
		
	}
}
