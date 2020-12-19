package eg2;

import java.util.Scanner;


public class Loops {
	public static void main(String[] args) {

		Scanner user1 = new Scanner(System.in);
		System.out.println("Please enter an integer : ");
		int range = user1.nextInt();
		
		boolean val = true;
		
		oddNum(range);
		
		Fibonacci(range);
		
		Scanner user2= new Scanner(System.in);
		System.out.println("\nPlease enter a name or value : ");
		String name = user2.nextLine();
		String result = name.toLowerCase();
		
		
		Palindrome(result, val);
		
	}
	
	public static void oddNum(int range) {
		System.out.println("\nThese are the odd numbers ranging from 0 to " + range);
		for (int i=0; i<range; i++) {
			if (i%2==1) {
				System.out.println( i );
			}
			
		}
	}
	
	public static void Fibonacci(int range) {
		System.out.println("\nThese are the fibonacci numbers ranging from 0 to " + range);
		int num1=0;
		int num2=1;
		int fibosum;
		for (int j=0; j<range; j++) {
			if (j==0) {
				System.out.println(j);
			}
			else if (j==1) {
				System.out.println(j);
			}
			else if (j > 1) {
				fibosum = num1 + num2;
				num1 = num2;
				num2 = fibosum;
				System.out.println( fibosum );
			}
		}
	}
	
	public static void Palindrome(String value ,boolean example) {
		
		int j = value.length()-1;
		for (int i=0; i < value.length()/2; i++) {
			
			if (value.charAt(i) == value.charAt(j)) {
				example = true;
				j--;
			}
			else {
				example = false;
				break;
			}
		}
		System.out.println("\nIs it Palindrome, true or false : ");
		System.out.println(example);
	}	
	
}
