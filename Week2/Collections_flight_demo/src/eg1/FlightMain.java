package eg1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FlightMain {
	
	public static void main(String[] args) {
		
		List<Flight> flightList = new ArrayList<>();
		flightList.add(new Flight(100, "American", "Boeing", 100.11, 6, true));
		flightList.add(new Flight(200, "Delta", "Airbus", 200.11, 4, false));
		flightList.add(new Flight(101, "Southwest", "Boeing", 190.11, 5, false));
		flightList.add(new Flight(140, "Emirates", "UAE", 190.11, 3, true));
		flightList.add(new Flight(120, "Spirit", "American", 190.11, 5, false));
		flightList.add(new Flight(199, "AirCanada", "Canada", 200.11, 4, true));
		flightList.add(new Flight(166, "JetBlue", "Airbus", 140.11, 3, true));
		flightList.add(new Flight(133, "BritishAirways", "Britain", 110.11, 2, true));
		
		
		System.out.println("Printing all the flights");
		printProducts(flightList);

		Collections.sort(flightList); // uses Functional Interface Comparable using which it compares 2 objects
		System.out.println("\n\nPrinting all the flights sorted by id");
		printProducts(flightList);
		
		Collections.sort(flightList, new FlightAvailabilityComparator());
		System.out.println("\n\nPrinting all the flights sorted by availability");
		printProducts(flightList);

		Collections.sort(flightList, (Flight p1, Flight p2) -> {
			Double d1 = p1.getCost();
			Double d2 = p2.getCost();
			return d1.compareTo(d2);
		});
		
		
		System.out.println("\n\nPrinting all the flights sorted by cost(low to high)");
		printProducts(flightList);
		
		Collections.sort(flightList, (Flight p1, Flight p2) -> {
			int x = 0;
			Float f1 = p1.getRatings();
			Float f2 = p2.getRatings();
			x = f2.compareTo(f1);
			if (x == 0) {
				Double d1 = p1.getCost();
				Double d2 = p2.getCost();
				x = d1.compareTo(d2);
			}
			return x;
		});
		System.out.println("\n\nPrinting all the flights sorted by ratings(high to low) and if 2 or more flightss have same rating then by cost(low to high)");
		printProducts(flightList);

	}
		
	public static void printProducts(List<Flight> flightList) {
		for (Flight p : flightList) {
			System.out.println(p);
		}
	}
		
}
	

