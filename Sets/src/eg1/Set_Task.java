package eg1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set_Task {

	public static void main(String[] args) {
		
		Set<String> hs = new HashSet<>();
		hs.add("hello");
		hs.add("hello");
		hs.add(null);
		hs.add(null);
		hs.add("hey");
		hs.add("hi");
		hs.add("java");
		hs.add(null);
		hs.add("jee");
		hs.add("jme");
		hs.add("spring");
		hs.add("alpha");
		hs.add("hibernate");
		hs.add("java");
		hs.add(null);
		System.out.println("hs : "+hs);
		
		Set<String> lhs = new LinkedHashSet<>();
		lhs.add("hello");
		lhs.add("hello");
		lhs.add(null);
		lhs.add(null);
		lhs.add("hey");
		lhs.add("hi");
		lhs.add("java");
		lhs.add(null);
		lhs.add("jee");
		lhs.add("jme");
		lhs.add("spring");
		lhs.add("alpha");
		lhs.add("hibernate");
		lhs.add("java");
		lhs.add(null);
		System.out.println("lhs : "+lhs);
		
		Set<String> ts = new TreeSet<>();
		ts.add("hello");
		ts.add("hello");
		//ts.add(null);
		//ts.add(null);
		ts.add("hey");
		ts.add("hi");
		ts.add("java");
		//ts.add(null);
		ts.add("jee");
		ts.add("jme");
		ts.add("spring");
		ts.add("alpha");
		ts.add("hibernate");
		ts.add("java");
		//ts.add(null);
		System.out.println("hs : "+ts);
		
		System.out.println(ts.size());
		System.out.println(ts.contains("hi"));
		System.out.println(ts.contains("java8"));
		ts.remove("jme");
		System.out.println(ts);
		
		//addAll()
		Set<String> ts1 = new TreeSet<>(ts);
		System.out.println("\nts1 : "+ts1);
		ts1.addAll(ts);
		System.out.println("ts1 : "+ts1);
		ts1.add("omega");
		ts1.add("java1.8");
		ts1.add("food");
		System.out.println("ts1 = "+ts1);
		System.out.println("ts = "+ts);
		
		//RemoveAll()
		ts1.removeAll(ts);
		System.out.println("ts1 after removalAll = "+ts1);
		
		
		//RetainAll()
		ts.retainAll(ts1);
		System.out.println("ts1 after retainAll = "+ts1);
	}

}
