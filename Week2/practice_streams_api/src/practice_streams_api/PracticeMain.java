package practice_streams_api;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PracticeMain {
	
	public static void main(String[] args) {
		
		Stream<Integer> stream = Stream.of(new Integer[] {1,2,3,4,5,6,7,8,9,10});
		stream.forEach(p->System.out.println(p));
		
		Stream<String> stream1 = Stream.of("A B C D E F G H".split(" "));
		stream1.forEach(p -> System.out.println(p));
		
		List<String> Names = new ArrayList<>();
		Names.add("Lola");
		Names.add("Jake");
		Names.add("John");
		Names.add("Phillip");
		Names.add("Austin");
		Names.add("Ryan");
		Names.add("Joe");
		Names.add("Rivers");
		Names.add("James");
		
		Names.stream().filter((s)->s.startsWith("J")).forEach(s->System.out.println(s));
		Names.stream().filter((s1)->s1.startsWith("J")).map(s1->s1.toUpperCase()).forEach(s1->System.out.println(s1));
		
		List<String> listNames = Names.stream().sorted().map(s2->s2.toUpperCase()).collect(Collectors.toList());
		System.out.println(listNames);
		
		boolean matchResult = Names.stream().anyMatch((s3)->s3.startsWith("J"));
		System.out.println(matchResult);
		
		matchResult = Names.stream().allMatch((s4)->s4.startsWith("J"));
		System.out.println(matchResult);
		
		matchResult = Names.stream().noneMatch((s5)->s5.startsWith("J"));
		System.out.println(matchResult);
		
		
		}
	
	
	
}
