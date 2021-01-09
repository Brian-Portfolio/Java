package eg1;

public class Flight implements Comparable<Flight> {
	
	private int id;
	private String name;
	private String manufactureName;
	private double cost;
	private float ratings;
	private boolean availability;
	
	public Flight() {
		super();
		
	}

	public Flight(int id, String name, String manufactureName, double cost, float ratings, boolean availability) {
		super();
		this.id = id;
		this.name = name;
		this.manufactureName = manufactureName;
		this.cost = cost;
		this.ratings = ratings;
		this.availability = availability;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getManufactureName() {
		return manufactureName;
	}

	public void setManufactureName(String manufactureName) {
		this.manufactureName = manufactureName;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public float getRatings() {
		return ratings;
	}

	public void setRatings(float ratings) {
		this.ratings = ratings;
	}

	public boolean isavailability() {
		return availability;
	}

	public void setavailability(boolean availability) {
		this.availability = availability;
	}
	
	

	@Override
	public String toString() {
		return "Flight [id=" + id + ", name=" + name + ", cost=" + cost + ", ratings=" + ratings + ", available="
				+ availability + "]";
	}
	
	@Override
	public int compareTo(Flight o) {
		Integer id1 = this.id;
		Integer id2 = o.id;
		return id1.compareTo(id2);
	}
}
