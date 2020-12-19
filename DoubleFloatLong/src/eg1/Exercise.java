package eg1;

public class Exercise {
	public static void main(String[] args) { 

		Double a1= 10.00000;
		Double a2= 10.00000;
		Double example1 = 10.00000;
		Double a4 = example1;
		Double a3 = new Double(10.00000);
		
		Float b1 = 10.00f;
		Float b2 = 10.00f;
		Float example2 = 10.00f;
		Float b4 = example2;
		Float b3 = new Float(10.00f);
		
		Long c1 = 100000l;
		Long c2 = 100000l;
		Long example3 = 100000l;
		Long c4 = example3;
		Long c3 = new Long(100000l);
		System.out.println("Double values : ");

		System.out.println("a1 = "+a1);
		System.out.println("a2 = "+a2);
		System.out.println("a3 = "+a3);
		
		System.out.println("\nFloat values : ");

		System.out.println("b1 = "+b1);
		System.out.println("b2 = "+b2);
		System.out.println("b3 = "+b3);
		
		System.out.println("\nLong values : ");

		System.out.println("c1 = "+c1);
		System.out.println("c2 = "+c2);
		System.out.println("c3 = "+c3);
		
		//Double
		System.out.println("\nDouble Object a comparison : ");
		
		System.out.print("\na1==a2 same object : "+(a1==a2));
		System.out.print("\na1==a3 same object : "+(a1==a3));
		
		System.out.print("\na1.equals(a2)) same value : "+(a1.equals(a2)));
		System.out.print("\na1.equals(a3)) same value : "+(a1.equals(a3)));
		
		System.out.print("\nsame object : "+(example1 == a4));
		
		System.out.print("\nsame value : "+(example1.equals(a1)));
		
		//Float
		System.out.println("\n\nFloat Object b comparison : ");
		
		System.out.print("\nb1==b2 same object : "+(b1==b2));
		System.out.print("\nb1==b3 same object : "+(b1==b3));
		
		System.out.print("\nb1.equals(b2)) same value : "+(b1.equals(b2)));
		System.out.print("\nb1.equals(b3)) same value : "+(b1.equals(b3)));
		
		System.out.print("\nsame object : "+(example2 == b4));
		
		System.out.print("\nsame value : "+(example2.equals(b4)));
		
		//Long
		System.out.println("\n\nLong Object c comparison : ");
		
		System.out.print("\nc1==c2 : "+(c1==c2));
		System.out.print("\nc1==c3 : "+(c1==c3));
		
		System.out.print("\nc1.equals(c2)) same value : "+(c1.equals(c2)));
		System.out.print("\nc1.equals(c3)) same value : "+(c1.equals(c3)));
		
		System.out.print("\nsame object : "+(example3 == c4));
		
		System.out.print("\nsame value : "+(example3.equals(c4)));
		
		
		
		System.out.print("\n\nContent of Autoboxing : ");
		double z = a1;//Autoboxing/unboxing - the conversion between primitive data type to object type.
		float y = b1;
		long x = c1;
		
		System.out.print("\nx = "+x);
		System.out.print("\ny = "+y);
		System.out.print("\nz = "+z);
		
		z=2000.00;
		a1=z;
		
		y=3000.00f;
		b1=y;
		
		x=4000;
		c1=x;

		//System.out.println("\ni1 = "+i1);
		System.out.println("\n\na1 = "+a1);
		System.out.println("b1 = "+b1);
		System.out.println("c1 = "+c1);
		
		//Double Max and Min value
		System.out.println("\nMAX AND MIN DOUBLE OBJECT CLASS :");
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		
		//Float Max and Min value 
		System.out.println("\nMAX AND MIN FLOAT OBJECT CLASS :");
		System.out.println(Float.MAX_VALUE);
		System.out.println(Float.MIN_VALUE);
		
		//Long Max and Min value 
		System.out.println("\nMAX AND MIN LONG OBJECT CLASS :");
		System.out.println(Long .MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		
		
		//Java reads everything as String and Java writes everything as String
		System.out.println("\n\nParse Method Used : ");
		String s="33";
		int age=Integer.parseInt(s); //similar method in all other Wrapper classes except Character.
		double age1=Double.parseDouble(s);
		float age2=Float.parseFloat(s);
		long age3=Long.parseLong(s);
		System.out.println("\nage = "+age);
		System.out.print("\nage parsed double : "+ age1);
		System.out.print("\nage parsed float : "+ age2);
		System.out.print("\nage parsed long : "+ age3);
		
		Double i1=1000.00; 
		Float i2=1000f;
		Long i3=1000l;
		
		System.out.println("\n\nDouble to hex conversion : "+Double.toHexString(10));
		
		System.out.println("Float to hex conversion : "+Float.toHexString(10));
		
		System.out.println("Long to binary conversion : "+Long.toBinaryString(10));
		System.out.println("Long to hex conversion : "+Long.toHexString(10));
		System.out.println("Long to octal conversion : "+Long.toOctalString(10));
	
		
		System.out.println("\nDouble Compare to Method : ");
		System.out.println("\ni1 = "+i1);
		System.out.println("i5.compareTo(1000) "+i1.compareTo(1000d));
		System.out.println("i5.compareTo(2000) "+i1.compareTo(2000d));
		System.out.println("i5.compareTo(100) "+i1.compareTo(100d));
		
		System.out.println("\nFloat Compare to Method : ");
		System.out.println("\ni1 = "+i2);
		System.out.println("i5.compareTo(1000) "+i2.compareTo(1000f));
		System.out.println("i5.compareTo(2000) "+i2.compareTo(2000f));
		System.out.println("i5.compareTo(100) "+i2.compareTo(100f));
		
		System.out.println("\nLong Compare to Method : ");
		System.out.println("\ni1 = "+i3);
		System.out.println("i5.compareTo(1000) "+i3.compareTo(1000l));
		System.out.println("i5.compareTo(2000) "+i3.compareTo(2000l));
		System.out.println("i5.compareTo(100) "+i3.compareTo(100l));
		
	}
	
}