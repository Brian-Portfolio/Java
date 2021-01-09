package eg1;

import java.util.Comparator;

public class FlightAvailabilityComparator implements Comparator<Flight>{

	@Override 
	public int compare(Flight o1, Flight o2) {
		Boolean b1 = o1.isavailability();
		Boolean b2 = o2.isavailability();
		return b1.compareTo(b2);
	}
	
}
