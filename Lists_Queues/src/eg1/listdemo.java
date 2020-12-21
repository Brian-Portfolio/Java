package eg1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class listdemo {

		
		public static void main(String[] args) {
			
			List<Double> l1= new LinkedList();
			l1.add(905d);
			l1.add(56d);
			l1.add(345d);
			l1.add(67d);
			l1.add(24d);
			l1.add(56d);
			l1.add(234.67d);
			System.out.println("array l1 : "+ l1);
			int x1 = l1.size();
			System.out.print("size of array after adding : "+x1);
			
			l1.remove(0);
			l1.remove(4);
			
			System.out.println("\n\narray l1 : "+ l1);
			int x2 = l1.size();
			System.out.print("size of array after deleting : "+x2);
			
			Collections.reverse(l1);
			System.out.println("\n\nReversed array of l1 : "+l1);

			System.out.println("\nTraversing using for loop");
			for (int j = 0; j < l1.size(); j++) {
				System.out.print(l1.get(j)+" ");
			}
			
			System.out.println("\n\nTraversing using for-each loop");
			for (Double j:l1) {
				System.out.print(j+" ");
			}
			System.out.println(l1);
			
			List<Integer> l2 = new LinkedList();
			l2.add(34);
			l2.add(56);
			l2.add(345);
			l2.add(null);
			l2.add(24);
			l2.add(null);
			l2.add(234);
			l2.add(68);
			l2.add(456);
			System.out.println("\narray l1 : "+ l2);
			int x3 = l2.size();
			System.out.print("size of array after adding : "+x3);
			
			Collections.replaceAll(l2, null, 0);
			
			int nullvar = 56;
			for(int i = 0;i<l2.size();i++) {
					int element = l2.get(i);
					if (element == nullvar) {
						l2.remove(i);
				}
			}
			
			System.out.println("\n\nReplacement of null and removable of element : " +l2);
			
			Integer max =Collections.max(l2);
			Integer min =Collections.min(l2);
			System.out.println("\nMax number of array l2 : "+max);
			System.out.println("\nMin number of array l2 : "+min);
			
			
			
			ArrayList<String> carmodels = new ArrayList();
			carmodels.add("Volvo");
			carmodels.add("BMW");
			carmodels.add("Ford");
			carmodels.add("Mazda");
			carmodels.add("Toyota");
			carmodels.add("Honda");
			System.out.println("\nArrayList : "+carmodels);
			
			System.out.println("carmodels index of 0 is : "+carmodels.get(0));
			carmodels.set(0, "Tesla");
			System.out.println("Update carmodel Volvo to : "+carmodels.get(0));
			System.out.println("\nupdated car model : "+carmodels);
			
			System.out.println("\nIterating carmodels using Iterator");
			Iterator<String> it= carmodels.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
		}
}

