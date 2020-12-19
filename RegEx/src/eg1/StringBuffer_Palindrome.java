package eg1;

public class StringBuffer_Palindrome {
	
	public static void main(String[] args) {
		
		String s ="";

		StringBuffer sb = new StringBuffer(s);

		System.out.println("Printing all Palindrome values between 1000 and 9999");
		for (int num = 1000;num<=9999;num++) {
			s=num+"";
			if (new StringBuffer(s).reverse().toString().equals(s)) {
				System.out.println(s);
			}

		}
	}
}
