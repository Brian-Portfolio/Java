package lambda_method_demo;

import java.text.Format;
import java.util.ArrayList;
import java.util.List;

public class MethodMain {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(45);
		list.add(67);
		list.add(23);
		list.add(98);
		list.add(100);
		list.add(304);
		list.forEach( (n)->{System.out.println(n);});
		
		
		ConvertFunctional c = (n)->{
			return (n-32)*5.0/9.0;
		};
		System.out.println("Celsius to Fahrenheit : "+c.convert(60));
		
		
		ConvertFunctional c1 = (n)->{
			return n/1.609344;
		};
		System.out.println("kilometers to miles : "+c1.convert(10));
		
		
		StringFunctional S1 = (s)-> "Hello " + s + " !";
		
		stringFormat("Brian",S1);
		
	}
	public static void stringFormat(String string1, StringFunctional str) {
		String resultformat = str.strFormat(string1);
		System.out.println(resultformat);
	}
	
}
