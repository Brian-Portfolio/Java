package eg1;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class listarrays_tasks {

	public static void main(String[] args) {
		
	
	
	List<Integer> array1= new LinkedList();
	Random rand = new Random();
	
	for(int i=0;i<10;i++) {
		int randnum = rand.nextInt(1000);
		array1.add(randnum);
	}
	System.out.println("Print contents of array1 : "+array1);
	
	//task1
	Collections.reverse(array1);
	System.out.println("Reverse order of array1 : "+array1);
	
	//task2
	Scanner user = new Scanner(System.in);
	System.out.println("\nPlease enter an integer value you want to delete : ");
	int value = user.nextInt();
	
	for (int j=0;j<array1.size();j++) {
		int element = array1.get(j);
		if (element == value) {
			array1.remove(j);
		}
	}
	System.out.println("Printing contents of array1 after deletion : ");
	System.out.print(array1);
	
	//task3,task4
	List<Integer> Evenarray= new LinkedList();
	System.out.print("\n\nPrinting contents of even numbers : ");
	for (int e=0;e<array1.size();e++) {
		int element1 = array1.get(e);
		if (element1%2==0) {
			System.out.print(element1+" ");
			Evenarray.add(element1);
		}
	}
	int Evensum = 0;
	for(int k =0;k<Evenarray.size();k++) {
		int element3 = Evenarray.get(k);
		Evensum = Evensum + element3;
	}
	
	System.out.println("\n\nSum of Even numbers is : "+Evensum);
	
	
	List<Integer> Oddarray= new LinkedList();
	System.out.print("\nPrinting contents of odd numbers : ");
	for (int o=0;o<array1.size();o++) {
		int element2 = array1.get(o);
		if (element2%2==1) {
			System.out.print(element2+" ");
			Oddarray.add(element2);
		}
	}
	
	int OddSum = 0;
	for (int n=0;n<Oddarray.size();n++) {
		int element4 = Oddarray.get(n);
		OddSum = OddSum + element4;
	}
	
	System.out.println("\n\nSum of Odd numbers is : "+OddSum);
	
	
	//task5
	Integer max = Collections.max(array1);
	Integer min = Collections.min(array1);
	System.out.println("\nMax number of array1 : "+max);
	System.out.println("\nMin number of array1 : "+min);

	
	//task6
	//StringBuffer sb = new StringBuffer();
	List<Integer> palindromearray= new LinkedList();
	System.out.print("\nPrinting contents of palindrome numbers : ");
	
	for (int num =0;num<array1.size();num++) {
		int element5 = array1.get(num);
		String str = String.valueOf(element5);
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		String s1 = sb.toString();
		if (str.equals(s1)) {
			int number = Integer.parseInt(str);
			palindromearray.add(number);
			System.out.print(number + " ");
		}
	}
	
	
	}
}
